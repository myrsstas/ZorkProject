/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorkproject.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import zorkproject.Classes.Character;

/**
 *
 * @author paulkokos
 */
public class UIController implements Initializable {

    public Button button;
    public TextArea inputTextBox ;
    public TextField outputTextField ;
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    private void handleButton(ActionEvent event) {

    }

    public void handleButtonClick(ActionEvent actionEvent) {
        inputTextBox.setText("sdgfsdfdfgdfgdfg");
    }
}
