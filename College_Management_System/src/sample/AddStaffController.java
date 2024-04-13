package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class AddStaffController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField teacherFirstName;

    @FXML
    private TextField teacherLastName;

    @FXML
    private TextField teacherFatherFirstName;

    @FXML
    private TextField teacherFatherLastName;

    @FXML
    private TextField teacherMotherFirstName;

    @FXML
    private TextField teacherMotherLastName;

    @FXML
    private TextField teacherStudentMailId;

    @FXML
    private TextField teacherPhoneNumber;

    @FXML
    private DatePicker teacherDateOfBirth;

    @FXML
    private TextField teacherGender;

    @FXML
    private TextField teacherStreetAdd;

    @FXML
    private TextField teacherCity;

    @FXML
    private TextField teacherState;

    @FXML
    private TextField teacherZipcode;

    @FXML
    private TextField teacherPanCard;

    @FXML
    private TextField teacherAdharCard;

    @FXML
    private TextField teacherId;

    @FXML
    private TextField teacherEmergencyName;

    @FXML
    private TextField teacherEmergencyRelation;

    @FXML
    private TextField teacherEmergencyContact;

    @FXML
    private TextField teacherBasicPay;

    @FXML
    private TextField teacherHRA;

    @FXML
    private TextField teacherBonus;

    @FXML
    private TextField teacherPerformance;

    @FXML
    private Label studentEmailStatus;

    @FXML
    private Label parEmailStatus;

    @FXML
    private TextField PF;

    @FXML
    private TextField ESI;

    @FXML
    private TextField TeacherTransportationFee;

    @FXML
    private TextField teacherAccountNumber;

    @FXML
    private TextField teacherAccountName;

    @FXML
    private TextField teacherCustId;

    @FXML
    private TextField teacherIFSCCode;

    @FXML
    private TextField teacherAccountBranch;

    @FXML
    private TextField teacherBranchCode;

    @FXML
    void back(ActionEvent event) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Staff.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    @FXML
    void home(ActionEvent event) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    @FXML
    void uploadTeacherInfo(ActionEvent event) {

    }

    @FXML
    void validatestu(KeyEvent event) {

    }
}
