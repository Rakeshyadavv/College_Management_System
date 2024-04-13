package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MarksheetController {
    @FXML
    private AnchorPane rootPane;


    @FXML
    private TextField rollNo;

    @FXML
    private ComboBox semester;

    @FXML
    private ImageView marksheetImage;




    @FXML
    void showlist(ActionEvent event) {

        ObservableList<String> list = FXCollections.observableArrayList("Semester 1", "Semester 2", "Semester 3", "Semster 4","Semester 5", "Semester 6","Semester 7", "Semester 8");
        semester.getItems().addAll(list);
    }


    public void back(ActionEvent actionEvent) throws IOException {

        AnchorPane pane =   FXMLLoader.load(getClass().getResource("Student.fxml"));
        rootPane.getChildren().setAll(pane);

    }

    public void home(ActionEvent actionEvent) throws IOException {
        AnchorPane pane =   FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        rootPane.getChildren().setAll(pane);

    }
}
