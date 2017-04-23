/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorkproject.Classes.Game.Controller;

import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.*;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import zorkproject.Classes.Game.Classes.*;
import zorkproject.Classes.Game.Classes.Function.Functions;
import zorkproject.ZorkProject;

import javax.swing.*;
import javax.swing.text.Caret;
import javax.swing.text.DefaultCaret;

import static javax.swing.text.DefaultCaret.ALWAYS_UPDATE;


public class UIController  implements Initializable {
    @FXML public TextArea outputTextField;
    public TextField inputTextBox;
    private String caret = "->";
    private Command command = new Command();
    private Functions functions = new Functions(10,10);
    public Game game = new Game();
    Schene schene = new Schene();
    Player player = new Player();
    private ArrayList<Item> listItems = new ArrayList<Item>();


    //ΚΑΤΑ ΤΗΝ ΔΙΑΡΚΕΙΑ ΠΟΥ ΦΟΡΤΩΝΕΙ ΤΟ ΠΡΟΓΡΑΜΜΑ, ΦΟΡΤΩΣΕ ΚΑΙ ΑΥΤΟ
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO ΠΡΟΣΩΡΙΝΗ ΑΠΟΘΗΚΕΥΣΗ ΑΝΤΙΚΕΙΜΕΝΩΝ Item ΚΑΙ ΔΗΜΙΟΥΡΓΙΑ ARRAYLIST ΚΑΤΑ ΤΗΝ ΕΚΚΙΝΗΣΗ ΤΟΥ ΠΑΙΧΝΙΔΙΟΥ
        //TODO ΕΔΩ ΘΑ ΔΗΜΙΟΥΡΓΗΣΩ ΜΙΑ ΣΥΝΑΡΤΗΣΗ ΤΗΣ GAME ΟΠΟΥ ΘΑ ΦΟΡΤΩΝΕΙ ΟΛΑ ΤΑ ΑΡΧΕΙΑ ΠΟΥ ΠΡΕΠΕΙ ΝΑ ΦΟΡΤΩΣΕΙ ΓΙΑ ΝΑ ΞΕΚΙΝΗΣΕΙ ΤΟ ΠΑΙΧΝΙΔΙ
        Player player = new Player();
        //Οταν φορτωσει η φορμα και κανει initialize φωρτωσε τα παρακατω
        listItems.add(new Item("sword of Wisdom","Ειναι το σπαθι του γιου του βασιλια Περσεα. " +
                "Χρησημοποιησε το με σοφια",1,2));
        listItems.add(new Item("Ring of Ages","Το δαχτυλιδι του Βασιλια Αντιγονου. Θα σου φωτησει" +
                " τον δρομο τον δρομο εκει που κανενα φως δεν θα μπορει",1,2));
        listItems.add(new Item("Jewel","Ενα διαμαντι. Συνηθως ενσωματονονται με αλλα" +
                " αντικειμενα",1,2));
        listItems.add(new Item("Crown of Justice","Κανενας δεν μπορει να κρυφτει απο αυτο το στεμα." +
                " Η δικαιοσυνη παντοτε θα θριαμβευει",1,2));
        outputTextField.setText(listItems.toString());
        outputTextField.setText("Δωσε ονομα για να ξεκινησει το παιχνιδι");
        outputTextField.setText(outputTextField.getText() + "\n\n************************************************\n\n");
        outputTextField.setText(outputTextField.getText() + player.toString());
        outputTextField.setText(outputTextField.getText() + "\n\n************************************************\n\n");
        //outputTextField.setText(outputTextField.getText() + new Message().getWelcomeMessage());

    }
    // ΟΤΑΝ ΠΑΤΑΣ ΤΟ ENTER ΚΑΝΕ ΑΥΤΟ
    public void onEnter() {
        try {

            outputTextField.setWrapText(true);
            String textBoxString = inputTextBox.getText();
            String textFieldString = outputTextField.getText();
            //Αναγνωριση εντολης "Exit"
            //TODO αντικατασταση με hashmap
            //TODO hashmap με ρηματα
            //TODO hashmap με ουσιαστικα
            //TODO hashmap με βασικες εντολες Functions
            outputTextField.setText(listItems.toString());
            if (Objects.equals(inputTextBox.getText().trim().toLowerCase(), "new game")) {
                //Κωδικας για εναρξ νεου παιχνιδιου

                outputTextField.setText(textFieldString + caret + textBoxString);


            } else if (Objects.equals(inputTextBox.getText().trim().toLowerCase(), "Load game")) {
                // Κωδικας για φορτωση αποθηκευμενου παιχνιδιου
                functions.loadGame();
            } else if (Objects.equals(inputTextBox.getText().trim().toLowerCase(), "Save Game")) {
                // Κωδικας για αποθηκευση παιχνιδιου
                functions.saveGame();
            } else if (Objects.equals(inputTextBox.getText().trim().toLowerCase(), "Settings")) {
                // Κωδικας για περιηγηση στα Settings του παιχνιδιου και του προγραμματος.
            } else  if (Objects.equals(inputTextBox.getText().trim().toLowerCase(), "exit")) {
                /**
                 * EXIT GAME //TODO προσωρινη εκτελεση της εξωδου του παιχνιδιου
                 */
                System.exit(0);
                //Κωδικας καθαρισμου του outputTextBox
            } else if (Objects.equals(inputTextBox.getText().trim().toLowerCase(), "clear")){
                outputTextField.clear();
            } else {
                //κωδικας μη ευρεσης εντολης τυπου functions
                outputTextField.setText( textFieldString +"\n" + caret + textBoxString + functions.invalidCommand());
            }
            // Καθαριζει το πεδιο εισαγωγης απο το κειμενο
            inputTextBox.clear();
            /*Πηγαινει στο τελος της γραμμης την πλευρικη μπαρα*/
            outputTextField.setScrollTop(Double.MAX_VALUE);

            // Σε περιπτωση καποιου σφαλματος, ελτελεσε την εξαιρεση
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Message" + ex.getMessage(), "InfoBox: ", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
