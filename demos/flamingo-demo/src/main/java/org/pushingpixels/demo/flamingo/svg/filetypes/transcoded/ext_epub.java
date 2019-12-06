package org.pushingpixels.demo.flamingo.svg.filetypes.transcoded;

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
public class ext_epub implements ResizableIcon {
    

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
((GeneralPath)shape).moveTo(45.3, 1.0);
((GeneralPath)shape).lineTo(72.4, 27.7);
((GeneralPath)shape).lineTo(72.4, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.3, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(486.3110046386719, 644.1119995117188), new Point2D.Double(486.30999755859375, 742.0850219726562), new float[] {0.0f,0.005f,1.0f}, new Color[] {new Color(116, 45, 45, 255),new Color(130, 113, 0, 255),new Color(255, 238, 145, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_0);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_1 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_1
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.3, 1.0);
((GeneralPath)shape).lineTo(72.4, 27.7);
((GeneralPath)shape).lineTo(72.4, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.3, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,0,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.3, 1.0);
((GeneralPath)shape).lineTo(72.4, 27.7);
((GeneralPath)shape).lineTo(72.4, 99.0);
((GeneralPath)shape).lineTo(0.1, 99.0);
((GeneralPath)shape).lineTo(0.1, 1.0);
((GeneralPath)shape).lineTo(45.3, 1.0);
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
((GeneralPath)shape).moveTo(7.2, 91.6);
((GeneralPath)shape).lineTo(7.2, 76.0);
((GeneralPath)shape).lineTo(18.9, 76.0);
((GeneralPath)shape).lineTo(18.9, 78.6);
((GeneralPath)shape).lineTo(10.4, 78.6);
((GeneralPath)shape).lineTo(10.4, 82.1);
((GeneralPath)shape).lineTo(18.3, 82.1);
((GeneralPath)shape).lineTo(18.3, 84.7);
((GeneralPath)shape).lineTo(10.4, 84.7);
((GeneralPath)shape).lineTo(10.4, 89.0);
((GeneralPath)shape).lineTo(19.2, 89.0);
((GeneralPath)shape).lineTo(19.2, 91.6);
((GeneralPath)shape).lineTo(7.200001, 91.6);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(21.9, 91.6);
((GeneralPath)shape).lineTo(21.9, 76.0);
((GeneralPath)shape).lineTo(27.0, 76.0);
((GeneralPath)shape).curveTo(28.9, 76.0, 30.2, 76.1, 30.8, 76.2);
((GeneralPath)shape).curveTo(31.699999, 76.399994, 32.5, 76.899994, 33.1, 77.7);
((GeneralPath)shape).curveTo(33.699997, 78.5, 34.0, 79.5, 34.0, 80.7);
((GeneralPath)shape).curveTo(34.0, 81.7, 33.8, 82.5, 33.5, 83.1);
((GeneralPath)shape).curveTo(33.2, 83.7, 32.7, 84.299995, 32.2, 84.6);
((GeneralPath)shape).curveTo(31.7, 85.0, 31.1, 85.2, 30.5, 85.299995);
((GeneralPath)shape).curveTo(29.7, 85.399994, 28.6, 85.49999, 27.2, 85.49999);
((GeneralPath)shape).lineTo(25.1, 85.49999);
((GeneralPath)shape).lineTo(25.1, 91.399994);
((GeneralPath)shape).lineTo(21.9, 91.399994);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(25.1, 78.6);
((GeneralPath)shape).lineTo(25.1, 83.0);
((GeneralPath)shape).lineTo(26.800001, 83.0);
((GeneralPath)shape).curveTo(28.1, 83.0, 28.900002, 82.9, 29.300001, 82.8);
((GeneralPath)shape).curveTo(29.7, 82.600006, 30.1, 82.4, 30.300001, 82.0);
((GeneralPath)shape).curveTo(30.500002, 81.7, 30.7, 81.2, 30.7, 80.8);
((GeneralPath)shape).curveTo(30.7, 80.200005, 30.5, 79.8, 30.2, 79.4);
((GeneralPath)shape).curveTo(29.900002, 79.0, 29.400002, 78.8, 28.900002, 78.700005);
((GeneralPath)shape).curveTo(28.500002, 78.600006, 27.800001, 78.600006, 26.600002, 78.600006);
((GeneralPath)shape).lineTo(25.100002, 78.600006);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(36.6, 76.0);
((GeneralPath)shape).lineTo(39.8, 76.0);
((GeneralPath)shape).lineTo(39.8, 84.4);
((GeneralPath)shape).curveTo(39.8, 85.700005, 39.8, 86.6, 39.899998, 87.0);
((GeneralPath)shape).curveTo(39.999996, 87.6, 40.399998, 88.1, 40.899998, 88.5);
((GeneralPath)shape).curveTo(41.399998, 88.9, 42.1, 89.1, 42.999996, 89.1);
((GeneralPath)shape).curveTo(43.899998, 89.1, 44.599995, 88.9, 44.999996, 88.6);
((GeneralPath)shape).curveTo(45.499996, 88.2, 45.699997, 87.799995, 45.799995, 87.299995);
((GeneralPath)shape).curveTo(45.899994, 86.799995, 45.899994, 85.899994, 45.899994, 84.7);
((GeneralPath)shape).lineTo(45.899994, 76.0);
((GeneralPath)shape).lineTo(49.099995, 76.0);
((GeneralPath)shape).lineTo(49.099995, 84.2);
((GeneralPath)shape).curveTo(49.099995, 86.1, 48.999996, 87.399994, 48.799995, 88.2);
((GeneralPath)shape).curveTo(48.599995, 89.0, 48.299995, 89.6, 47.799995, 90.2);
((GeneralPath)shape).curveTo(47.299995, 90.7, 46.699997, 91.2, 45.899994, 91.5);
((GeneralPath)shape).curveTo(45.09999, 91.8, 44.099995, 92.0, 42.899994, 92.0);
((GeneralPath)shape).curveTo(41.399994, 92.0, 40.199993, 91.8, 39.499992, 91.5);
((GeneralPath)shape).curveTo(38.699993, 91.2, 38.09999, 90.7, 37.699993, 90.2);
((GeneralPath)shape).curveTo(37.199993, 89.7, 36.899994, 89.1, 36.79999, 88.5);
((GeneralPath)shape).curveTo(36.59999, 87.6, 36.499992, 86.3, 36.499992, 84.5);
((GeneralPath)shape).lineTo(36.499992, 76.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(52.6, 76.0);
((GeneralPath)shape).lineTo(58.899998, 76.0);
((GeneralPath)shape).curveTo(60.1, 76.0, 61.1, 76.1, 61.699997, 76.2);
((GeneralPath)shape).curveTo(62.299995, 76.299995, 62.899998, 76.5, 63.299995, 76.799995);
((GeneralPath)shape).curveTo(63.699993, 77.09999, 64.2, 77.6, 64.49999, 78.1);
((GeneralPath)shape).curveTo(64.799995, 78.6, 64.99999, 79.299995, 64.99999, 79.9);
((GeneralPath)shape).curveTo(64.99999, 80.6, 64.799995, 81.3, 64.399994, 81.9);
((GeneralPath)shape).curveTo(63.999992, 82.5, 63.499992, 83.0, 62.799995, 83.3);
((GeneralPath)shape).curveTo(63.799995, 83.600006, 64.49999, 84.0, 64.99999, 84.700005);
((GeneralPath)shape).curveTo(65.49999, 85.40001, 65.799995, 86.100006, 65.799995, 87.00001);
((GeneralPath)shape).curveTo(65.799995, 87.700005, 65.6, 88.40001, 65.299995, 89.100006);
((GeneralPath)shape).curveTo(64.99999, 89.8, 64.49999, 90.3, 63.899994, 90.700005);
((GeneralPath)shape).curveTo(63.299995, 91.100006, 62.599995, 91.3, 61.799995, 91.4);
((GeneralPath)shape).curveTo(61.299995, 91.5, 59.999996, 91.5, 57.999996, 91.5);
((GeneralPath)shape).lineTo(52.599995, 91.5);
((GeneralPath)shape).lineTo(52.599995, 76.0);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(55.8, 78.6);
((GeneralPath)shape).lineTo(55.8, 82.2);
((GeneralPath)shape).lineTo(57.899998, 82.2);
((GeneralPath)shape).curveTo(59.1, 82.2, 59.899998, 82.2, 60.199997, 82.1);
((GeneralPath)shape).curveTo(60.699997, 82.0, 61.199997, 81.9, 61.499996, 81.5);
((GeneralPath)shape).curveTo(61.799995, 81.1, 61.999996, 80.8, 61.999996, 80.3);
((GeneralPath)shape).curveTo(61.999996, 79.8, 61.899998, 79.4, 61.599995, 79.100006);
((GeneralPath)shape).curveTo(61.299995, 78.8, 60.899994, 78.600006, 60.399994, 78.600006);
((GeneralPath)shape).curveTo(60.099995, 78.600006, 59.199993, 78.50001, 57.699993, 78.50001);
((GeneralPath)shape).lineTo(55.79999, 78.50001);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(55.8, 84.799995);
((GeneralPath)shape).lineTo(55.8, 89.0);
((GeneralPath)shape).lineTo(58.8, 89.0);
((GeneralPath)shape).curveTo(59.899998, 89.0, 60.7, 89.0, 61.0, 88.9);
((GeneralPath)shape).curveTo(61.5, 88.8, 61.9, 88.6, 62.2, 88.3);
((GeneralPath)shape).curveTo(62.5, 88.0, 62.600002, 87.5, 62.600002, 87.0);
((GeneralPath)shape).curveTo(62.600002, 86.5, 62.500004, 86.1, 62.300003, 85.8);
((GeneralPath)shape).curveTo(62.100002, 85.5, 61.700005, 85.200005, 61.300003, 85.100006);
((GeneralPath)shape).curveTo(60.9, 85.00001, 59.9, 84.90001, 58.500004, 84.90001);
((GeneralPath)shape).lineTo(55.800003, 84.90001);
((GeneralPath)shape).closePath();
paint = new Color(254, 254, 254, 255);
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_2);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_3 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_3
shape = new GeneralPath();
((GeneralPath)shape).moveTo(62.7, 34.5);
((GeneralPath)shape).curveTo(62.4, 33.8, 62.0, 33.3, 61.4, 32.8);
((GeneralPath)shape).curveTo(61.300003, 33.3, 61.100002, 33.899998, 60.800003, 34.399998);
((GeneralPath)shape).lineTo(44.4, 59.6);
((GeneralPath)shape).curveTo(43.800003, 60.5, 42.4, 60.8, 41.4, 60.5);
((GeneralPath)shape).lineTo(15.300001, 53.2);
((GeneralPath)shape).curveTo(13.700001, 52.8, 11.900002, 51.9, 11.800001, 50.100002);
((GeneralPath)shape).curveTo(11.700001, 49.4, 11.800001, 49.2, 12.200001, 48.9);
((GeneralPath)shape).curveTo(12.6, 48.600002, 13.000001, 48.7, 13.400001, 48.800003);
((GeneralPath)shape).lineTo(38.0, 55.6);
((GeneralPath)shape).curveTo(41.6, 56.6, 42.6, 55.899998, 45.2, 51.899998);
((GeneralPath)shape).lineTo(60.2, 28.799997);
((GeneralPath)shape).curveTo(61.0, 27.599997, 61.2, 26.199997, 60.7, 24.999998);
((GeneralPath)shape).curveTo(60.3, 23.799997, 59.3, 22.899998, 57.9, 22.499998);
((GeneralPath)shape).lineTo(36.4, 16.499998);
((GeneralPath)shape).curveTo(35.9, 16.399998, 35.4, 16.399998, 34.9, 16.299997);
((GeneralPath)shape).lineTo(35.0, 16.199997);
((GeneralPath)shape).curveTo(31.7, 14.199997, 30.4, 17.999996, 28.7, 19.399998);
((GeneralPath)shape).curveTo(28.1, 19.899998, 27.2, 20.299997, 27.0, 20.799997);
((GeneralPath)shape).curveTo(26.8, 21.299997, 26.9, 21.799997, 26.7, 22.299997);
((GeneralPath)shape).curveTo(26.1, 23.699997, 24.2, 26.099997, 23.300001, 26.799997);
((GeneralPath)shape).curveTo(22.7, 27.199997, 22.000002, 27.299997, 21.6, 27.899998);
((GeneralPath)shape).curveTo(21.300001, 28.299997, 21.4, 28.999998, 21.2, 29.599998);
((GeneralPath)shape).curveTo(20.7, 30.899998, 19.0, 33.1, 17.800001, 34.199997);
((GeneralPath)shape).curveTo(17.400002, 34.6, 16.7, 34.899998, 16.400002, 35.399998);
((GeneralPath)shape).curveTo(16.100002, 35.8, 16.2, 36.499996, 15.900002, 36.999996);
((GeneralPath)shape).curveTo(15.200002, 38.399998, 13.600001, 40.399998, 12.300001, 41.499996);
((GeneralPath)shape).curveTo(11.600001, 42.099995, 10.900002, 42.399998, 10.600001, 43.099995);
((GeneralPath)shape).curveTo(10.400002, 43.399994, 10.600001, 43.899994, 10.400002, 44.299995);
((GeneralPath)shape).curveTo(10.100001, 44.999996, 9.800001, 45.499996, 9.600001, 45.999996);
((GeneralPath)shape).curveTo(8.900002, 46.999996, 8.500001, 48.199997, 8.600001, 49.599995);
((GeneralPath)shape).curveTo(8.800001, 52.799995, 11.300001, 55.899994, 14.100001, 56.699993);
((GeneralPath)shape).lineTo(40.3, 64.0);
((GeneralPath)shape).curveTo(42.7, 64.7, 45.8, 63.5, 47.1, 61.4);
((GeneralPath)shape).lineTo(62.1, 38.300003);
((GeneralPath)shape).curveTo(62.899998, 37.000004, 63.1, 35.700005, 62.699997, 34.500004);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(32.5, 26.2);
((GeneralPath)shape).lineTo(33.6, 24.6);
((GeneralPath)shape).curveTo(33.899998, 24.1, 34.6, 23.9, 35.0, 24.0);
((GeneralPath)shape).lineTo(52.2, 28.8);
((GeneralPath)shape).curveTo(52.7, 28.9, 52.9, 29.4, 52.600002, 29.9);
((GeneralPath)shape).lineTo(51.500004, 31.5);
((GeneralPath)shape).curveTo(51.200005, 32.0, 50.500004, 32.2, 50.100002, 32.1);
((GeneralPath)shape).lineTo(32.9, 27.3);
((GeneralPath)shape).curveTo(32.4, 27.099998, 32.2, 26.599998, 32.5, 26.199999);
((GeneralPath)shape).closePath();
((GeneralPath)shape).moveTo(28.1, 32.600002);
((GeneralPath)shape).lineTo(29.2, 31.000002);
((GeneralPath)shape).curveTo(29.5, 30.500002, 30.2, 30.300001, 30.6, 30.400002);
((GeneralPath)shape).lineTo(47.800003, 35.2);
((GeneralPath)shape).curveTo(48.300003, 35.3, 48.500004, 35.8, 48.200005, 36.3);
((GeneralPath)shape).lineTo(47.100006, 37.899998);
((GeneralPath)shape).curveTo(46.800007, 38.399998, 46.100006, 38.6, 45.700005, 38.499996);
((GeneralPath)shape).lineTo(28.500004, 33.699997);
((GeneralPath)shape).curveTo(28.000004, 33.6, 27.800003, 33.1, 28.100004, 32.6);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(305.1709899902344, 859.4439697265625), new Point2D.Double(305.1709899902344, 814.6840209960938), new float[] {0.0f,1.0f}, new Color[] {new Color(170, 148, 0, 255),new Color(86, 74, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(0.9622655009227857f, 0.27211230353260446f, 0.27211230353260446f, -0.9622655009227857f, -485.17203323389003f, 762.9451758873668f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_3);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_4 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_4
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.3, 1.0);
((GeneralPath)shape).lineTo(72.4, 27.7);
((GeneralPath)shape).lineTo(45.3, 27.7);
((GeneralPath)shape).lineTo(45.3, 1.0);
((GeneralPath)shape).closePath();
paint = new LinearGradientPaint(new Point2D.Double(495.43701171875, 715.27099609375), new Point2D.Double(508.98199462890625, 728.8179931640625), new float[] {0.0f,1.0f}, new Color[] {new Color(254, 234, 134, 255),new Color(134, 114, 0, 255)}, MultipleGradientPaint.CycleMethod.NO_CYCLE, MultipleGradientPaint.ColorSpaceType.SRGB, new AffineTransform(1.0f, 0.0f, 0.0f, -1.0f, -450.0610046386719f, 743.1090087890625f));
g.setPaint(paint);
g.fill(shape);
g.setTransform(defaultTransform__0_4);
g.setComposite(AlphaComposite.getInstance(3, 1.0f * origAlpha));
AffineTransform defaultTransform__0_5 = g.getTransform();
g.transform(new AffineTransform(1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f));
// _0_5
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.3, 1.0);
((GeneralPath)shape).lineTo(72.4, 27.7);
((GeneralPath)shape).lineTo(45.3, 27.7);
((GeneralPath)shape).lineTo(45.3, 1.0);
((GeneralPath)shape).closePath();
paint = new Color(0, 0, 0, 0);
g.setPaint(paint);
g.fill(shape);
paint = new Color(130, 113, 0, 255);
stroke = new BasicStroke(2.0f,0,1,4.0f,null,0.0f);
shape = new GeneralPath();
((GeneralPath)shape).moveTo(45.3, 1.0);
((GeneralPath)shape).lineTo(72.4, 27.7);
((GeneralPath)shape).lineTo(45.3, 27.7);
((GeneralPath)shape).lineTo(45.3, 1.0);
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
        return 0.13099998235702515;
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
		return 0.7437919974327087;
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
	private ext_epub() {
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
       ext_epub base = new ext_epub();
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
       ext_epub base = new ext_epub();
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
        return ext_epub::new;
    }
}

