package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class StaffController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    void AddStaff(ActionEvent event) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("AddStaff.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    @FXML
    void searchStaff(ActionEvent event) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Staffinfo.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    @FXML
    void viewStaffInformation(ActionEvent event) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("View_Staff.fxml"));
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
