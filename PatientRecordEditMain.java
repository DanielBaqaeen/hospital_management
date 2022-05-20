package com.example.softwaredev;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PatientRecordEditMain extends Application {

    @Override
    public void start(Stage pRecStage) throws IOException {
        FXMLLoader pRecLoader = new FXMLLoader(PatientRecordEditMain.class.getResource("PatientRecordEdit.fxml"));
        Scene pRecScene = new Scene(pRecLoader.load(), 553, 880);
        pRecStage.setTitle("Patient Record");
        pRecStage.setScene(pRecScene);
        pRecStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
