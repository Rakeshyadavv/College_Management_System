package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class StudentController {
    public AnchorPane rootPane;

    public void openStudentEvent(ActionEvent actionEvent) throws IOException {

        AnchorPane pane =   FXMLLoader.load(getClass().getResource("student_form.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void feeReport(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("feeReport.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    public void viewRecord(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("View_Record.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void viewMarksheet(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Marksheet.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void generateRecipt(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Receipt.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void home(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void back(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}
