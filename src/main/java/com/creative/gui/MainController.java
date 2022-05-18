package com.creative.gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private Button btnEnrollment;

    @FXML
    private Button btnLogin;

    @FXML
    void enroll_Clicked(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("enrollmentView.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void login_Clicked(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("logInView.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

}
