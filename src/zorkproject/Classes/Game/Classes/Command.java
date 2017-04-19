package zorkproject.Classes.Game.Classes;

import java.lang.reflect.GenericSignatureFormatError;

/**
 * Η κλαση Command ειναι διαχειρηζεται τισ εντολες ως αντικειμενα με μελλοντικο σκοπο αν τα αποθηκευει σε ενα αρχειο
 * κλασεων ( δυο) οπου θα ονομαζεται commands H verb (ρημα) και noun (ουσιαστικο)
 * Λιστα εντολων:
 * --------------ΕΝΤΟΛΕΣ ΠΑΙΧΝΙΔΙΟΥ -------------------
 * 1) go north (directions)
 *      east
 *      west
 *      south
 * 2) pick (up) <item list>
 * 3) about (program and programmers and all kind of stuff)
 * 4) info (about mission of the game and the objectives)
 * 5) help ? (about commands and parameters)
 * 6) look (around ??)
 * 7) Examine (item)
 * 8) inventory
 * 9) drop (item)
 * 10) open (item e.g. mail)
 * 11) talk to <name or description>
 * 12) attack <character> with <item>
 * 13) drink (item <potion>)
 *
 * -------------- ΕΝΤΟΛΕΣ FUNCTIONS -------------------
 * 3) new game
 * 4) save game
 * 5) load game
 * 6) exit game
 * 7) Settings-> Player -> Edit Player Settings
 * 8) Settings ->Character -> add new Characters
 * 9) Settings ->Character ->Edit Character Settings
 * 10) Settings -> Item - > add new Items
 * 11) Settings -> Item ->Edit Item Settings
 * 12) Settings -> Messages -> Add new Messages
 * 13) Settings ->  Messages -> Edit new Messages
 *
 *
 */
//TODO Ολες οι εντολες θα πρεπει να γινονται trim() και να ειναι lowercase().
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
