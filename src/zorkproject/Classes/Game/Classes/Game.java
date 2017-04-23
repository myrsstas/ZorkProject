package zorkproject.Classes.Game.Classes;

/**
* Κλαση Game
* Εδω γινεται ολη η επεξεργασια του παιχνιδιου.
* Κατα την φορτωση του παιχνιδιου,
*   *Φορτωση CommandList απο αρχειο.
*   *Φορτωση ItemList απο αρχειο.
*   *Φορτωση CharacterList απο αρχειο.
*   *Φορτωση RidleList απο αρχειο.
*   *Φορτωση σεναριου απο αρχειο. (???)
 *  *Φορτωση
* */
import zorkproject.Classes.Game.Classes.Function.Functions;

import java.util.HashMap;

public class Game {
    private Ridle ridle;
    private Schene schene;  // Προς το παρων δεν θα εχει Items. Μας ενδιαφερει η λειτουργια του
    private Item item;      // Προς το παρων δε θα εχει
    private HashMap<Integer,Schene> scheneHashMapGame;
    Time gameTime;
    /**
     *
     */
    Command commandOfGame;


    public Game() {
        this.ridle = new Ridle(); /** Υπαρχει ΗΔΗ ετοιμος γριφος στον constructor για ευκολια, αλλα μπορει να δηλωθει και νεος*/
        this.schene = new Schene();
        this.item = new Item(); /** Υπαρχουν ΗΔΗ Items, απλα μπορει να δηλωθουν και νεα */
        this.scheneHashMapGame = scheneRoomsFillMap();
    }
    public void startGame(){
        Ridle ridle = new Ridle();
        Player player = new Player();
        Command command = new Command();
    }

    public Ridle getRidle() {
        return ridle;
    }

    public void setRidle(Ridle ridle) {
        this.ridle = ridle;
    }
    public HashMap<Integer,Schene> scheneRoomsFillMap () {
        //TODO Χειροκινητη εισαγωγη χαρτη
        Message message = new Message();
        HashMap<Integer,Schene> hashMapScheneRoomObjects = new HashMap<>();
        hashMapScheneRoomObjects.put(1,new Schene("Σαλωνι",message.getCentralRoomMessage(),0));
        hashMapScheneRoomObjects.put(2,new Schene("Κελαρι",message.getNorthRoomMessage(),1));
        hashMapScheneRoomObjects.put(3,new Schene("Υπνοδωματιο",message.getSouthRoomMessage(),2));
        hashMapScheneRoomObjects.put(4,new Schene("Σοφιτα",message.getEastRoomMessage(),3));
        hashMapScheneRoomObjects.put(5,new Schene("Αποθηκη",message.getWestRoomMessage(),4));
        return hashMapScheneRoomObjects;
    }

}
