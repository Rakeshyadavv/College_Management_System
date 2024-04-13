package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class feeReport__Controller {
    @FXML
    private AnchorPane rootPane;


    @FXML
    private TextField rollNoSearch;

    @FXML
    private TextField nameSearch;

    @FXML
    private TextField fatherNameSearch;

    @FXML
    private TextField batchSearch;

    @FXML
    private Label name;

    @FXML
    private Label rollNo;

    @FXML
    private Label branch;

    @FXML
    private Label fatherName;

    @FXML
    private Label batch;

    @FXML
    private Label registrationFee;

    @FXML
    private Label tutionFee;

    @FXML
    private Label securityDesposit;

    @FXML
    private Label hostelFee;

    @FXML
    private Label hostelSecurityFee;

    @FXML
    private Label libraryFee;

    @FXML
    private Label transportationFee;

    @FXML
    private Label semester1;

    @FXML
    private Label semester2;

    @FXML
    private Label semester3;

    @FXML
    private Label semester4;

    @FXML
    private Label semester5;

    @FXML
    private Label semester6;

    @FXML
    private Label semester7;

    @FXML
    private Label semester8;

    public void home(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Student.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}
