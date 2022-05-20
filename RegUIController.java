package com.example.softwaredev;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class RegUIController {

    @FXML
    private Button createButton, editButton, viewButton, regLogoutButton;

    // when create button is clicked, scene changes to blank patient record for patient to fill out
    @FXML
    public void createButtonClicked(ActionEvent event) throws IOException {
        FXMLLoader createRecLoader = new FXMLLoader(RegUIController.class.getResource("PatientRecordCreate.fxml"));
        Scene pRecCreate = new Scene(createRecLoader.load(),557, 958);
        Stage pRecCreateStage = new Stage();
        pRecCreateStage.setTitle("Patient Record");
        pRecCreateStage.setScene(pRecCreate);
        pRecCreateStage.show();
    }

    // when this button is clicked, registrar will be able to edit a patient's record
    @FXML
    public void editButtonClicked(ActionEvent event) throws IOException {
        FXMLLoader createRecLoader = new FXMLLoader(RegUIController.class.getResource("PatientRecordEdit.fxml"));
        Scene pRecCreate = new Scene(createRecLoader.load(),557, 958);
        Stage pRecCreateStage = new Stage();
        pRecCreateStage.setTitle("Patient Record");
        pRecCreateStage.setScene(pRecCreate);
        pRecCreateStage.show();
    }

    // when this button is clicked, registrar will be able to view a patient's record
    @FXML
    public void viewButtonClicked(ActionEvent event) throws IOException {
        FXMLLoader createRecLoader = new FXMLLoader(RegUIController.class.getResource("PatientRecordEdit.fxml"));
        Scene pRecCreate = new Scene(createRecLoader.load(),557, 958);
        Stage pRecCreateStage = new Stage();
        pRecCreateStage.setTitle("Patient Record");
        pRecCreateStage.setScene(pRecCreate);
        pRecCreateStage.show();
    }

    // when this button is clicked, the registrar will log themselves out and will return to the login page
    @FXML
    public void regLogoutButtonClicked(ActionEvent event) throws IOException {

    }
}
