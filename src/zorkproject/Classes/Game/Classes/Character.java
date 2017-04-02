package zorkproject.Classes.Game.Classes;

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

    
    Character () 
    {
        name = "Player1";
        score = 0;
        health = 100;
        position = 0;
    }
    
    
    Character(String N)
    {
        name = N;
        
    }
    
    Character(int s , int h , int p)
    {
        score = s;
        health = h;
        position = p;
        
    }
    
    void PrintNameCharacter()
     {
      System.out.print(name);
     }
     
     
     
     void PrintScoreCharacter()
     {
      System.out.print(score);
     }
     
     void PrintHelthCaracter()
     {
      System.out.print(health);
     }
     
     void PrintPositionCharacter()
     {
      System.out.print(position);
     }
     
     public void setNameCharacter(String name)
     {
         this.name = name;
     }
     
     public String getNameCharacter()
     {
       return (name);
       
     }
     
     
     
     public void setScoreCharacter(int score)
     {
         this.score = score;
     }
     public int getScorePlayer()
     {
       return (score);  
     }
     
     public void setHelthCharacter(int health)
     {
       this.health = health;    
     }
     
     public int getHealthCharacter()
     {
         return (health);
         
     }
     
     public void setPositionCharacter(int position)
     {
         this.position = position;
         
     }
     
     public int getPositionCharacter()
     {
         return (position);
     }     
}
