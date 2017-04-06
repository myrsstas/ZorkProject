package zorkproject.Classes.Game.Classes;


import javax.management.Descriptor;

public class Schene  {
    private String name;
    private String description;
    private Item[] item;
    private Character character;
    private int scheneCode;
    public Schene(String name,String desr, int code) {
        this.name = name;
        this.description = desr;
        this.scheneCode = code;
        item  = new Item[] {};
        character = null;
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

    public Item[] getItem() {
        return item;
    }

    public void setItem(Item[] item) {
        this.item = item;
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

}
