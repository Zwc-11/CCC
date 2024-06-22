/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class CCC_2019_J3 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    
    int line = sc.nextInt();
    
    String[] symbol = new String[line];
    
    for(int i = 0; i <line ; i++){
      symbol[i] = sc.nextLine();
   }
    
    
    
    for(int i = 0; i < line; i++)
    {
      int count = 1;
      for(int x = 0; x < symbol[i].length(); x++)
      {
        if(symbol[i].charAt(x) != symbol[i].charAt(x+1))
        {
     
          System.out.println(count + " " + symbol[i].charAt(x) + " ");
          count=1;
        }
        else
        {
        count ++;
        
        }
      
      }
      System.out.print(" ");
    }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
