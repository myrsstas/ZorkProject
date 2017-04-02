package zorkproject.Classes.Game.Classes;

public class Player {
    private String name = "Player1"; // TODO Ππεπει να κανουμε την αριθμηση του παιχτη σωστα με εναν μετρητη
    private int moves;
    private int score;
    private int health;
    private int position;
    private Inventory inventory;

    Player (){
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
     void PrintNamePlayer()
     {
      System.out.print(name);
     }
     
     void PrintMovesPlayer()
     {
      System.out.print(moves);
     }
     
     void PrintScorePlayer()
     {
      System.out.print(score);
     }
     
     void PrintHealthPlayer()
     {
      System.out.print(health);
     }
     
     void PrintPositionPlayer()
     {
      System.out.print(position);
     }
     
     public void setNamePlayer(String name)
     {
         this.name = name;
     }
     
     public String getNamePlayer()
     {
       return (name);
       
     }
     
     public void setMovesPlayer(int moves)
     {
          this.moves = moves;
     }
     
     public int getMovesPlayer()
     {
       return (moves);  
     }
     
     public void setScorePlayer(int score)
     {
         this.score = score;
     }
     public int getScorePlayer()
     {
       return (score);  
     }
     
     public void setHealthPlayer(int health)
     {
       this.health = health;    
     }
     
     public int getHealthPlayer()
     {
         return (health);
         
     }
     
     public void setPositionPlayer(int position)
     {
         this.position = position;
         
     }
     
     public int getPositionPlayer()
     {
         return (position);
     }     
}
