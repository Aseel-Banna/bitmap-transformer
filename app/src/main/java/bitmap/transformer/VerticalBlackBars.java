package bitmap.transformer;

import java.awt.*;
import java.awt.image.BufferedImage;

public class VerticalBlackBars extends Bitmap{

    VerticalBlackBars(String fileName,String outputFileName){
        super(fileName,outputFileName);
    }
    public void blackBarsConverter() {
        try {
            this.newImg=new BufferedImage(getImgWidth(),getImgHeight(),oldImg.getType());
            for(int i=0; i<getImgHeight (); i++) {
                for(int j=0; j<getImgWidth(); j++) {
                    Color color = new Color(oldImg.getRGB(j, i));
                    int red = color.getRed();
                    int green = color.getGreen();
                    int blue = color.getBlue();
                    if(j % 30 > 22){
                        red = 0;
                        green =0;
                        blue = 0;
                    }
                    Color newColor = new Color(red, green, blue);
                    this.newImg.setRGB(j,i,newColor.getRGB());
                }
            }

        } catch (Exception e) {

            System.out.println(e);

        }


    }

}
