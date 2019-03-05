package kane.image;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;

public class ImageManipulator extends Picture{
    public ImageManipulator(){
        super();
    }
    public ImageManipulator(Image image){
        super(image);
    }

    public Canvas toGrayScale(){
        Canvas canvas = new Canvas(width, height);
        PixelWriter pw = canvas.getGraphicsContext2D().getPixelWriter();
        for(int w = 0; w<width; w++){
            for(int h = 0; h<width; h++){
                pw.setColor(w,h,getColor(w,h).grayscale());
            }
        }
        return canvas;
    }

    public Canvas halfGrayScale(){
        Canvas canvas = new Canvas(width, height);
        PixelWriter pw = canvas.getGraphicsContext2D().getPixelWriter();
        for(int w = 0; w<width; w=w+2){
            for(int h = 0; h<width; h=h+2){
                halfManipulate(pw, w, h);
                pw.setColor(w,h,getColor(w,h).grayscale());
            }
        }
        return canvas;

    }

    public Canvas halfInvert(){
        Canvas canvas = new Canvas(width, height);
        PixelWriter pw = canvas.getGraphicsContext2D().getPixelWriter();
        for(int w = 0; w<width; w=w+2){
            for(int h = 0; h<width; h=h+2){
                halfManipulate(pw, w, h);
                pw.setColor(w,h,getColor(w,h).invert());
            }
        }
        return canvas;

    }

    public Canvas distort(){
        Canvas canvas = new Canvas(width, height);
        PixelWriter pw = canvas.getGraphicsContext2D().getPixelWriter();
        for(int w = 0; w<width; w++){
            for(int h = 0; h<width; h++){
                pw.setColor(w,0,getColor(w,h).grayscale());
            }
        }
        return canvas;

    }

    private void halfManipulate(PixelWriter pw, int w, int h) {
        if(w == 0||h==0){
            pw.setColor(w,h,getColor(w,h));
        }
        else{
            pw.setColor(w-1,h-1,getColor(w-1,h-1));
        }
    }
}
