package zorkproject.Classes.Game.Classes.Function;

import zorkproject.Classes.Game.Classes.Game;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Θα χρησημοποιηθει για τις διαφορες λειτουργιες του προγραμματος. βασικος σκοπος του ειναι να δημιουργηθει
 * μια κλαση με διαφορες λειτουργειες οπου θα εχει προσβαση στις υπολοιπες κλασεις και θα κανει
 * παραμετροποιηση. Προς το παρων, αυτες ειναι μερικες απο τις λειτουργειες που χρησημοποιει η κλαση.
 */
public class Functions {
//    private int a;
//    private int b;

    public Functions() {

    }

    public Functions(int a, int b) {
//        this.a = a;
//        this.b = b;
    }
    private enum Status {CONTINUE,STOP};
    /*Το newgame ΔΗΜΙΟΥΡΓΕΙ ΕΝΑ ΝΕΟ ΠΑΙΧΝΙΔΙ. ΑΛΛΟ ΤΟ newgame και αλλο το STARTGAME.
    *Προς το παρων μονο μπορουμε να κανουμε να τρεχει μεσω case για επιλογες και
    * while για να τρεχει την εκαστωτε περιπτωση.
    *
    *
    * */
    public void newGame() {
        //Οταν θα παταω την εντολη new game θα πρεπει να ξεκιναει το παιχνιδι.
        Game game = new Game();
        System.out.printf("You started new game");

    }
    public void saveGame() {

    }
    public void loadGame() {

    }
    public void exitGame() {
        System.exit(0);
    }
     public String invalidCommand() {
        return "\nΜη εγκυρη εντολη, παρακαλω δοκιμαστε ξανα !!\n";
     }




    // TODO New Game
    // TODO Save Game
    // TODO Load Game
    // TODO Settings
    // TODO Settings->Player
    // TODO Settings-> Player -> Edit Player Settings
    // TODO Settings ->Character -> add new Characters
    // TODO Settings ->Character ->Edit Character Settings
    // TODO Settings -> Item - > add new Items
    // TODO Settings -> Item ->Edit Item Settings
    // TODO Settings -> Messages -> Add new Messages
    // TODO Settings ->  Messages -> Edit new Messages

    // TODO Exit Game

    //TODO Παραδειγμα διαδικασιας Save
    //TODO Στο "SAVE GAME" θα πρεπει να ελεγχω τον φακελο , εαν υπαρχει, αν οχι να τον δημιουργει και να σωζει την κλαση
    //

    //private CurrentLocation currentLocation;
//    String fileName = "data.bin";

//    public Functions ( CurrentLocation currentLocation){
//        this.currentLocation = currentLocation;
//    }
//    public void Save(){
//        try {
//            ObjectOutputStream os = new ObjectOutputStream( new FileOutputStream(fileName));
//            os.writeObject(currentLocation);
//            os.close();
//        } catch (IOException ex) {
//            Logger.getLogger(Functions.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.print("DONE SAVING TO FILE!\n");
//    }
//    public String toString() {
//        return Integer.toString( this.a) + Integer.toString(this.b);
//    }

}
