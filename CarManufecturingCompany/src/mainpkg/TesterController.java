/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
<<<<<<< HEAD
import javafx.fxml.FXMLLoader;
=======
>>>>>>> main
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author DIPAYON
 */
public class TesterController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
<<<<<<< HEAD
    }

    @FXML
    private void mdDashboardOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("MD_DashboardScene.fxml"));
        Scene scene1 = new Scene(parent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("MD Dashboard");
        newWindow.setScene(scene1);
        newWindow.show();
    }

    @FXML
    private void hrDashboardOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("HR_DashboardScene.fxml"));
        Scene scene1 = new Scene(parent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("HR Dashboard");
        newWindow.setScene(scene1);
        newWindow.show();
    }

    @FXML
    private void pmDashboardOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("ProductionManagerDashboardScene.fxml"));
        Scene scene1 = new Scene(parent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("Production Manager Dashboard");
        newWindow.setScene(scene1);
        newWindow.show();
    }

    @FXML
    private void fmDashboardOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("FinanceManagerDashboardScene.fxml"));
        Scene scene1 = new Scene(parent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("Finance Manager Dashboard");
        newWindow.setScene(scene1);
        newWindow.show();
    }

    @FXML
    private void aLineWorkerDashboardOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("AssemblyLineWorkerDashboardScene.fxml"));
        Scene scene1 = new Scene(parent);
        Stage newWindow  = new Stage();
        newWindow.setTitle("Assembly Line Worker Dashboard");
        newWindow.setScene(scene1);
        newWindow.show();
=======
    }    

    @FXML
    private void mdDashboardOnClick(ActionEvent event) {
    }

    @FXML
    private void hrDashboardOnClick(ActionEvent event) {
    }

    @FXML
    private void pmDashboardOnClick(ActionEvent event) {
    }

    @FXML
    private void fmDashboardOnClick(ActionEvent event) {
    }

    @FXML
    private void aLineWorkerDashboardOnClick(ActionEvent event) {
>>>>>>> main
    }

    @FXML
    private void customerDashboardOnClick(ActionEvent event) {
<<<<<<< HEAD
//        Parent parent = FXMLLoader.load(getClass().getResource("MD_DashboardScene.fxml"));
//        Scene scene1 = new Scene(parent);
//        Stage newWindow  = new Stage();
//        newWindow.setTitle("MD Dashboard");
//        newWindow.setScene(scene1);
//        newWindow.show();
=======
>>>>>>> main
    }

    @FXML
    private void supplierDashboardOnClick(ActionEvent event) {
<<<<<<< HEAD
//        Parent parent = FXMLLoader.load(getClass().getResource("MD_DashboardScene.fxml"));
//        Scene scene1 = new Scene(parent);
//        Stage newWindow  = new Stage();
//        newWindow.setTitle("MD Dashboard");
//        newWindow.setScene(scene1);
//        newWindow.show();
=======
>>>>>>> main
    }

    @FXML
    private void supplyChainManagerDashboardOnClick(ActionEvent event) {
<<<<<<< HEAD
//        Parent parent = FXMLLoader.load(getClass().getResource("MD_DashboardScene.fxml"));
//        Scene scene1 = new Scene(parent);
//        Stage newWindow  = new Stage();
//        newWindow.setTitle("MD Dashboard");
//        newWindow.setScene(scene1);
//        newWindow.show();
    }

=======
    }
    
>>>>>>> main
}
