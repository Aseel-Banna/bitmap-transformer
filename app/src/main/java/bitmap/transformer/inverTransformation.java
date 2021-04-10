package bitmap.transformer;

import java.awt.*;
import java.awt.image.BufferedImage;

public class inverTransformation extends Bitmap {

    inverTransformation(String fileName,String outputFileName){
        super(fileName,outputFileName);
    }

    public void convertToInvert(){
        try {
            this.newImg=new BufferedImage(getImgWidth(),getImgHeight(),oldImg.getType());

            for(int i=0; i<getImgHeight (); i++) {
                for(int j=0; j<getImgWidth(); j++) {
                    Color color = new Color(oldImg.getRGB(j, i));
                    int red = (int)(255-color.getRed());
                    int green = (int)(255- color.getGreen() );
                    int blue = (int)(255- color.getBlue());
                    Color newColor = new Color(red,green,blue);
                    this.newImg.setRGB(j,i,newColor.getRGB());
                }
            }

        } catch (Exception e) {

            System.out.println(e);

        }



    }


}
