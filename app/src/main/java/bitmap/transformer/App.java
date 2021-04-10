package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.*;
import java.io.*;

public class App {


    public static void main(String[] args) {
        if(args.length ==3){
            inverTransformation invertedImage = new inverTransformation(args[0], args[1]);
            greyScal greyImage = new greyScal(args[0], args[1]);
            GreenFilter halfGreenImage = new GreenFilter(args[0], args[1]);
            VerticalBlackBars barsImage = new VerticalBlackBars(args[0], args[1]);

            switch (args[2]){
                case "invert":
                    invertedImage.readBitmapFile();
                    invertedImage.convertToInvert();
                    invertedImage.writeBitmapFile();

                    break;

                case "grey scale":
                    greyImage.readBitmapFile();
                    greyImage.grayScaleConvertor();
                    greyImage.writeBitmapFile();

                    break;

            case "green filter":
                halfGreenImage.readBitmapFile();
                halfGreenImage.greenFilterConverter();
                halfGreenImage.writeBitmapFile();

                break;

                case "Black Bars Image":
                    barsImage.readBitmapFile();
                    barsImage.blackBarsConverter();
                    barsImage.writeBitmapFile();

                    break;
        }
            System.out.println("You can preview your edited image in  "+args[1]+" directory");
        }
       }

    }













