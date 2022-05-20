package com.example.softwaredev;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PatientRecordCreateMain extends Application {

    @Override
    public void start(Stage pRecCreateStage) throws IOException {
        FXMLLoader pRecCreateLoader = new FXMLLoader(PatientRecordCreateMain.class.getResource("PatientRecordCreate.fxml"));
        Scene pRecCreateScene = new Scene(pRecCreateLoader.load(), 600, 400);
        pRecCreateStage.setTitle("Patient Record");
        pRecCreateStage.setScene(pRecCreateScene);
        pRecCreateStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
