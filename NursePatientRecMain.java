package com.example.softwaredev;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NursePatientRecMain extends Application {

    @Override
    public void start(Stage nRecStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(NursePatientRecMain.class.getResource("NursePatientRec.fxml"));
        Scene nRecScene = new Scene(fxmlLoader.load(), 956, 941);
        nRecStage.setTitle("Patient Record");
        nRecStage.setScene(nRecScene);
        nRecStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
