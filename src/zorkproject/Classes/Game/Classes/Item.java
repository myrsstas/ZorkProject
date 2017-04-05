package zorkproject.Classes.Game.Classes;

public class Item 
{
  private String name;
  private String description;
  private int code;         //TODO  Πρεπει να το ενσωματωσουμε στο υπολοιπο προγραμμα
  private int position;
  private Boolean pickable; // TODO Πρεπει να το ενσωματωσουμε στο υπολοιπο προγραμμα

  Item (String N)
  {
      name = N;
  }
  
  Item (int c , int p )
  {
      code = c;
      position = p;
  }
  public Item(String n,String d,int c,int p){
      name=n;
      description=d;
      code=c;
      position = p;
  }
  
  void printNameITem()
  {
    System.out.print(name);
    
  }
  
  void printCodeItem()
  {
      System.out.print (code);
  }
    


void printPositionItem()
{
    System.out.print(position);

}

public void setNameItem(String name)
     {
         this.name = name;
     }
     
     public String getNameItem()
     {
       return (name);
       
     }
     
     
     
     public void setCodeItem(int code)
     {
         this.code = code;
     }
     public int getCodeItem()
     {
       return (code);  
     }
     
    public void setPositionItem(int position)
     {
         this.position = position;
         
     }
     
     public int getPositionItem()
     {
         return (position);
     }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return (this.getNameItem()+ " "+
                this.getDescription() + " "+
                this.getCodeItem() +" "+
                this.getPositionItem()+"\n");
    }
}

