/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testGreenFilter() {

        GreenFilter bitmapImageTest1 = new GreenFilter("C:\\Users\\Aseel N Albanna\\bitmap-transformer\\app\\src\\main\\resources\\a.bmp", "C:\\Users\\Aseel N Albanna\\bitmap-transformer\\app\\src\\main\\resources\\a.bmpaGreen.png");
        bitmapImageTest1.readBitmapFile();
        bitmapImageTest1.greenFilterConverter();
        assertEquals("expected true returned false", true, bitmapImageTest1.writeBitmapFile());
    }
    @Test public void testGrayScale() {
        greyScal bitmapImageTest2 = new greyScal("C:\\Users\\Aseel N Albanna\\bitmap-transformer\\app\\src\\main\\resources\\a.bmp", "C:\\Users\\Aseel N Albanna\\bitmap-transformer\\app\\src\\main\\resources\\aGray.png");
        bitmapImageTest2.readBitmapFile();
        bitmapImageTest2.grayScaleConvertor();
        assertEquals("expected true returned false", true, bitmapImageTest2.writeBitmapFile());
    }
    @Test public void testInverted() {
        inverTransformation bitmapImageTest3 = new inverTransformation("C:\\Users\\Aseel N Albanna\\bitmap-transformer\\app\\src\\main\\resources\\a.bmp", "C:\\Users\\Aseel N Albanna\\bitmap-transformer\\app\\src\\main\\resources\\aInverted.png");
        bitmapImageTest3.readBitmapFile();
        bitmapImageTest3.convertToInvert();
        assertEquals("expected true returned false", true, bitmapImageTest3.writeBitmapFile());
    }
    @Test public void testBlackBars() {
        VerticalBlackBars bitmapImageTest4=new VerticalBlackBars("C:\\Users\\Aseel N Albanna\\bitmap-transformer\\app\\src\\main\\resources\\a.bmp" ,"C:\\Users\\Aseel N Albanna\\bitmap-transformer\\app\\src\\main\\resources\\aBars.png");
        bitmapImageTest4.readBitmapFile();
        bitmapImageTest4.blackBarsConverter();
        assertEquals("expected true returned false",true, bitmapImageTest4.writeBitmapFile());

    }
}
