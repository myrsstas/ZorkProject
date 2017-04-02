package zorkproject.Classes;

/**
 * Η κλαση Command ειναι διαχειρηζεται τισ εντολες ως αντικειμενα με μελλοντικο σκοπο αν τα αποθηκευει σε ενα αρχειο
 * κλασεων (μπορει και δυο) οπου θα ονομαζεται commands H verb και
 *
 */
public class Command {
    private String commandName;
    private String commandDescription;
    int numberOfParameters;
    Command() {
        commandName = "";
        commandDescription  = "";
    }
    Command(String n, String d) {


    }
}
