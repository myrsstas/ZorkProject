/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorkproject.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.deploy.uitoolkit.impl.fx.ui.FXMessageDialog;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import zorkproject.Classes.Game.Classes.Character;
import zorkproject.Classes.Game.Classes.Message;
import zorkproject.Classes.Game.Classes.Time;

import javax.swing.*;

/**
 *
 * @author paulkokos
 */
public class UIController extends ActionEvent implements Initializable {
    public Button button;
    public TextArea inputTextBox;
    public TextField outputTextField;
    private String caret = "->";

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        inputTextBox.setText(new Message().getWelcomeMessage());
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
