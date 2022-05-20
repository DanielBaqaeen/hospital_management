package com.example.softwaredev;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegUIMain extends Application {

    @Override
    public void start(Stage regUIStage) throws Exception {
        FXMLLoader regUILoader = new FXMLLoader(RegUIMain.class.getResource("RegUI.fxml"));
        Scene regUIScene = new Scene(regUILoader.load());
        regUIStage.setTitle("Registrar");
        regUIStage.setScene(regUIScene);
        regUIStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
