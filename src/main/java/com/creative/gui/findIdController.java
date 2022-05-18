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

public class findIdController {

    @FXML
    private Button btnFIndID;

    @FXML
    private TextField userEmail;

    @FXML
    private TextField userName;

    @FXML
    void find_ID_Clicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("popUp_ID.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

}
