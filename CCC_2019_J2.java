/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class CCC_2019_J2 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int line = sc.nextInt();
    
    int[] i1 = new int[line];
    String [] i2 = new String [line];
    
    for(int i = 0; i<line ; i++){
      
      i1[i] = sc.nextInt();
      i2[i] = sc.nextLine();
      
       }
    for(int i = 0; i < line; i++)
    {
      for(int z = 0; z < i1[i]; z++){
      System.out.print(i2[i]);
      }
      System.out.println();
    }
  
  }
  
  
  
  
  /* ADD YOUR CODE HERE */
  
}