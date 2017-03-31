package zorkproject.Classes;

public class Player {
    String name;
    int movie;
    int score;
    int helth;
    int position;
    
    Player(String N)
    {
      name=N;  
    }
    
    Player(int m , int s , int h, int p )
    {
      movie = m;
      score = s;
      helth = h;
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
     
     void PrintHelthPlayer()
     {
      System.out.print(helth);
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
     
     public void setHelthPlayer(int helth)
     {
       this.helth = helth;    
     }
     
     public int getHelthPlayer()
     {
         return (helth);
         
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