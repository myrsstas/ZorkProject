package zorkproject.Classes.Game.Classes;

public class Item {
    private String name;
    private String description;
    private int code;         //TODO  Πρεπει να το ενσωματωσουμε στο υπολοιπο προγραμμα
    private int position;
    private Boolean pickable; // TODO Πρεπει να το ενσωματωσουμε στο υπολοιπο προγραμμα

    public Item() {
        name = "";
        description = "";
        code = 0;
        position = 0;
        pickable = null;
    }

    Item(String name) {
        this.name = name;
        description = "";
        code = 0;
        position = 0;
        pickable = null;
    }

    Item(int code, int position) {
        name = "";
        description = "";
        this.code = code;
        this.position = position;
        pickable = null;
    }

    public Item(String name, String description, int code, int position) {
        this.name = name;
        this.description = description;
        this.code = code;
        this.position = position;
        pickable = null;
    }

    void printNameITem() {
        System.out.print(name);

    }

    void printCodeItem() {
        System.out.print(code);
    }


    void printPositionItem() {
        System.out.print(position);

    }

    public void setNameItem(String name) {
        this.name = name;
    }

    public String getNameItem() {
        return (name);

    }


    public void setCodeItem(int code) {
        this.code = code;
    }

    public int getCodeItem() {
        return (code);
    }

    public void setPositionItem(int position) {
        this.position = position;

    }

    public int getPositionItem() {
        return (position);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getPickable() {
        return pickable;
    }

    public void setPickable(Boolean pickable) {
        this.pickable = pickable;
    }

    @Override
    public String toString() {
        return (this.getNameItem() + " " +
                this.getDescription() + " " +
                this.getCodeItem() + " " +
                this.getPositionItem() + "\n");
    }
}

