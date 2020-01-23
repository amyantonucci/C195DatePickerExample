/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c195datepickerexample;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author amy.antonucci
 */
public class DatePickerController implements Initializable {
    @FXML
    private DatePicker datePicker;

    @FXML
    private Label lblDate;
    
    @FXML
    private Button btnSet;

    @FXML
    void handleDatePicker(ActionEvent event) {
        LocalDate date = datePicker.getValue();
        
        lblDate.setText(date.toString());
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        datePicker.setValue(LocalDate.now());
    }    
      @FXML
    void handleSet(ActionEvent event) {

        datePicker.setValue(null);
        
    }
}
