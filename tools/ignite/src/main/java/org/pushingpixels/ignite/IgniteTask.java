/*
 * Copyright (c) 2005-2019 Radiance Kirill Grouchnikov. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  o Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  o Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 *  o Neither the name of the copyright holder nor the names of
 *    its contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.pushingpixels.ignite;

import org.gradle.api.DefaultTask;
import org.gradle.api.logging.Logger;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.tasks.options.Option;
import org.pushingpixels.photon.api.transcoder.LanguageRenderer;
import org.pushingpixels.photon.api.transcoder.SvgBatchConverter;
import org.pushingpixels.photon.api.transcoder.SvgTranscoder;
import org.pushingpixels.photon.api.transcoder.TranscoderListener;
import org.pushingpixels.photon.api.transcoder.java.JavaLanguageRenderer;
import org.pushingpixels.photon.api.transcoder.kotlin.KotlinLanguageRenderer;

import java.io.File;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.concurrent.CountDownLatch;

public class IgniteTask extends DefaultTask {
    private String outputPackageName;

    private String outputLanguage;

    private String outputClassNamePrefix = "";

    private boolean useResizableTemplate;

    private File inputDirectory;

    private File outputDirectory;

    @Input
    public String getOutputPackageName() {
        return outputPackageName;
    }

    @Option(option = "outputPackageName", description = "Configures the output package name.")
    public void setOutputPackageName(String outputPackageName) {
        this.outputPackageName = outputPackageName;
    }

    @Input
    public String getOutputLanguage() {
        return outputLanguage;
    }

    @Option(option = "outputPackageName", description = "Configures the output package name.")
    public void setOutputLanguage(String outputLanguage) {
        this.outputLanguage = outputLanguage;
    }

    @Input
    public String getOutputClassNamePrefix() {
        return outputClassNamePrefix;
    }

    @Option(option = "outputClassNamePrefix", description = "Configures the output class name prefix.")
    public void setOutputClassNamePrefix(String outputClassNamePrefix) {
        this.outputClassNamePrefix = outputClassNamePrefix;
    }

    @Input
    public boolean isUseResizableTemplate() {
        return useResizableTemplate;
    }

    @Option(option = "useResizableTemplate", description = "Configures the usage of resizable template.")
    public void setUseResizableTemplate(boolean useResizableTemplate) {
        this.useResizableTemplate = useResizableTemplate;
    }

    @InputDirectory
    public File getInputDirectory() {
        return inputDirectory;
    }

    @Option(option = "inputDirectory", description = "Configures the input directory.")
    public void setInputDirectory(File inputDirectory) {
        this.inputDirectory = inputDirectory;
    }

    @InputDirectory
    public File getOutputDirectory() {
        return outputDirectory;
    }

    @Option(option = "outputDirectory", description = "Configures the output directory.")
    public void setOutputDirectory(File outputDirectory) {
        this.outputDirectory = outputDirectory;
    }

    @TaskAction
    public void transcode() {
        Logger logger = getLogger();

        logger.trace("Working on files in " + inputDirectory.getAbsolutePath());

        if (!this.inputDirectory.exists()) {
            return;
        }

        this.outputDirectory.mkdirs();

        boolean renderAsKotlinCode = ("kotlin".compareTo(outputLanguage) == 0);

        LanguageRenderer languageRenderer = renderAsKotlinCode
                ? new KotlinLanguageRenderer()
                : new JavaLanguageRenderer();
        String outputFileNameExtension = ("java".compareTo(outputLanguage) == 0) ? ".java" : ".kt";

        logger.trace("Processing " + inputDirectory.getAbsolutePath() + " to " + outputPackageName +
                " in " + outputLanguage);

        String templateFileName = "/org/pushingpixels/photon/api/transcoder/" + outputLanguage + "/"
                + "SvgTranscoderTemplate";
        templateFileName += (useResizableTemplate ? "Resizable" : "Plain");
        templateFileName += ".templ";

        File[] svgFiles = inputDirectory.listFiles(
                (File dir, String name) -> name.endsWith(".svg"));
        if (svgFiles != null) {
            for (File file : svgFiles) {
                String svgClassName = outputClassNamePrefix
                        + file.getName().substring(0, file.getName().length() - 4);
                svgClassName = svgClassName.replace('-', '_');
                svgClassName = svgClassName.replace(' ', '_');
                String classFilename =
                        outputDirectory + File.separator + svgClassName + outputFileNameExtension;

                logger.trace("Processing " + file.getName());

                try (PrintWriter pw = new PrintWriter(classFilename);
                     InputStream templateStream = SvgBatchConverter.class
                             .getResourceAsStream(templateFileName)) {
                    if (templateStream == null) {
                        logger.error("Couldn't load " + templateFileName);
                        return;
                    }

                    final CountDownLatch latch = new CountDownLatch(1);

                    SvgTranscoder transcoder = new SvgTranscoder(file.toURI().toURL().toString(),
                            svgClassName, languageRenderer);
                    transcoder.setPackageName(outputPackageName);
                    transcoder.setListener(new TranscoderListener() {
                        public Writer getWriter() {
                            return pw;
                        }

                        public void finished() {
                            latch.countDown();
                        }
                    });
                    transcoder.transcode(templateStream);
                    latch.await();
                } catch (Exception e) {
                    logger.error("Transcoding failed", e);
                }
            }
        }
    }
}