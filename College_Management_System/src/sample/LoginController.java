package sample;

import javafx.animation.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;

import javafx.util.Duration;

import java.io.IOException;




public class LoginController {


    public Label status;
    public BorderPane Loginform;
    public StackPane parentContainer;
    public AnchorPane anchorRoot;
    public Label bottomStatus;
    public Button Loginbutton;
    @FXML
    private TextField userName;

    @FXML
    private PasswordField passwords;
    @FXML
    private AnchorPane adduser;

    //DatabaseConnect fo = new DatabaseConnect();






    @FXML
    public void logIn(ActionEvent event) throws IOException, InterruptedException {

       String userNameText = userName.getText();
        String password = passwords.getText();


        System.out.println(userNameText);
        System.out.println(password);

        DatabaseConnect db = new DatabaseConnect();
       boolean answer =  db.checkLogin(userNameText , password );
       if(answer)
       {
           status.setText("Valid");
           status.setTextFill(Paint.valueOf("#006400"));




           try {
             /*  Parent view2 = FXMLLoader.load(getClass().getResource("HomePage.fxml"));

               Scene scene2 = new Scene(view2);

               Stage window = new Stage();
               window.setScene(scene2);
               window.show(); */



             /*  Parent view2 = FXMLLoader.load(getClass().getResource("HomePage.fxml"));

               Scene scene2 = new Scene(view2);

               Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
               window.setScene(scene2);
               window.show();*/



               Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
               Scene scene = anchorRoot.getScene();
               //Set Y of second scene to Height of window
               root.translateYProperty().set(scene.getHeight());
               //Add second scene. Now both first and second scene is present
               parentContainer.getChildren().add(root);

               //Create new TimeLine animation
               Timeline timeline = new Timeline();
               //Animate Y property
               KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_IN);
               KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
               timeline.getKeyFrames().add(kf);
               //After completing animation, remove first scene
               timeline.setOnFinished(t -> {
                   parentContainer.getChildren().remove(anchorRoot);
               });
               timeline.play();








           }
           catch (Exception e)
           {
               bottomStatus.setText("Page load failed");
               System.out.println("page load failed");
           }



       }
       else {
           status.setText("Invalid !!!");
           status.setTextFill(Paint.valueOf("#ff0000"));
       }




    }





    public void forgotPassword(ActionEvent event) {


    }


    public void LoginEnter(KeyEvent keyEvent) {



    }
}
