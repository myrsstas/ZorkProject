/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorkproject.Classes.Game.Controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import javax.swing.*;


public class UIController extends ActionEvent implements Initializable {
    public Button button;
    public TextArea inputTextBox;
    public TextField outputTextField;
    private String caret = "->";

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void handleButtonClick(ActionEvent actionEvent) {
        try {
            inputTextBox.setText(inputTextBox.getText() + caret + outputTextField.getText() + "\n");
            outputTextField.clear();
            //JOptionPane.showMessageDialog(null, "Message", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Message", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public void enterPressed(KeyEvent keyEvent) {
        //new FXMessageDialog();

    }


    public void onEnter(ActionEvent actionEvent) {
        //inputTextBox.setText(actionEvent.getSource().getClass().toString());
        inputTextBox.setText(inputTextBox.getText() + caret + outputTextField.getText() + "\n");
        outputTextField.clear();

        //Time time = new Time();
        //inputTextBox.setText(Integer.toString( time.getAgeInSeconds()));
    }
}
