package zorkproject.Classes;


public class Character 
{
    String name;
    int score;
    int helth;
    int position;
    
    Character(String N)
    {
        name = N;
        
    }
    
    Character(int s , int h , int p)
    {
        score = s;
        helth = h;
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
      System.out.print(helth);
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
     
     public void setHelthCharacter(int helth)
     {
       this.helth = helth;    
     }
     
     public int getHelthCharacter()
     {
         return (helth);
         
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
