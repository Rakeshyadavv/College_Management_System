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

public class teacher_formController {
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
    private Label result;

    @FXML
    private TextField teacherAdharCard;

    @FXML
    private TextField teacherId;

    @FXML
    private TextField teacherSubjectName;

    @FXML
    private TextField teacherSubjectCode;

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
    void uploadTeacherInfo(ActionEvent event) {

    }

  String TeacherFirstName = teacherFirstName.getText();
    String TeacherLastName  = teacherLastName.getText();
    String TeacherFatherFirstName = teacherFatherFirstName.getText();
    String TeacherFatherLastName = teacherFatherLastName.getText();
    String TeacherMotherFirstName = teacherMotherFirstName.getText();
    String TeacherMotherLastName =teacherMotherLastName.getText();
    String TeacherStudentMailId =teacherStudentMailId.getText();
    String TeacherPhoneNumber = teacherPhoneNumber.getText();
    String TeacherDateOfBirth;
    String TeacherGender = teacherGender.getText();
    String TeacherStreetAdd = teacherStreetAdd.getText();
    String TeacherCity = teacherCity.getText();
    String TeacherState = teacherState.getText();
    String TeacherZipcode = teacherZipcode.getText();
    String TeacherPanCard = teacherPanCard.getText();
    String TeacherAdharCard = teacherAdharCard.getText();
    String TeacherId = teacherId.getText();
    String TeacherSubjectName = teacherSubjectName.getText();
    String TeacherSubjectCode = teacherSubjectCode.getText();
    String TeacherEmergencyName = teacherEmergencyName.getText();
    String TeacherEmergencyRelation = teacherEmergencyRelation.getText();
    String TeacherEmergencyContact = teacherEmergencyContact.getText();
   int TeacherBasicPay = Integer.parseInt(teacherBasicPay.getText());
    int TeacherHRA = Integer.parseInt(teacherHRA.getText());
    int TeacherBonus = Integer.parseInt(teacherBonus.getText());
    int TeacherPerformance = Integer.parseInt(teacherPerformance.getText());
    int PF1 = Integer.parseInt(PF.getText());
    int ESI1 = Integer.parseInt(ESI.getText());
    int TeacherTransportationFee1 = Integer.parseInt(TeacherTransportationFee.getText());
    String TeacherAccountNumber = teacherAccountNumber.getText();
    String TeacherAccountName = teacherAccountName.getText();
    String TeacherCustId = teacherCustId.getText();
    String TeacherIFSCCode = teacherIFSCCode.getText();
    String TeacherAccountBranch =teacherAccountBranch.getText();
    String TeacherBranchCode = teacherBranchCode.getText();

















    public void home(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Teacher.fxml"));
        rootPane.getChildren().setAll(pane);

    }
}
