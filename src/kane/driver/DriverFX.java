package kane.driver;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import kane.image.ImageManipulator;
import kane.image.Picture;

public class DriverFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Stage window = primaryStage;
        window.setTitle("ImageFun");

        Picture picture = new ImageManipulator();

        Group root = new Group();
        Scene s = new Scene(root, picture.getWidth(), picture.getHeight(), Color.BLACK);

        Canvas canvas = ((ImageManipulator) picture).distort();
        root.getChildren().add(canvas);

        window.setScene(s);
        window.show();


    }
}
