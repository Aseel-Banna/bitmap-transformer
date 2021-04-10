package bitmap.transformer;

import java.awt.*;
import java.awt.image.BufferedImage;

public class greyScal extends Bitmap{

    greyScal(String fileName,String outputFileName){
        super(fileName,outputFileName);
    }

    public void grayScaleConvertor() {

        try {
            this.newImg=new BufferedImage(getImgWidth(),getImgHeight(),oldImg.getType());
            for(int i=0; i<getImgHeight (); i++) {
                for(int j=0; j<getImgWidth(); j++) {
                    Color color = new Color(oldImg.getRGB(j, i));
                    int red = (int)(color.getRed() * 0.2126);
                    int green = (int)(color.getGreen() * 0.7152);
                    int blue = (int)(color.getBlue() * 0.0722);
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

