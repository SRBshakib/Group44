/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Aunti;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class OrderHistorySceneController implements Initializable {

    @FXML
    private TableView<?> carDetailsTableView;
    @FXML
    private TableColumn<?, ?> carModelTableColumn;
    @FXML
    private TableColumn<?, ?> totalAmountTableColumn;
    @FXML
    private TableColumn<?, ?> yearOfLaunchingTableColumn;
    @FXML
    private TableColumn<?, ?> dealerTableColumn;
    @FXML
    private TextField reviewTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void homeButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void myCarButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void countryDealerButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void updateButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void orderButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void orderHistoryButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void viewCarsButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void preOrderButtonOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void upcomingEventsButtonOnMouseClicked(ActionEvent event) {
    }
    
}
