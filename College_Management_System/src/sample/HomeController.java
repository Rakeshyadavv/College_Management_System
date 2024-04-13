package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.EventObject;

public class HomeController {
    public AnchorPane rootPane;
    @FXML
    private Button Student;

    @FXML
    private Button Faculty;

    @FXML
    private Button Staff;

    @FXML
    private Button Fees;

    @FXML
    private Button Brochure;

    @FXML
    private Button Settings;


    public void openStudentEvent(ActionEvent actionEvent) throws IOException {

      AnchorPane pane =   FXMLLoader.load(getClass().getResource("Student.fxml"));
      rootPane.getChildren().setAll(pane);

    }

    public void Aboutus(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("About_us.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    public void FacultyOpen(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Teacher.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void StaffView(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Staff.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void BrochureView(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Brochure.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void FeeView(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Fee.fxml"));
        rootPane.getChildren().setAll(pane);

    }
}

