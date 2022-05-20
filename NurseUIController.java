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

public class NurseUIController {

    public static boolean nurseEditable;

    @FXML
    private Button editButton, viewButton, nurLogoutButton;

    // when this button is clicked, the nurse will be able to edit a patient's record
    @FXML
    public void editButtonClicked(ActionEvent event) throws IOException {
        nurseEditable = true;
        Parent root1 = FXMLLoader.load(getClass().getResource("NursePatientRec.fxml"));
        Scene edit = new Scene(root1);
        Stage editStage = new Stage();
        editStage.setTitle("Patient Record");
        editStage.setScene(edit);
        editStage.show();
    }

    // when this button is clicked, the nurse will be able to view a patient's record
    @FXML
    public void viewButtonClicked(ActionEvent event) throws IOException {
        nurseEditable = false;
        Parent root2 = FXMLLoader.load(getClass().getResource("NursePatientRec.fxml"));
        Scene nurPRecView = new Scene(root2);
        Stage nurPRecViewStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        nurPRecViewStage.setScene(nurPRecView);
        nurPRecViewStage.show();
    }

    // when this button is clicked, the nurse will log themselves out and will return to the login page
    public void nurLogoutButtonClicked(ActionEvent event) {

    }
}
