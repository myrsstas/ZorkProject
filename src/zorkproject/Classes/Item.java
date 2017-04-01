package zorkproject.Classes;

public class Item 
{
  String name;
  int code;
  int position;

  Item (String N)
  {
      name = N;
  }
  
  Item (int c , int p )
  {
      code = c;
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
}

