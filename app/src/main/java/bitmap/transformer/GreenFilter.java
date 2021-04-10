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
            for(int i=0; i<getImgHeight (); i++) {
                for(int j=0; j<getImgWidth(); j++) {
                    Color color = new Color(oldImg.getRGB(j, i));
                    int red = 0;
                    int green = (int)((color.getGreen()*0.35));
                    int blue = 0;
                    Color newColor = new Color(red,
                            green,blue);
                    this.newImg.setRGB(j,i,newColor.getRGB());
                }
            }

        } catch (Exception e) {

            System.out.println(e);

        }


    }
}
