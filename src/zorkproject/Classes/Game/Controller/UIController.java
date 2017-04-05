/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorkproject.Classes.Game.Controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import zorkproject.Classes.Game.Classes.Command;
import zorkproject.Classes.Game.Classes.Item;
import zorkproject.Classes.Game.Classes.Message;
import zorkproject.Classes.Game.Classes.Player;

import javax.swing.*;
import javax.swing.text.Caret;
import javax.swing.text.DefaultCaret;

import static javax.swing.text.DefaultCaret.ALWAYS_UPDATE;


public class UIController extends ActionEvent implements Initializable {
    public Button button;
    public TextArea outputTextBox;
    public TextField inputTextField;
    private String caret = "->";


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO ΠΡΟΣΩΡΙΝΗ ΑΠΟΘΗΚΕΥΣΗ ΑΝΤΙΚΕΙΜΕΝΩΝ Item ΚΑΙ ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΚΑΤΑ ΤΗΝ ΕΚΚΙΝΗΣΗ ΤΟΥ ΠΑΙΧΝΙΔΙΟΥ
        ArrayList<Item> listItems = new ArrayList<Item>();
        Player player = new Player();
        //Οταν φορτωσει η φορμα και κανει initialize φωρτωσε τα παρακατω
        listItems.add(new Item("sword of Wisdom","Ειναι το σπαθι του γιου του βασιλια Περσεα. Χρησημοποιησε το με σοφια",1,2));
        listItems.add(new Item("Ring of Ages","Το δαχτυλιδι του Βασιλια Αντιγονου. Θα σου φωτησει τον δρομο τον δρομο εκει που κανενα φως δεν θα μπορει",1,2));
        listItems.add(new Item("Jewel","Ενα διαμαντι. Συνηθως ενσωματονονται με αλλα αντικειμενα",1,2));
        listItems.add(new Item("Crown of Justice","Κανενας δεν μπορει να κρυφτει απο αυτο το στεμα. Η δικαιοσυνη παντοτε θα θριαμβευει",1,2));
        outputTextBox.setText(listItems.toString());

        outputTextBox.setText(outputTextBox.getText() + "\n\n************************************************\n\n");
        outputTextBox.setText(outputTextBox.getText() + player.toString());
        outputTextBox.setText(outputTextBox.getText() + "\n\n************************************************\n\n");
        outputTextBox.setText(outputTextBox.getText() + new Message().getWelcomeMessage());

    }

    public void handleButtonClick(ActionEvent actionEvent) {
        try {
            outputTextBox.setText(outputTextBox.getText() + caret + inputTextField.getText() + "\n");
            inputTextField.clear();
            TextArea.setCaretPosition(outputTextBox.getDocument().getLength());
            outputTextBox.
            //JOptionPane.showMessageDialog(null, "Message", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
//            if (actionEvent) {
//
//            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Message", "InfoBox: " , JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void onEnter(ActionEvent actionEvent) {
        //inputTextBox.setText(actionEvent.getSource().getClass().toString());
        outputTextBox.setText(outputTextBox.getText() + caret + inputTextField.getText() + "\n");
        inputTextField.clear();




        //Time time = new Time();
        //inputTextBox.setText(Integer.toString( time.getAgeInSeconds()));
    }
}
