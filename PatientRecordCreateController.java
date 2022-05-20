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
import java.sql.*;
import java.util.Optional;
import java.util.Random;
import java.util.ResourceBundle;

public class PatientRecordCreateController implements Initializable {

    // labels
    @FXML
    private Label patientNameLabel, ssnLabel, addressLabel, heightLabel, dobLabel, weightLabel, emailLabel, bloodTypeLabel,
            religionLabel, genderLabel, raceLabel, ecNumLabel, ecNameLabel, pNumLabel, primPhysLabel, healthInsurLabel,
            sActiveLabel, pregLabel, symptomsLabel, covidVacLabel, medsLabel, allergiesLabel, weeksPregLabel, medConsLabel,
            covidVacTypeLabel, covidVacDatesLabel, secondDoseLabel, firstDoseLabel, boosterLabel, currDateLabel;

    // patient inputs
    @FXML
    private TextField email, emerConPhone, booster, secondDose, patientName, address, SSN, dob, heightFt, heightIn, weight,
            emerConName, pPhoneNum, primPhys, healthInsur, weeksPreg, firstDose, currDate, religion;

    @FXML
    private TextArea symptoms, allergies, medCons, meds;

    @FXML
    private ChoiceBox bloodTypeChoiceBox, raceChoiceBox, genderChoiceBox, covidVTypeChoiceBox, sActiveChoiceBox,
            pregChoiceBox, cVaccineChoiceBox;

    @FXML
    private Button submitButton;

    public void submitButtonClicked(ActionEvent event) {
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                Alert errorAlert = new Alert(Alert.AlertType.ERROR);

                if(email.getText().isEmpty()) {
                    errorAlert.setHeaderText("Email field missing.\nPlease enter your email.");
                    errorAlert.showAndWait();
                }
                if(emerConPhone.getText().isEmpty()) {
                    errorAlert.setHeaderText("Emergency contact phone number field missing.\nPlease enter your emergency contact phone number.");
                }
                if(booster.getText().isEmpty()) {
                    errorAlert.setHeaderText("Date of booster shot field missing.\nPlease enter the date of your booster shot. If you did not receive a booster shot yet, just input N/A.");
                    errorAlert.showAndWait();
                }
                if(secondDose.getText().isEmpty()) {
                    errorAlert.setHeaderText("Date of second COVID shot missing.\nPlease enter the date of your second shot. If you did not receive a second shot yet, just input N/A.");
                    errorAlert.showAndWait();
                }
                if(patientName.getText().isEmpty()) {
                    errorAlert.setHeaderText("Patient name field missing.\nPlease enter your name.");
                    errorAlert.showAndWait();
                }
                if(address.getText().isEmpty()) {
                    errorAlert.setHeaderText("Address field missing.\nPlease enter your address.");
                    errorAlert.showAndWait();
                }
                if(SSN.getText().isEmpty()) {
                    errorAlert.setHeaderText("SSN field missing.\nPlease enter your SSN");
                    errorAlert.showAndWait();
                }
                if(dob.getText().isEmpty()) {
                    errorAlert.setHeaderText("Date of birth field missing.\nPlease enter your date of birth.");
                    errorAlert.showAndWait();
                }
                if(heightFt.getText().isEmpty()) {
                    errorAlert.setHeaderText("Height in ft field missing.\nPlease enter your height in ft.");
                    errorAlert.showAndWait();
                }
                if(heightIn.getText().isEmpty()) {
                    errorAlert.setHeaderText("Height in inches field missing.\nPlease enter your height in inches.");
                    errorAlert.showAndWait();
                }
                if(weight.getText().isEmpty()) {
                    errorAlert.setHeaderText("Weight field missing.\nPlease enter your weight.");
                    errorAlert.showAndWait();
                }
                if(emerConName.getText().isEmpty()) {
                    errorAlert.setHeaderText("Emergency contact name field missing.\nPlease enter your emergency contact's name.");
                    errorAlert.showAndWait();
                }
                if(pPhoneNum.getText().isEmpty()) {
                    errorAlert.setHeaderText("Phone number field missing.\nPlease enter your phone number.");
                    errorAlert.showAndWait();
                }
                if(primPhys.getText().isEmpty()) {
                    errorAlert.setHeaderText("Primary physician field missing.\nPlease enter your primary physician's name.");
                    errorAlert.showAndWait();
                }
                if(healthInsur.getText().isEmpty()) {
                    errorAlert.setHeaderText("Health insurance field missing.\nPlease enter your health insurance company.");
                    errorAlert.showAndWait();
                }
                if(firstDose.getText().isEmpty()) {
                    errorAlert.setHeaderText("Date of first COVID shot missing.\nPlease enter the date of your first shot. If you did not receive a first shot yet, just input N/A.");
                    errorAlert.showAndWait();
                }
                if(currDate.getText().isEmpty()) {
                    errorAlert.setHeaderText("Date field missing.\nPlease enter today's date.");
                    errorAlert.showAndWait();
                }

                // add database code

                submitPRecAlert();
            }
        });
    }


    // confirmation alert window that pops up when submit button is clicked; unique patient ID assigned to patient
    private EventHandler<ActionEvent> submitPRecAlert() {
        Alert conAlert = new Alert(Alert.AlertType.CONFIRMATION);
        conAlert.setTitle("Confirmation");
        conAlert.setHeaderText("Record has been created.\n" + patientID());
        conAlert.setContentText("Please remember your patient ID.");
        conAlert.getButtonTypes().remove(ButtonType.CANCEL);
        conAlert.showAndWait();

        return null;
    }

    // uses a random number generator to create a unique patient ID as patients will be identified by their ID
    public String patientID() {
        Random pID = new Random();

        String pIDString = "Patient ID: " + pID.nextInt(10);

        return pIDString;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String eMail = email.getText();
        String emerphone = emerConPhone.getText();
        String boost = booster.getText();
        String seconds = secondDose.getText();
        String name = patientName.getText();
        String addy = address.getText();
        String socsecnum = SSN.getText();
        String birthday = dob.getText();
        String htFt = heightFt.getText();
        String htIn = heightIn.getText();
        String wt = weight.getText();
        String emername = emerConName.getText();
        String phonenum = pPhoneNum.getText();
        String physician = primPhys.getText();
        String insurance = healthInsur.getText();
        String pregnant = weeksPreg.getText();
        String firsts = firstDose.getText();
        String date = currDate.getText();
        String religionn = religion.getText();
        String symp = symptoms.getText();
        String allergy = allergies.getText();
        String medconditions = medCons.getText();
        String medicine = meds.getText();


        bloodTypeChoiceBox.getItems().addAll("A+","A-","B+","B-","AB+","AB-","O+","O-");
        raceChoiceBox.getItems().addAll("Caucasian","Asian","African","Hispanic/Latino","Hawaiian/Pacific Islander");
        genderChoiceBox.getItems().addAll("Male","Female","Non-binary","Other");
        covidVTypeChoiceBox.getItems().addAll("Pfizer","Moderna","Johnson&Johnson");
        sActiveChoiceBox.getItems().addAll("Yes","No");
        pregChoiceBox.getItems().addAll("Yes","No");
        cVaccineChoiceBox.getItems().addAll("Yes","No");

    }
}
