package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class TeacherController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    void AddTeacher(ActionEvent event) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("AddTeacher.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    @FXML
    void generatePayslip(ActionEvent event) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("TeacherPayroll.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    @FXML
    void viewTeacherInfo(ActionEvent event) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Facultyinfo.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    public void home(ActionEvent actionEvent) throws IOException {

        AnchorPane pane =   FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Homepage.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}
