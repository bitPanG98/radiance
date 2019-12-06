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
package org.pushingpixels.demo.torch.swing.tracker

import org.pushingpixels.meteor.awt.render
import org.pushingpixels.torch.from
import org.pushingpixels.torch.timeline
import java.awt.Color
import java.awt.Graphics
import java.awt.Point
import java.awt.RenderingHints
import javax.swing.JComponent

class TimelineVisualizer : JComponent() {
    private val dots: MutableList<TimelineVisualizerDot> = ArrayList()

    fun addDot(absoluteTimelinePosition: Float, perceivedTimelinePosition: Float) {
        synchronized(this.dots) {
            val dot = TimelineVisualizerDot()
            dot.location = Point((absoluteTimelinePosition * width).toInt(),
                    (perceivedTimelinePosition * height).toInt())
            this.dots.add(dot)

            dot.timeline {
                property(dot::opacity from 1.0f to 0.0f)
                onTimelineDone {
                    synchronized(dots) {
                        dots.remove(dot)
                    }
                }
                duration = 10000
            }.play()
        }
    }

    override fun paintComponent(g: Graphics) {
        g.render {
            it.color = Color.black
            it.fillRect(0, 0, width, height)

            it.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)

            synchronized(this.dots) {
                for (dot in this.dots) {
                    dot.paint(it)
                }
            }
        }
    }
}
