package zorkproject.Classes.Game.Classes;

import com.sun.javafx.image.impl.ByteIndexed;

/*
* Κλαση Character: Χρησημοποιητε για να δημιουγουνται χαρακτηρες τυπου φαντασμα, μαγος
* Η λογικη ειναι να μπορουμε να προσθετουμε , να αφαιρουμε η να επεξεργαζοματσε αντικειμενα χαρακτηρων οπου θα μπορουμε
 * να τα κανουμε διαχειρηση μεσα στο παιχνιδι. Πιθανον να αλλαξουμε την λογικη και να κληρονομει τις ιδιοτητες απο την
  * κλαση Player
*/
// TODO Πιθανη κληρονομηκοτητα απο τον Player
public class Character 
{

    private String name;
    private int score;
    private int health;
    private int position;

    //Constructors
    Character () 
    {
        name = "Player1";
        score = 0;
        health = 100;
        position = 0;
    }
    
    
    Character(String n)
    {
        name = n;
        
    }
    
    Character(String n, int s , int h , int p)
    {
        name = n;
        score = s;
        health = h;
        position = p;
        
    }
    //Getters and setters
    //Name
     public void setNameCharacter(String name)
     {
         this.name = name;
     }
     
     public String getNameCharacter()
     {
       return (name);
       
     }
     //Score
     public void setScoreCharacter(int score)
     {
         this.score = score;
     }
     public int getScorePlayer()
     {
       return (score);  
     }
     //Health
     public void setHealthCharacter(int health)
     {
       this.health = health;    
     }
     
     public int getHealthCharacter()
     {
         return (health);
         
     }
     //Position
     public void setPositionCharacter(int position)
     {
         this.position = position;
         
     }
     
     public int getPositionCharacter()
     {
         return (position);
     }     
}
