package com.creative.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class logInController {

    @FXML
    private Button btnEnroll;

    @FXML
    private Button btnFind_ID;

    @FXML
    private Button btnFind_Password;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtPassword;

    @FXML
    void Find_ID(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FindView_ID.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void Find_Password(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FindView_Password.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void enrollment(ActionEvent event) {

    }

    @FXML
    void logIn(ActionEvent event) {

    }

}
