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
import java.util.Random;
import java.util.ResourceBundle;

public class PatientRecordEditController implements Initializable {

    // labels
    @FXML
    private Label patientNameLabel, ssnLabel, addressLabel, heightLabel, dobLabel, weightLabel, emailLabel, bloodTypeLabel,
            religionLabel, genderLabel, raceLabel, ecNumLabel, ecNameLabel, pNumLabel, primPhysLabel, healthInsurLabel,
            sActiveLabel, pregLabel, symptomsLabel, covidVacLabel, medsLabel, allergiesLabel, weeksPregLabel, medConsLabel,
            covidVacTypeLabel, covidVacDatesLabel, secondDoseLabel, firstDoseLabel, boosterLabel, currDateLabel;

    // patient needs to fill in the text fields w/ what was requested
    @FXML
    private TextField SSN, patientName, address, pPhoneNum, email, dob, weight, heightIn, heightFt, primPhys,
            emerConPhone, emerConName, healthInsur, weeksPreg, booster, firstDose, secondDose, currDate, religion;

    // patient needs to fill in the text areas w/ what was requested
    @FXML
    private TextArea allergies, medCons, meds, symptoms;

    // patient uses choicebox to choose which element fits them best
    @FXML
    private ChoiceBox bloodTypeChoiceBox, covidVTypeChoiceBox, raceChoiceBox, genderChoiceBox;

    // if cancel button is clicked, record is not created. if submit button is clicked, record is added to database
    @FXML
    private Button submitButton;

    private Connection connect;


    // when submit button is clicked, confirmation button appears and once confirmation is complete, scene will switch
    // back to registrar menu
    @FXML
    public void submitButtonClicked(ActionEvent event) throws IOException, SQLException {
        submitPRecAlert();

        Parent root4 = FXMLLoader.load(getClass().getResource("RegUI.fxml"));
        Scene pRecSubmit = new Scene(root4);
        Stage pRecSubmitStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        pRecSubmitStage.setScene(pRecSubmit);
        pRecSubmitStage.show();

        // database connection
//        try {
//
//        }
//        catch (SQLException e) {
//
//        }

    }

    private EventHandler<ActionEvent> submitPRecAlert() {
        Alert conAlert = new Alert(Alert.AlertType.CONFIRMATION);
        conAlert.setTitle("Confirmation");
        conAlert.setHeaderText("Record has been updated.");
        conAlert.getButtonTypes().remove(ButtonType.CANCEL);
        conAlert.showAndWait();

        return null;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        SSN.setText("123");
        SSN.setEditable(true);

        patientName.setText("lili");
        patientName.setEditable(true);

        address.setText("200 bloomfield");
        address.setEditable(true);

        pPhoneNum.setText("860");
        pPhoneNum.setEditable(true);

        email.setText("harford.edu");
        email.setEditable(true);

        dob.setText("4/14/2022");
        dob.setEditable(true);

        emerConName.setText("lili2");
        emerConName.setEditable(true);

        emerConPhone.setText("8601");
        emerConPhone.setEditable(true);

        religion.setText("Buddhist");
        religion.setEditable(true);

        primPhys.setText("doctor");
        primPhys.setEditable(true);

        healthInsur.setText("uhart");
        healthInsur.setEditable(true);

        weight.setText("20");
        weight.setEditable(false);
        weight.setStyle("-fx-control-inner-background: #d3d3d3");

        heightFt.setText("1");
        heightFt.setEditable(false);
        heightFt.setStyle("-fx-control-inner-background: #d3d3d3");

        heightIn.setText("4");
        heightIn.setEditable(false);
        heightIn.setStyle("-fx-control-inner-background: #d3d3d3");

        weeksPreg.setText("21");
        weeksPreg.setEditable(false);
        weeksPreg.setStyle("-fx-control-inner-background: #d3d3d3");

        booster.setText("4/14/2022");
        booster.setEditable(false);
        booster.setStyle("-fx-control-inner-background: #d3d3d3");

        firstDose.setText("4/14/2022");
        firstDose.setEditable(false);
        firstDose.setStyle("-fx-control-inner-background: #d3d3d3");

        secondDose.setText("4/14/2022");
        secondDose.setEditable(false);
        secondDose.setStyle("-fx-control-inner-background: #d3d3d3");

        currDate.setText("4/14/2022");
        currDate.setEditable(true);

        allergies.setText("pollen");
        allergies.setEditable(false);
        allergies.setStyle("-fx-control-inner-background: #d3d3d3");

        symptoms.setText("nothing");
        symptoms.setEditable(false);
        symptoms.setStyle("-fx-control-inner-background: #d3d3d3");

        medCons.setText("headaches");
        medCons.setEditable(false);
        medCons.setStyle("-fx-control-inner-background: #d3d3d3");

        meds.setText("advil");
        meds.setEditable(false);
        meds.setStyle("-fx-control-inner-background: #d3d3d3");
    }

    public void searchButtonClicked(ActionEvent event) {
    }
}
