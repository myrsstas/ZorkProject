package zorkproject.Classes.Game.Classes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.PublicKey;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Ειναι τα μυνηματα που θα δινει ως απαντηση στην διαδραστικοτητα του παιχνιδιου με τον παιχτη.
 */
public class Message {
    //    private Formatter output;
//    private Scanner input;
//    private FileReader fileReader;
//    private FileWriter fileWriter;
    private String message;
    public Message (){
        setMessage("");
    }
    public Message(String m) {
        setMessage(m);
    }
    public void setMessage(String m) {
        message= m;
    }
    public String getMessage () {
        return message;
    }
    public void welcomeMessage() {
        message = "Γεια σου και καλως ηρθες στο Zork text-based game μας !!\n"
                + "Το παιχνιδι διαδραματιζεται στην Κεντρικη μακεδονια το ετος 150 μ.χ.\n"
                + " με πρωταγωνιστη τον μικρο Αιαντα, οπου βρισκεται στο Καστρο της Αμφιπολης.\n"
                + " Σκοπος σου ειναι να βοηθησεις τον μικρο Αιαντα να λυσει το μυστηριο που κρυβει το καστρο μετα την \n"
                + " καταλυψη του απο τους Ρωμαιους, κατα την πτωση του Μακεδονικου Βασιλειου, και να λυσεις τον γρυφο \n"
                + "του Βασιλια Περσεα. Ας παιξουμε !!!! \n"
                + "Πληκτρολογησε NEW, παραμυθι να κυλήσει και παιχνιδι να αρχινησει !!! \n";
    }
    //Κεντρικος Διαδρομος
    private void centralRoomMessage() {
        message  = "Βρισκεσαι στον κεντρικο θαλαμο του καστρου. Παλια εδω ηταν που ο βασιλιας Περσεας διασκεδαζε και \n"
                    + "εκανε τις μεγαλοπρεπεις συγκεντρωσεις του με πολυ φαγητο και κρασι. Τωρα ειναι αδειο και μονο οι "
                    +"φεγγυτες φωτιζουν τον χωρο. Προς τον Βορρα , Νοτο , Ανατολη και Δυση υπαρχουν πορτες. Ποιος ξερει"
                    +"Αραγε που μπορουν να οδηγουν ...";
    }
    //Κελαρι
    private void northRoomMessage() {
        message = "Βρισκεσαι στο κελαρι. Η υγρασια και οι αραχνες το περιβαλουν χαρακτηριστηκα. Μεσα στο σκοταδι \n"
                + "μια σκια αχνοφαινεται στο βαθος ... Μπορει να ειναι καποιο στοιχειο η και καποιος ανθρωπος.\n"
                + "Καποιος τροπος θα υπαρχει να το βρουμε.\n";
    }
    //Υπνοδωματιο
    private void southRoomMessage(){
        message  = "Βρισκεσαι στο υπνοδωματιο. Μπροστα σου εχει ενα κρεβατι (bed) απο καρυδια, με χειροποιητα κεντητα"
                +" σεντονια. Διπλα του εχει ενα παραθυρο κλειστο και κλειδομενο με ενα κλειδι. Δεξια σου βρισκεται μια "
                +"ντουλαπα (closet) οπου ειναι μισανοιχτη. Ολα τα πραγματα ειναι μισοκαμενα και μυριζουν μουχλα.";
    }
    //Σοφιτα
    private void eastRoomMessage() {
        message = "Βρισκεσαι στην σοφιτα. Το πατωμα τριζει και εχει μονο ενα κουτι (box).";
    }
    // Αποθηκη
    private void westRoomMessage() {

        message = "Βρισκεσαι στην αποθηκη που ειναι αδεια.";
    }
    public String getWelcomeMessage() {
        welcomeMessage();
        return getMessage();
    }
    public String getCentralRoomMessage() {
        centralRoomMessage();
        return getMessage();
    }
    public String getNorthRoomMessage() {
        northRoomMessage();
        return getMessage();
    }
    public String getSouthRoomMessage() {
        southRoomMessage();
        return getMessage();
    }
    public String getEastRoomMessage() {
        eastRoomMessage();
        return getMessage();
    }
    public String getWestRoomMessage() {
        westRoomMessage();
        return getMessage();
    }
     //TODO ΠΡΟΣΩΡΙΝΗ ΑΠΕΝΕΡΓΟΠΟΙΗΣΗ ΛΟΓΩ ΜΗ ΛΕΙΤΟΥΡΓΙΑΣ (ΛΑΝΘΑΣΜΕΝΗΣ)
//    public void openFileWrite() {
//        try {
//            fileReader = new FileReader("messages.txt");
//        } catch (SecurityException securityException) {
//            System.err.println("Δεν εχετε δικαιωματα εγγραφης σε αυτο το αρχειο");
//            System.exit(1);
//        } catch (FileNotFoundException fileNotFoundException) {
//            System.err.println("Σφαλμα δημιουργιας η προσβασης στο αρχειο");
//            System.exit(1);
//        }
//    }
//    public void openFileRead() {
//        try {
//            input = new Scanner("messages.txt");
//            File file = new File("messages.txt");
//            //System.out.print(file.getAbsolutePath());
//        } catch (SecurityException securityException) {
//            System.err.println("Δεν εχετε δικαιωματα προσβασης στο αρχειο !");
//            System.exit(1);
//        }
//    }
//    public void readRecords() {
//
//        System.out.printf("%-10s","Message");
//        try {
//
//
//            while (input.hasNext()) {
//                message.setMessage(input.next());
//                System.out.printf("%s\n",(String) message.getMessage());
//            }
//        } catch (NoSuchElementException elementException) {
//            System.err.printf("File improperly formed");
//            input.close();
//            System.exit(1);
//        }
//    }
//    public void writeRecords() {
//        Message message = new Message();
//        Scanner input = new Scanner(System.in);
//        while (input.hasNext()) {
//            try {
//                message.setMessage(input.next());
//            } catch (FormatterClosedException formatterClosedException) {
//                System.err.println("Error writting to file");
//                return;
//            }
//            catch (NoSuchElementException noSuchElementSelection) {
//                System.err.println("Invalid input please try again.");
//                input.nextLine();
//            }
//        }
//    }
//    public void closeFileRead() {
//        if (input != null) {
//            input.close();
//        }
//    }
//    public void closeFileWrite() {
//        if (output!=null) {
//            output.close();
//        }
//    }

}
