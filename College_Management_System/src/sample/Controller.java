package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextField middleName;
    @FXML
    public TextField lastName;
    @FXML
    public TextField rollNo;
    @FXML
    public TextField fatherName;
    @FXML
    public TextField gender;
    @FXML
    public TextField course;
    @FXML
    public TextField branch;
    @FXML
    public Button sumbit;
    @FXML
    TextField firstName;




        Students student = new Students();





           public void clickhere(ActionEvent event)
           {
               student.setFirstName(firstName.getText());
               student.setMiddleName(middleName.getText());
               student.setLastName(lastName.getText());
               student.setRollNo(rollNo.getText());
               student.setFatherName(fatherName.getText());
               student.setGender(gender.getText());
               student.setCourse(course.getText());
               student.setBranch(branch.getText());


               System.out.println("Added Successfully");


                System.out.println(student.getFirstName());
                System.out.println(student.getMiddleName());
                System.out.println(student.getLastName());
                System.out.println(student.getRollNo());
                System.out.println(student.getFatherName());
                System.out.println(student.getGender());
                System.out.println(student.getBranch());
                System.out.println(student.getCourse());


           }
}
