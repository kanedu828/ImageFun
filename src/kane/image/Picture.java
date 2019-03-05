package kane.image;


import javafx.scene.image.Image;
import javafx.scene.paint.Color;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Picture{
    protected Image image;
    protected int height;
    protected int width;
    public Picture(){
        try {
            image = new Image(new FileInputStream("/home/kanelooc/code/personal/ImageFun/resources/test_image.png"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        height = (int)image.getHeight();
        width = (int)image.getWidth();
        System.out.println(height + ", " + width);
    }
    public Picture(Image image) {
        this.image = image;
        height = (int)image.getHeight();
        width = (int)image.getWidth();
    }

    public Color getColor(int w, int h){
        Color color = image.getPixelReader().getColor(w,h);
        return color;
    }

    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }







}
