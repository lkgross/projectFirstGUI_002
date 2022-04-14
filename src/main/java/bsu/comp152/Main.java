package bsu.comp152;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    public static void main(String[] args) {

        // launch the application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){

        // Create a label component.
        Label messageLabel = new Label("Hello World");

        // Put the label in an HBox layout container.
        HBox hbox = new HBox(messageLabel);

        // Put the label in a Scene.
        // Scene scene = new Scene(messageLabel);
        // Or make the scene 500 pixels wide by 200 pixels high.
        // Create a Scene with the HBox as its root node.
        Scene scene = new Scene(hbox, 500, 200);

        Random rand = new Random();
        int r = rand.nextInt(3);

        if (r==0){
            // Set the alignment of the HBox to center.
            hbox.setAlignment(Pos.CENTER_LEFT);
        }
        else if (r == 1){
            hbox.setAlignment(Pos.CENTER);
        }

        else{
            hbox.setAlignment(Pos.CENTER_RIGHT);
        }

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the window's title.
        primaryStage.setTitle("My First GUI Application");

        // Show the window.
        primaryStage.show();
    }
}
