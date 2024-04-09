package Dip;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class HumanResourceManagerDashboardSceneController implements Initializable {


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void noticeMgtButtonOnClick(ActionEvent event) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("/Dip/HumanResourceManagerNoticeBoardManagmentScene.fxml"));
        Scene scene1 = new Scene(mainParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void directoryMgtButtonOnClick(ActionEvent event) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("HumanResourceManagerDirectoryScene.fxml"));
        Scene scene1 = new Scene(mainParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }


    @FXML
    private void leaveRequestButtonOnClick(ActionEvent event) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("HumanResourceManagerLeaveRequestReadScene.fxml"));
        Scene scene1 = new Scene(mainParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void hireAndDismissButtonOnClick(ActionEvent event) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("HumanResourceManagerHireAndDismissScene.fxml"));
        Scene scene1 = new Scene(mainParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void trainEmployeeButtonOnClick(ActionEvent event) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("HumanResourceManagerTrainingToEmployeeScene.fxml"));
        Scene scene1 = new Scene(mainParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void createUserButtonOnClick(ActionEvent event) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("HumanResourceManagerCreateUserScene.fxml"));
        Scene scene1 = new Scene(mainParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void jobApplicationButtonOnClick(ActionEvent event) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("HumanResourceManagerJobApplicationCheckScene.fxml"));
        Scene scene1 = new Scene(mainParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void salaryMgtButtonOnClick(ActionEvent event) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("HumanResourceManagerSalaryManagmentScene.fxml"));
        Scene scene1 = new Scene(mainParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void termsAndConditionsReadOnClick(ActionEvent event) throws IOException {
        Parent mainParent = FXMLLoader.load(getClass().getResource("HumanResourceManagerTermsAndConditionsReadScene.fxml"));
        Scene scene1 = new Scene(mainParent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("Terms And Conditions");
        newWindow.setScene(scene1);
        newWindow.show();
    } 
}