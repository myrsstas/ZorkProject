package zorkproject.Classes.Game.Classes;

/**
 * Η κλαση Command ειναι διαχειρηζεται τισ εντολες ως αντικειμενα με μελλοντικο σκοπο αν τα αποθηκευει σε ενα αρχειο
 * κλασεων ( δυο) οπου θα ονομαζεται commands H verb και
 *
 */
public class Command {
    private String commandName;
    private String commandDescription;
    public Command() {

    }
    public Command(String n, String d) {
        commandName = n;
        commandDescription = d;
    }
    //Getters and Setters Command
    //commandName
    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }
    //commandDescription
    public String getCommandDescription() {
        return commandDescription;
    }

    public void setCommandDescription(String commandDescription) {
        this.commandDescription = commandDescription;
    }
    /*
    * COMMAND LIST
    * 1. go north
    * 2. go south
    * 3. go east
    * 4. go west
    * 5. new game
    * 6. save (under production)
    * 7. load (under production)
    * 8. exit
    * */

    public void exit(int stat) {
        System.exit(stat);
    }
}
