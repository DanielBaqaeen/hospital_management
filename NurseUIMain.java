package com.example.softwaredev;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NurseUIMain extends Application {

    @Override
    public void start(Stage nurseUIStage) throws Exception {
        FXMLLoader nurseLoader = new FXMLLoader(NurseUIMain.class.getResource("NurseUI.fxml"));
        Scene nurseUIScene = new Scene(nurseLoader.load(), 342, 328);
        nurseUIStage.setTitle("Nurse Menu");
        nurseUIStage.setScene(nurseUIScene);
        nurseUIStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
