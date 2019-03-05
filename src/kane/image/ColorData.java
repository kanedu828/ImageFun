package kane.image;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;

;

public class ColorData extends Picture{
    private int red;
    private int blue;
    private int green;
    public ColorData(){
        super();
        red = 0;
        blue = 0;
        green = 0;
    }
    public ColorData(Image image){
        super(image);
        red = 0;
        blue = 0;
        green = 0;
    }

    public String colorToString(int w, int h){
        String color = image.getPixelReader().getColor(w,h).toString();
        return color;
    }

    public void countColor(){
        for(int w = 0; w<width; w++){
            for(int h = 0; h<height; h++){
                if(getColor(w, h).getRed() > getColor(w, h).getBlue() && getColor(w, h).getRed() > getColor(w, h).getGreen()){
                    red++;
                }
                else if(getColor(w,h).getBlue() > getColor(w, h).getRed() && getColor(w,h).getBlue() > getColor(w, h).getGreen()){
                    blue++;
                }else{
                    green++;
                }
            }
        }
    }

    public void printColorData(){
        System.out.println("Red: " + red);
        System.out.println("Blue: " + blue);
        System.out.println("Green " + green);
    }
}
