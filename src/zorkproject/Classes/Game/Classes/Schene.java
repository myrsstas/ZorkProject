package zorkproject.Classes.Game.Classes;


import javax.management.Descriptor;
import java.util.ArrayList;
import java.util.HashMap;

public class Schene  {
    private String name;
    private String description;
    private ArrayList<Item> item;
    private Character character;
    private int scheneCode;
    private Player schenePlayer1;/** O παιχτης του παιχνιδιου.* TODO ΠΡΟΣ ΤΟ ΠΑΡΩΝ ΓΙΝΕΤΑΙ ΜΕ ΕΝΑΝ ΠΑΙΧΤΗ*/
    private Schene nextSchene;  //Η ΕΠΟΜΕΝΗ ΣΚΗΝΗ (ΔΩΜΑΤΙΟ). ΘΑ ΓΙΝΕΤΑΙ ΜΕ ΓΡΑΦΟΥΣ

    public Schene() {
        this.name = "";
        this.description = "";
        this.item = new ArrayList<>();
        this.character = null;
        this.scheneCode = 0;
    }
    public Schene(String name,String desr, int code) {
        this.name = name;
        this.description = desr;
        this.scheneCode = code;
        item  = new ArrayList<>();
        character = null;
    }
    public Schene(String name,String desr, int code,Item item,Character character) {
        this.name = name;
        this.description = desr;
        this.scheneCode = code;
        this.item  = new ArrayList<>();
        this.item.add(item);
        this.character = character;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public int getScheneCode() {
        return scheneCode;
    }

    public void setScheneCode(int scheneCode) {
        this.scheneCode = scheneCode;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public Schene getNextSchene() {
        return nextSchene;
    }

    public void setNextSchene(Schene nextSchene) {
        this.nextSchene = nextSchene;
    }
}
