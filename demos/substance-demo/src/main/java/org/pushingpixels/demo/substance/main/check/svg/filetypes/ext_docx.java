package org.pushingpixels.demo.substance.main.check.svg.filetypes;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.ref.WeakReference;
import java.util.Base64;
import javax.imageio.ImageIO;
import javax.swing.plaf.UIResource;

import org.pushingpixels.neon.api.icon.ResizableIcon;
import org.pushingpixels.neon.api.icon.ResizableIconUIResource;

/**
 * This class has been automatically generated using <a
 * href="https://github.com/kirill-grouchnikov/radiance">Photon SVG transcoder</a>.
 */
public class ext_docx implements ResizableIcon {
    

    @SuppressWarnings("unused")
	private void innerPaint(Graphics2D g) {
        Shape shape = null;
        Paint paint = null;
        Stroke stroke = null;
        Shape clip = null;

        float origAlpha = 1.0f;
        Composite origComposite = g.getComposite();
        if (origComposite instanceof AlphaComposite) {
            AlphaComposite origAlphaComposite = 
                (AlphaComposite)origComposite;
            if (origAlphaComposite.getRule() == AlphaComposite.SRC_OVER) {
                origAlpha = origAlphaComposite.getAlpha();
            }
        }
        
	    AffineTransform defaultTransform_ = g.getTransform();
// 
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0 = g.getTransform();
g.transform(new AffineTransform(0.009999999776482582f, 0.0f, 0.0f, 0.009999999776482582f, 0.13999999687075615f, -0.0f));
// _0
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_0 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_0
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(36.0, 3.005000114440918), new Point2D.Double(36.0, 101.0), new float[] {0.005f,0.056f,0.16f,0.274f,0.398f,0.539f,0.711f,1.0f}, new Color[] {new Color(0, 45, 68, 255),new Color(1, 56, 82, 255),new Color(10, 77, 107, 255),new Color(15, 94, 130, 255),new Color(15, 109, 150, 255),new Color(13, 119, 164, 255),new Color(10, 126, 174, 255),new Color(8, 129, 178, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(1, 65, 94, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(72.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 99.0);
((GeneralPath)shape).lineTo(0.0, 1.0);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_1);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_2 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_2
shape = new GeneralPath();
((GeneralPath)shape).moveTo(5.4, 75.3);
((GeneralPath)shape).lineTo(11.3, 75.3);
((GeneralPath)shape).curveTo(12.6, 75.3, 13.6, 75.4, 14.3, 75.600006);
((GeneralPath)shape).curveTo(15.2, 75.90001, 16.0, 76.40001, 16.7, 77.100006);
((GeneralPath)shape).curveTo(17.400002, 77.8, 17.900002, 78.600006, 18.2, 79.700005);
((GeneralPath)shape).curveTo(18.5, 80.700005, 18.7, 81.9, 18.7, 83.4);
((GeneralPath)shape).curveTo(18.7, 84.700005, 18.5, 85.8, 18.2, 86.8);
((GeneralPath)shape).curveTo(17.800001, 87.9, 17.2, 88.9, 16.5, 89.600006);
((GeneralPath)shape).curveTo(15.9, 90.100006, 15.2, 90.600006, 14.2, 90.90001);
((GeneralPath)shape).curveTo(13.5, 91.100006, 12.5, 91.20001, 11.4, 91.20001);
((GeneralPath)shape).lineTo(5.3999996, 91.20001);
((GeneralPath)shape).lineTo(5.3999996, 75.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(8.6, 78.0);
((GeneralPath)shape).lineTo(8.6, 88.4);
((GeneralPath)shape).lineTo(11.0, 88.4);
((GeneralPath)shape).curveTo(11.9, 88.4, 12.5, 88.4, 12.9, 88.200005);
((GeneralPath)shape).curveTo(13.4, 88.100006, 13.9, 87.9, 14.2, 87.50001);
((GeneralPath)shape).curveTo(14.5, 87.10001, 14.8, 86.700005, 15.0, 86.00001);
((GeneralPath)shape).curveTo(15.2, 85.30001, 15.3, 84.30001, 15.3, 83.100006);
((GeneralPath)shape).curveTo(15.3, 81.9, 15.2, 80.90001, 15.0, 80.3);
((GeneralPath)shape).curveTo(14.8, 79.600006, 14.5, 79.100006, 14.1, 78.8);
((GeneralPath)shape).curveTo(13.700001, 78.5, 13.200001, 78.200005, 12.6, 78.100006);
((GeneralPath)shape).curveTo(12.3, 78.00001, 11.400001, 78.00001, 10.1, 78.00001);
((GeneralPath)shape).lineTo(8.6, 78.00001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(20.8, 83.3);
((GeneralPath)shape).curveTo(20.8, 81.700005, 21.0, 80.3, 21.5, 79.3);
((GeneralPath)shape).curveTo(21.9, 78.5, 22.4, 77.8, 23.0, 77.100006);
((GeneralPath)shape).curveTo(23.6, 76.50001, 24.3, 76.00001, 25.1, 75.700005);
((GeneralPath)shape).curveTo(26.1, 75.3, 27.2, 75.100006, 28.5, 75.100006);
((GeneralPath)shape).curveTo(30.8, 75.100006, 32.7, 75.8, 34.1, 77.3);
((GeneralPath)shape).curveTo(35.499996, 78.8, 36.199997, 80.700005, 36.199997, 83.3);
((GeneralPath)shape).curveTo(36.199997, 85.8, 35.499996, 87.8, 34.1, 89.3);
((GeneralPath)shape).curveTo(32.699997, 90.700005, 30.8, 91.5, 28.499998, 91.5);
((GeneralPath)shape).curveTo(26.099998, 91.5, 24.3, 90.8, 22.899998, 89.4);
((GeneralPath)shape).curveTo(21.499998, 87.8, 20.799997, 85.8, 20.799997, 83.3);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(24.099998, 83.200005);
((GeneralPath)shape).curveTo(24.099998, 85.00001, 24.499998, 86.3, 25.3, 87.3);
((GeneralPath)shape).curveTo(26.099998, 88.200005, 27.199999, 88.700005, 28.5, 88.700005);
((GeneralPath)shape).curveTo(29.8, 88.700005, 30.8, 88.200005, 31.7, 87.3);
((GeneralPath)shape).curveTo(32.5, 86.4, 32.9, 85.0, 32.9, 83.200005);
((GeneralPath)shape).curveTo(32.9, 81.4, 32.5, 80.00001, 31.7, 79.200005);
((GeneralPath)shape).curveTo(30.900002, 78.4, 29.800001, 77.9, 28.5, 77.9);
((GeneralPath)shape).curveTo(27.2, 77.9, 26.1, 78.3, 25.3, 79.200005);
((GeneralPath)shape).curveTo(24.5, 80.00001, 24.099998, 81.4, 24.099998, 83.200005);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(48.899998, 85.3);
((GeneralPath)shape).lineTo(51.999996, 86.3);
((GeneralPath)shape).curveTo(51.499996, 88.0, 50.699997, 89.3, 49.599995, 90.100006);
((GeneralPath)shape).curveTo(48.499996, 90.90001, 47.099995, 91.40001, 45.399994, 91.40001);
((GeneralPath)shape).curveTo(43.299995, 91.40001, 41.599995, 90.70001, 40.199993, 89.30001);
((GeneralPath)shape).curveTo(38.79999, 87.90001, 38.199993, 85.90001, 38.199993, 83.40001);
((GeneralPath)shape).curveTo(38.199993, 80.80001, 38.899994, 78.70001, 40.29999, 77.30001);
((GeneralPath)shape).curveTo(41.699993, 75.90001, 43.499992, 75.10001, 45.699993, 75.10001);
((GeneralPath)shape).curveTo(47.599995, 75.10001, 49.199993, 75.70001, 50.399994, 76.80001);
((GeneralPath)shape).curveTo(51.099995, 77.50001, 51.699993, 78.40001, 51.999992, 79.70001);
((GeneralPath)shape).lineTo(48.79999, 80.500015);
((GeneralPath)shape).curveTo(48.59999, 79.70001, 48.199993, 79.000015, 47.59999, 78.60001);
((GeneralPath)shape).curveTo(46.999992, 78.10001, 46.29999, 77.90002, 45.39999, 77.90002);
((GeneralPath)shape).curveTo(44.19999, 77.90002, 43.29999, 78.30002, 42.49999, 79.20002);
((GeneralPath)shape).curveTo(41.799988, 80.00002, 41.39999, 81.40002, 41.39999, 83.30002);
((GeneralPath)shape).curveTo(41.39999, 85.30002, 41.79999, 86.70002, 42.49999, 87.60002);
((GeneralPath)shape).curveTo(43.199986, 88.50002, 44.19999, 88.900024, 45.299988, 88.900024);
((GeneralPath)shape).curveTo(46.19999, 88.900024, 46.899986, 88.60002, 47.49999, 88.10002);
((GeneralPath)shape).curveTo(48.19999, 87.30002, 48.69999, 86.400024, 48.89999, 85.30002);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(53.199997, 91.100006);
((GeneralPath)shape).lineTo(58.6, 82.90001);
((GeneralPath)shape).lineTo(53.699997, 75.40001);
((GeneralPath)shape).lineTo(57.499996, 75.40001);
((GeneralPath)shape).lineTo(60.699997, 80.50001);
((GeneralPath)shape).lineTo(63.799995, 75.40001);
((GeneralPath)shape).lineTo(67.49999, 75.40001);
((GeneralPath)shape).lineTo(62.499992, 83.00001);
((GeneralPath)shape).lineTo(67.899994, 91.100006);
((GeneralPath)shape).lineTo(64.0, 91.100006);
((GeneralPath)shape).lineTo(60.5, 85.700005);
((GeneralPath)shape).lineTo(57.0, 91.100006);
((GeneralPath)shape).lineTo(53.2, 91.100006);
((GeneralPath)shape).closePath();
paint = new Color(255, 255, 255, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(64.4, 25.7);
((GeneralPath)shape).curveTo(63.9, 25.7, 63.4, 25.900002, 63.0, 26.0);
((GeneralPath)shape).curveTo(62.5, 26.2, 62.0, 26.4, 61.6, 26.6);
((GeneralPath)shape).curveTo(60.899998, 27.0, 60.399998, 27.4, 60.1, 27.9);
((GeneralPath)shape).curveTo(59.8, 28.4, 59.5, 29.0, 59.3, 29.6);
((GeneralPath)shape).curveTo(58.399998, 32.0, 57.1, 35.6, 55.3, 40.9);
((GeneralPath)shape).curveTo(53.5, 46.0, 51.7, 51.4, 49.7, 56.9);
((GeneralPath)shape).lineTo(45.0, 56.9);
((GeneralPath)shape).lineTo(36.3, 32.5);
((GeneralPath)shape).lineTo(28.4, 56.9);
((GeneralPath)shape).lineTo(23.7, 56.9);
((GeneralPath)shape).curveTo(21.1, 49.4, 19.1, 43.600002, 17.7, 39.7);
((GeneralPath)shape).curveTo(16.300001, 35.600002, 15.200001, 32.3, 14.200001, 29.5);
((GeneralPath)shape).curveTo(13.900001, 28.7, 13.6, 28.1, 13.200001, 27.7);
((GeneralPath)shape).curveTo(12.800001, 27.300001, 12.300001, 26.900002, 11.800001, 26.5);
((GeneralPath)shape).curveTo(11.400002, 26.2, 10.900002, 26.0, 10.500001, 25.9);
((GeneralPath)shape).curveTo(10.000001, 25.8, 9.500001, 25.699999, 8.900001, 25.6);
((GeneralPath)shape).lineTo(8.900001, 23.800001);
((GeneralPath)shape).lineTo(26.5, 23.800001);
((GeneralPath)shape).lineTo(26.5, 25.6);
((GeneralPath)shape).curveTo(25.5, 25.7, 24.7, 25.800001, 24.2, 26.0);
((GeneralPath)shape).curveTo(23.7, 26.1, 23.300001, 26.2, 23.0, 26.4);
((GeneralPath)shape).curveTo(22.7, 26.5, 22.5, 26.699999, 22.5, 26.8);
((GeneralPath)shape).curveTo(22.4, 26.9, 22.4, 27.099998, 22.4, 27.199999);
((GeneralPath)shape).curveTo(22.4, 27.4, 22.4, 27.599998, 22.5, 27.8);
((GeneralPath)shape).curveTo(22.6, 28.0, 22.6, 28.199999, 22.7, 28.5);
((GeneralPath)shape).curveTo(23.1, 29.7, 23.800001, 32.0, 25.0, 35.3);
((GeneralPath)shape).curveTo(26.1, 38.7, 27.5, 42.8, 29.2, 47.8);
((GeneralPath)shape).lineTo(36.7, 24.0);
((GeneralPath)shape).lineTo(41.600002, 24.0);
((GeneralPath)shape).lineTo(50.300003, 48.5);
((GeneralPath)shape).curveTo(51.600002, 44.5, 52.600002, 41.3, 53.4, 38.8);
((GeneralPath)shape).curveTo(54.2, 36.3, 54.800003, 34.1, 55.300003, 32.399998);
((GeneralPath)shape).curveTo(55.600002, 31.299997, 55.9, 30.399998, 56.000004, 29.599998);
((GeneralPath)shape).curveTo(56.200005, 28.899998, 56.300003, 28.199999, 56.300003, 27.699999);
((GeneralPath)shape).curveTo(56.300003, 27.4, 56.100002, 27.099998, 55.800003, 26.9);
((GeneralPath)shape).curveTo(55.500004, 26.699999, 55.100002, 26.5, 54.600002, 26.3);
((GeneralPath)shape).curveTo(54.2, 26.199999, 53.600002, 26.0, 52.9, 26.0);
((GeneralPath)shape).curveTo(52.2, 25.9, 51.600002, 25.8, 51.100002, 25.8);
((GeneralPath)shape).lineTo(51.100002, 23.8);
((GeneralPath)shape).lineTo(64.4, 23.8);
((GeneralPath)shape).lineTo(64.4, 25.699999);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(18.121000289916992, 50.46799850463867), new Point2D.Double(55.04100036621094, 87.38899993896484), new float[] {0.005f,0.116f,0.239f,0.369f,0.502f,0.639f,0.779f,0.918f,1.0f}, new Color[] {new Color(0, 97, 134, 255),new Color(0, 95, 131, 255),new Color(0, 90, 125, 255),new Color(0, 83, 115, 255),new Color(0, 72, 101, 255),new Color(0, 57, 83, 255),new Color(0, 37, 60, 255),new Color(0, 3, 29, 255),new Color(0, 0, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(45.069000244140625, 74.20500183105469), new Point2D.Double(58.569000244140625, 87.70500183105469), new float[] {0.005f,0.3f,0.443f,0.553f,0.647f,0.73f,0.805f,0.875f,0.938f,0.998f,1.0f}, new Color[] {new Color(223, 241, 250, 255),new Color(220, 238, 247, 255),new Color(211, 228, 239, 255),new Color(196, 214, 227, 255),new Color(177, 197, 213, 255),new Color(154, 176, 197, 255),new Color(129, 154, 179, 255),new Color(100, 130, 159, 255),new Color(66, 108, 140, 255),new Color(6, 87, 122, 255),new Color(1, 86, 121, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 102.0f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(1, 65, 94, 255);
stroke = new BasicStroke(2.0f,0,2,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.0, 1.0);
((GeneralPath)shape).lineTo(72.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 27.7);
((GeneralPath)shape).lineTo(45.0, 1.0);
((GeneralPath)shape).closePath();
g.setPaint(paint);
g.setStroke(stroke);
g.draw(shape);
g.setTransform(defaultTransform__0_5);
g.setTransform(defaultTransform__0);
g.setTransform(defaultTransform_);

	}

    /**
     * Returns the X of the bounding box of the original SVG image.
     * 
     * @return The X of the bounding box of the original SVG image.
     */
    public static double getOrigX() {
        return 0.12999999523162842;
    }

    /**
     * Returns the Y of the bounding box of the original SVG image.
     * 
     * @return The Y of the bounding box of the original SVG image.
     */
    public static double getOrigY() {
        return 0.0;
    }

	/**
	 * Returns the width of the bounding box of the original SVG image.
	 * 
	 * @return The width of the bounding box of the original SVG image.
	 */
	public static double getOrigWidth() {
		return 0.7400000095367432;
	}

	/**
	 * Returns the height of the bounding box of the original SVG image.
	 * 
	 * @return The height of the bounding box of the original SVG image.
	 */
	public static double getOrigHeight() {
		return 1.0;
	}

	/** The current width of this resizable icon. */
	private int width;

    /** The current height of this resizable icon. */
	private int height;

	/**
	 * Creates a new transcoded SVG image. This is marked as private to indicate that app
	 * code should be using the {@link #of(int, int)} method to obtain a pre-configured instance.
	 */
	private ext_docx() {
        this.width = (int) getOrigWidth();
        this.height = (int) getOrigHeight();
	}

    @Override
	public int getIconHeight() {
		return height;
	}

    @Override
	public int getIconWidth() {
		return width;
	}

	@Override
	public void setDimension(Dimension newDimension) {
		this.width = newDimension.width;
		this.height = newDimension.height;
	}

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BICUBIC);
		g2d.translate(x, y);

        double coef1 = (double) this.width / getOrigWidth();
        double coef2 = (double) this.height / getOrigHeight();
        double coef = Math.min(coef1, coef2);
        g2d.clipRect(0, 0, this.width, this.height);
        g2d.scale(coef, coef);
        g2d.translate(-getOrigX(), -getOrigY());
        if (coef1 != coef2) {
            if (coef1 < coef2) {
               int extraDy = (int) ((getOrigWidth() - getOrigHeight()) / 2.0);
               g2d.translate(0, extraDy);
            } else {
               int extraDx = (int) ((getOrigHeight() - getOrigWidth()) / 2.0);
               g2d.translate(extraDx, 0);
            }
        }
        Graphics2D g2ForInner = (Graphics2D) g2d.create();
        innerPaint(g2ForInner);
        g2ForInner.dispose();
        g2d.dispose();
	}
    
    /**
     * Returns a new instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new instance of this icon with specified dimensions.
     */
    public static ResizableIcon of(int width, int height) {
       ext_docx base = new ext_docx();
       base.width = width;
       base.height = height;
       return base;
    }

    /**
     * Returns a new {@link UIResource} instance of this icon with specified dimensions.
     *
     * @param width Required width of the icon
     * @param height Required height of the icon
     * @return A new {@link UIResource} instance of this icon with specified dimensions.
     */
    public static ResizableIconUIResource uiResourceOf(int width, int height) {
       ext_docx base = new ext_docx();
       base.width = width;
       base.height = height;
       return new ResizableIconUIResource(base);
    }

    /**
     * Returns a factory that returns instances of this icon on demand.
     *
     * @return Factory that returns instances of this icon on demand.
     */
    public static Factory factory() {
        return ext_docx::new;
    }
}

