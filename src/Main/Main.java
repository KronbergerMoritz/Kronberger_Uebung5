package Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Author: Moritz Kronberger
 * Date: 15.10.2020
 */
public class Main extends Application
{

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception
    {
        VBox vBox = new VBox();
        Scene scene = new Scene(vBox, 500, 500);
        stage.setTitle("Converter");
        stage.setScene(scene);
    }
}
