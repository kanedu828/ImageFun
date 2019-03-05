package kane.driver;
import javafx.scene.image.Image;
import kane.image.ColorData;
import kane.image.Picture;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Driver {
    public static void main(String[] args){
        /*Image image = null;
        try {
            image = new Image(new FileInputStream(args[0]));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Picture picture = new Picture(image);*/
        Picture picture = new Picture();
        Picture picture1 = new ColorData();
        ((ColorData) picture1).countColor();
        ((ColorData) picture1).printColorData();
    }
}
