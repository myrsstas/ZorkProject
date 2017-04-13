package zorkproject.Classes;

/**
 * Η κλαση Command ειναι διαχειρηζεται τισ εντολες ως αντικειμενα με μελλοντικο σκοπο αν τα αποθηκευει σε ενα αρχειο
 * κλασεων (μπορει και δυο) οπου θα ονομαζεται commands H verb (ρημα)και noun (ουσιαστικο). Προς το παρων, οι βασικες
 * θα φιλοξενηθουν εδω, μεχρι να γινει αντιληπτο, πως θα γινει η αντιληπτη η λογικη της συνδεσης.
 *
 */
public class Command {
    private String commandName;
    private String commandDescription;
    private int numberOfParameters;
    Command() {
        commandName = "";
        commandDescription  = "";
    }
    Command(String name) {
        commandName = name;
    }

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String getCommandDescription() {
        return commandDescription;
    }

    public void setCommandDescription(String commandDescription) {
        this.commandDescription = commandDescription;
    }

    public int getNumberOfParameters() {
        return numberOfParameters;
    }

    public void setNumberOfParameters(int numberOfParameters) {
        this.numberOfParameters = numberOfParameters;
    }

}
