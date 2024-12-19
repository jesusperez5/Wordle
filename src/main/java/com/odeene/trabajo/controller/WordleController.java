package com.odeene.trabajo.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WordleController {

    @FXML
    private Label c0r0;

    @FXML
    private Label c1r0;

    @FXML
    private Label c2r0;

    @FXML
    private Label c3r0;

    @FXML
    private Label c4r0;

    public WordleController() throws IOException {}

    public void showSecondFrame(String usuario, Stage primaryStage) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/odeene/trabajo/wordle-view.fxml"));
        GridPane root = loader.load();
        Scene scene = new Scene(loader.load(), 500, 500);
        WordleController wordleController = loader.getController();
        Stage primaryStage = new Stage();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Ventana Principal");
        primaryStage.show();

    }

}
