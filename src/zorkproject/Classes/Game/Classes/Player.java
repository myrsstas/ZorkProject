package zorkproject.Classes.Game.Classes;

import java.util.ArrayList;

public class Player {
    private String name = "Player1";
    private Character character;
    private ArrayList<Inventory> inventory = new ArrayList<>();
    private Schene currentScene;
    private int position;
    private int moves;
    private int score;
    private int health;
    private int attack;
    //Constructors
    Player(String n,Character ch,ArrayList<Inventory> in, Schene sh,int p, int m,int health, int attk) {
        name = n;
        character = ch;
        inventory = in;
        currentScene = sh;
        position = p;
        moves = m;
        this.health = health;
        attack = attk;
    }
    public Player(){
        String name = "Player1";
        Character character;
        ArrayList<Inventory> inventory = new ArrayList<>();
        moves = 0;
        score = 0;
        health = 100;
        position =0;
    }
    Player(String n)
    {
        name =n;
        moves = 0;
        score = 0;
        health = 100;
        position =0;
    }

    Player(int m , int s , int h, int p )
    {
      moves = m;
      score = s;
      health = h;
      position = p;
      
    }
    // Getters and Setters
    //Character
    public  Character getCharacter() {
        return character;
    }

    public void setCharacter(Character ch) {
        this.character = ch;
    }
    //Name
     public void setNamePlayer(String name)
     {
         this.name = name;
     }
     
     public String getNamePlayer()
     {
       return (name);
       
     }
     //Moves
     public void setMovesPlayer(int moves)
     {
          this.moves = moves;
     }
     
     public int getMovesPlayer()
     {
       return (moves);  
     }
     //Score
     public void setScorePlayer(int score)
     {
         this.score = score;
     }
     public int getScorePlayer()
     {
       return (score);  
     }
     //Health
     public void setHealthPlayer(int health)
     {
       this.health = health;    
     }
     
     public int getHealthPlayer()
     {
         return (health);
         
     }
     //Position
     public void setPositionPlayer(int position)
     {
         this.position = position;

     }
     
     public int getPositionPlayer()
     {
         return (position);
     }
    //Attack
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
    //Inventory
    public ArrayList<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Inventory> inventory) {
        this.inventory = inventory;
    }
    //Schene
    public Schene getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(Schene currentScene) {
        this.currentScene = currentScene;
    }
    @Override
    public String toString() {
        return (this.getNamePlayer()+ " "+"\n"+
                this.getCharacter() + " "+"\n"+
                this.getInventory() +" "+"\n"+
                this.getCurrentScene()+" "+"\n"+
                this.getPositionPlayer() +" "+"\n"+
                this.getMovesPlayer() +" "+"\n"+
                this.getScorePlayer() +" "+"\n"+
                this.getHealthPlayer() +" "+"\n"+
                this.getAttack() +" "+"\n");
    }
}
