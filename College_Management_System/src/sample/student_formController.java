package sample;

import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.LocalDate;
import java.util.regex.Pattern;

public class student_formController {
    public Label studentEmailStatus;
    public Label parEmailStatus;
    @FXML
    private TextField studentFirstName;

    @FXML
    private TextField studentLastName;

    @FXML
    private TextField fatherFirstName;

    @FXML
    private TextField fatherLastName;

    @FXML
    private TextField motherFirstName;

    @FXML
    private TextField motherLastName;

    @FXML
    private TextField studentMailId;

    @FXML
    private TextField studentPhoneNumber;

    @FXML
    private TextField parentEmailId;

    @FXML
    private TextField parentPhoneNumber;

    @FXML
    private DatePicker dateOfBirth;

    @FXML
    private TextField gender;

    @FXML
    private TextField streetAdd;

    @FXML
    private TextField studentCity;

    @FXML
    private TextField studentState;

    @FXML
    private TextField zipcode;

    @FXML
    private TextField batch;

    @FXML
    private TextField branch;

    @FXML
    private TextField rollNo;

    @FXML
    private TextField emergencyName;

    @FXML
    private TextField emergencyRelation;

    @FXML
    private TextField emergencyContact;

    @FXML
    private TextField tutionFee;

    @FXML
    private TextField registrationFee;

    @FXML
    private TextField securityMoney;

    @FXML
    private TextField hostelFee;

    @FXML
    private TextField hostelSecurityFee;

    @FXML
    private TextField libraryFee;

    @FXML
    private TextField transportationFee;



    @FXML
    private JFXRadioButton rbNew;

    @FXML
    private JFXRadioButton rbRetu;

    private ToggleGroup tgGroup;
    @FXML
    private AnchorPane rootPane;

    @FXML
    private Label result;


    // this is code to validate the email


    /*getting the information from the form to java variables*/
    public void uploadInfo(ActionEvent actionEvent) {
        String StudentFirstName = studentFirstName.getText();
        String StudentLastName = studentLastName.getText();
        String FatherFirstName = fatherFirstName.getText();
        String FatherLastName = fatherLastName.getText();
        String MotherFirstName = motherFirstName.getText();
        String MotherLastName = motherLastName.getText();
        String StudentMailId = studentMailId.getText();
        String StudentPhoneNumber = studentPhoneNumber.getText();
        String ParentEmailId = parentEmailId.getText();
        String ParentPhoneNumber = parentPhoneNumber.getText();
        LocalDate DateOfBirth = dateOfBirth.getValue();
        String Gender = gender.getText();
        String StreetAdd  = streetAdd.getText();
        String StudentCity = studentCity.getText();
        String StudentState = studentState.getText();
        String Zipcode = zipcode.getText();
        String Batch = batch.getText();
        String Branch = branch.getText();
        String EmergencyName = emergencyName.getText();
        String EmergencyRelation = emergencyRelation.getText();
        String EmergencyContact = emergencyContact.getText();

/*

        int Tution =0;
        Tution = Integer.parseInt(tutionFee.getText());
        int RegistrationFee = 0;
        RegistrationFee = Integer.parseInt(registrationFee.getText());
        int SecurityMoney= 0;
        SecurityMoney = Integer.parseInt(securityMoney.getText());
        int HostelFee = 0;
        HostelFee = Integer.parseInt(hostelFee.getText());

        int HostelSecurityFee = 0;
        HostelSecurityFee = Integer.parseInt(hostelSecurityFee.getText());
        int LibraryFee =0;
        LibraryFee = Integer.parseInt(libraryFee.getText());
        int TransportationFee = 0;
        TransportationFee = Integer.parseInt(transportationFee.getText());

*/
        result.setText("Information uploaded successfully");
        result.setStyle("-fx-text-fill: ##FF0000;");
        result.setStyle("-fx-font-weight: bold;");


        /* Printing the varibles just for testing*/
        System.out.println("Name of student is : " + StudentFirstName + " " + StudentLastName);
        System.out.println("Student father name is  : " + FatherFirstName + " " + FatherLastName);
        System.out.println("Name of student is : " + MotherFirstName + " " + MotherLastName);
        System.out.println("Student id and phone number is : " + StudentMailId +  "  " + StudentPhoneNumber);
        System.out.println("Student Parent id and phone number is : " + ParentEmailId +  "  " + ParentPhoneNumber);
        System.out.println("date is : " + dateOfBirth) ;














    }
    // function to validate weather the given string is valid or invalid email id
    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
// validating the parentEmailId
    public void validate(KeyEvent keyEvent) {
        String eeemail = parentEmailId.getText();
        System.out.println(eeemail);
        if (isValid(eeemail)) {
            parEmailStatus.setText("✓");
            parEmailStatus.setStyle("-fx-text-fill: #00FF00;");
        }
        else{
            parEmailStatus.setText("X");
            parEmailStatus.setStyle("-fx-text-fill: #FF0000;");
        }


    }
// validating the student email id
    public void validatestu(KeyEvent keyEvent) {
        String eemail = studentEmailStatus.getText();
        System.out.println(eemail);
        if (isValid(eemail)) {
            studentEmailStatus.setText("✓");
            studentEmailStatus.setStyle("-fx-text-fill: #00FF00;");

        }
        else {
            studentEmailStatus.setText("X");
            studentEmailStatus.setStyle("-fx-text-fill: #FF0000;");
        }
    }

    public void home(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Student.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}
