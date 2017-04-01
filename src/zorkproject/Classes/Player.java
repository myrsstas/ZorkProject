package zorkproject.Classes;

public class Player {
    String name;
    int movie;
    int score;
    int health;
    int position;
    
    Player(String N)
    {
      name=N;  
    }
    
    Player(int m , int s , int h, int p )
    {
      movie = m;
      score = s;
      health = h;
      position = p;
      
    }
     void PrintNamePlayer()
     {
      System.out.print(name);
     }
     
     void PrintMoviePlayer()
     {
      System.out.print(movie);
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
     
     public void setMoviePlayer(int movie)
     {
          this.movie = movie;
     }
     
     public int getMoiePlayer()
     {
       return (movie);  
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
