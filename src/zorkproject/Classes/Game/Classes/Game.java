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
    private HashMap<Integer,Schene> scheneHashMapGame;
    Time gameTime;
    Command commandOfGame;


    Game() {
        Ridle ridle = new Ridle();
        Schene schene = new Schene();
        Item item = new Item();
    }
    public void startGame(){
        Ridle ridle = new Ridle();
        Player player = new Player();
        Command command = new Command();
    }

}
