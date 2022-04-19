package bsu.comp152;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    public static void main(String[] args) {

        // launch the application
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){

        // Create components.
        Button centerButton = new Button("This is the center");
        Label topLabel = new Label("This is a label1.");
        // Create a label component.
        Label bottomLabel = new Label("This is a label2.");
        // Create a label component.
        Label leftLabel = new Label("This is a label3.");
        // Create a label component.
        Label rightLabel = new Label("This is a label4.");

        // Add each control into a container.
        HBox centerBox = new HBox(centerButton);
        HBox topBox = new HBox(topLabel);
        HBox bottomBox = new HBox(bottomLabel);
        VBox leftBox = new VBox(leftLabel);
        VBox rightBox = new VBox(rightLabel);

        topBox.setAlignment(Pos.CENTER);
        bottomBox.setAlignment(Pos.CENTER);

        // Put the labels in a BorderPane layout container.

        BorderPane borderpane = new BorderPane();

        borderpane.setCenter(centerBox);
        borderpane.setTop(topBox);
        borderpane.setBottom(bottomBox);
        borderpane.setLeft(leftBox);
        borderpane.setRight(rightBox);

        // Put the BorderPane in a Scene.
        // Scene scene = new Scene(vbox);
        // Or make the scene 500 pixels wide by 200 pixels high.
        // Create a Scene with the BorderPane as its root node.
        Scene scene = new Scene(borderpane, 500, 200);

        // Add the Scene to the Stage.
        primaryStage.setScene(scene);

        // Set the window's title.
        primaryStage.setTitle("My First BorderPane");

        // Show the window.
        primaryStage.show();
    }
}
