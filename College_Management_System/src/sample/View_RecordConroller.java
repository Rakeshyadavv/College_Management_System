package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class View_RecordConroller {



    @FXML
    private AnchorPane rootPane;

    @FXML
    private Label studentFirstName;

    @FXML
    private Label studentLastName;

    @FXML
    private Label fatherFirstName;

    @FXML
    private Label fatherLastName;

    @FXML
    private Label motherFirstName;

    @FXML
    private Label motherLastName;

    @FXML
    private Label eMailid;

    @FXML
    private Label phoneNumber;

    @FXML
    private Label parentEmail;

    @FXML
    private Label parentPhoneNumber;

    @FXML
    private Label dateOfBirth;

    @FXML
    private Label genderid;

    @FXML
    private Label streetAddress;

    @FXML
    private Label cityid;

    @FXML
    private Label stateid;

    @FXML
    private Label zipCode;

    @FXML
    private Label emergencyName;

    @FXML
    private Label emergencyRelation;

    @FXML
    private Label emergencyContact;

    @FXML
    private Label studentType;

    public void home(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Student.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void search(ActionEvent actionEvent) {



    }
}
