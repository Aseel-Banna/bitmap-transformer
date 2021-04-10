package bitmap.transformer;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GreenFilter extends Bitmap{
    GreenFilter(String fileName,String outputFileName){
        super(fileName,outputFileName);
    }

    public void greenFilterConverter() {

        try {
            this.newImg=new BufferedImage(getImgWidth(),getImgHeight(),oldImg.getType());
            for(int i=0; i<getImgWidth()/2; i++) {
                for(int j=0; j<getImgHeight (); j++) {
                    Color color = new Color(oldImg.getRGB(j, i));
                    int red = color.getRed();
                    int green = 255;
                    int blue = color.getBlue();
                    Color newColor = new Color(red+green+blue,
                            red+green+blue,red+green+blue);
                    this.newImg.setRGB(j,i,newColor.getRGB());
                }
            }

        } catch (Exception e) {

            System.out.println(e);

        }


    }
}
