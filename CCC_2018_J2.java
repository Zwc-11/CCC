/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class CCC_2018_J2 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    int line1 = sc.nextInt();
    String line2 = sc1.nextLine();
    String line3 = sc1.nextLine();
    
    int counter = 0;
    
    for(int i =0; i < line1; i++){
      if(line2.charAt(i) == line3.charAt(i) && line2.charAt(i) == 'C'){
      counter ++;
     
      }

    }
    System.out.println(counter);
  }
  
  /* ADD YOUR CODE HERE */
  
}
