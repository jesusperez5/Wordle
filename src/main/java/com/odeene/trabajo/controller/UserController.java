package com.odeene.trabajo.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class UserController {

    @FXML
    private Button loginButton;

    @FXML
    private TextField passwordInput;

    @FXML
    private Label passwordLabel;

    @FXML
    private TextField userInput;

    @FXML
    private Label userLabel;

    @FXML
    void login(MouseEvent event) {
        if (userInput.getText().equals("user") && passwordInput.getText().equals("password")) {
            System.out.println("hola");
        } else {
            userInput.setText("");
            passwordInput.setText("");
        }
    }

    public UserController() throws IOException {}

    public void startPrimeFrame() throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/odeene/trabajo/user-view.fxml"));
        GridPane root = loader.load();
        Scene scene = new Scene(root, 400, 400);
        Stage primaryStage = new Stage();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ventana Principal");
        primaryStage.show();

    }
}