package com.odeene.trabajo;

import com.odeene.trabajo.controller.UserController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        new UserController().startPrimeFrame();
    }

    public static void main(String[] args) {
        launch();
    }
}