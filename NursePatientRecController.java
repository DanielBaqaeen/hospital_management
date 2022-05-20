package com.example.softwaredev;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NursePatientRecController implements Initializable {

    @FXML
    private TextField patientName, SSN, address, pPhoneNum, email, dob, weight, heightIn, heightFt, primPhys, emerConPhone,
            emerConName, healthInsur, weeksPreg, booster, secondDose, firstDose, currDate, assignedPhys, bodyTemp, bloodPress,
            pulseRate, resRate, rmNum, stayedDays, searchBar, patientID, religion;

    @FXML
    private TextArea allergies, medCons, meds, symptoms, nurNotes, iVs;

    @FXML
    private Button submitButton, searchButton;

    @FXML
    private ChoiceBox bloodTypeChoiceBox, covidVTypeChoiceBox, raceChoiceBox, genderChoiceBox, admittedChoiceBox,
            sActiveChoiceBox, pregChoiceBox, cVaccineChoiceBox;

    public void submitButtonClicked(ActionEvent event) throws IOException {
        submitButton.setOnAction(submitNurRecAlert());

        // command to add to database

        Parent root = FXMLLoader.load(getClass().getResource("NursePatientRec.fxml"));
        Scene nRecSubmit = new Scene(root);
        Stage nRecSubmitStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        nRecSubmitStage.setTitle("Patient Record");
        nRecSubmitStage.setScene(nRecSubmit);
        nRecSubmitStage.show();
    }

    private EventHandler<ActionEvent> submitNurRecAlert() {
        Alert subAlert = new Alert(Alert.AlertType.CONFIRMATION);
        subAlert.setTitle("Confirmation");
        subAlert.setHeaderText("Record has been updated.");
        subAlert.getButtonTypes().remove(ButtonType.CANCEL);
        subAlert.showAndWait();

        return null;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        patientName.setText("Boo");
        patientName.setEditable(false);
        patientName.setStyle("-fx-control-inner-background: #d3d3d3");

        SSN.setText("123456789");
        SSN.setEditable(false);
        SSN.setStyle("-fx-control-inner-background: #d3d3d3");

        address.setText("200 Bloomfield Ave");
        address.setEditable(false);
        address.setStyle("-fx-control-inner-background: #d3d3d3");

        pPhoneNum.setText("123456789");
        pPhoneNum.setEditable(false);
        pPhoneNum.setStyle("-fx-control-inner-background: #d3d3d3");

        email.setText("asdfghjkl");
        email.setEditable(false);
        email.setStyle("-fx-control-inner-background: #d3d3d3");

        dob.setText("5/17/2022");
        dob.setEditable(false);
        dob.setStyle("-fx-control-inner-background: #d3d3d3");

        weight.setText(Integer.toString(100));
        weight.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            weight.setStyle("-fx-control-inner-background: #d3d3d3");

        heightIn.setText(Integer.toString(5));
        heightIn.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            heightIn.setStyle("-fx-control-inner-background: #d3d3d3");

        heightFt.setText(Integer.toString(0));
        heightFt.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            heightFt.setStyle("-fx-control-inner-background: #d3d3d3");

        primPhys.setText("N/A");
        primPhys.setEditable(false);
        primPhys.setStyle("-fx-control-inner-background: #d3d3d3");

        emerConPhone.setText("N/A");
        emerConPhone.setEditable(false);
        emerConPhone.setStyle("-fx-control-inner-background: #d3d3d3");

        emerConName.setText("N/A");
        emerConName.setEditable(false);
        emerConName.setStyle("-fx-control-inner-background: #d3d3d3");

        healthInsur.setText("N/A");
        healthInsur.setEditable(false);
        healthInsur.setStyle("-fx-control-inner-background: #d3d3d3");

        weeksPreg.setText("0");
        weeksPreg.setEditable(false);
        weeksPreg.setStyle("-fx-control-inner-background: #d3d3d3");

        booster.setText("3/4/2022");
        booster.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            booster.setStyle("-fx-control-inner-background: #d3d3d3");

        secondDose.setText("3/4/2022");
        secondDose.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            secondDose.setStyle("-fx-control-inner-background: #d3d3d3");

        firstDose.setText("3/4/2022");
        firstDose.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            firstDose.setStyle("-fx-control-inner-background: #d3d3d3");

        currDate.setText("4/14/2022");
        currDate.setEditable(false);
        currDate.setStyle("-fx-control-inner-background: #d3d3d3");

        allergies.setText("pollen");
        allergies.setEditable(false);
        allergies.setStyle("-fx-control-inner-background: #d3d3d3");

        medCons.setText("idk");
        medCons.setEditable(false);
        medCons.setStyle("-fx-control-inner-background: #d3d3d3");

        meds.setText("advil");
        meds.setEditable(false);
        meds.setStyle("-fx-control-inner-background: #d3d3d3");

        symptoms.setText("Headaches");
        symptoms.setEditable(false);
        symptoms.setStyle("-fx-control-inner-background: #d3d3d3");

        patientID.setText("1");
        patientID.setEditable(false);
        patientID.setStyle("-fx-control-inner-background: #d3d3d3");

        religion.setText("Buddhist");
        religion.setEditable(false);
        religion.setStyle("-fx-control-inner-background: #d3d3d3");

        assignedPhys.getText();
        assignedPhys.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            assignedPhys.setStyle("-fx-control-inner-background: #d3d3d3");

        bodyTemp.getText();
        bodyTemp.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            bodyTemp.setStyle("-fx-control-inner-background: #d3d3d3");

        bloodPress.getText();
        bloodPress.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            bloodPress.setStyle("-fx-control-inner-background: #d3d3d3");

        pulseRate.getText();
        pulseRate.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            pulseRate.setStyle("-fx-control-inner-background: #d3d3d3");

        resRate.getText();
        resRate.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            resRate.setStyle("-fx-control-inner-background: #d3d3d3");

        rmNum.getText();
        rmNum.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            rmNum.setStyle("-fx-control-inner-background: #d3d3d3");

        stayedDays.getText();
        stayedDays.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            stayedDays.setStyle("-fx-control-inner-background: #d3d3d3");

        searchBar.getText();
        searchBar.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            searchBar.setStyle("-fx-control-inner-background: #d3d3d3");

        nurNotes.getText();
        nurNotes.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            nurNotes.setStyle("-fx-control-inner-background: #d3d3d3");

        iVs.getText();
        iVs.setEditable(NurseUIController.nurseEditable);
        if (NurseUIController.nurseEditable == false)
            iVs.setStyle("-fx-control-inner-background: #d3d3d3");
    }

    public void searchButtonClicked(ActionEvent event) {
    }

}
