package com.creative.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainGUI extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainGUI.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 843, 505);
        stage.setTitle("");
        stage.setScene(scene);
        stage.show();
        //new ViewManager(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}