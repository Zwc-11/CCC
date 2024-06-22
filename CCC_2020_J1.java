/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class CCC_2020_J1 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int S,M,L;
    int result = 0;
    System.out.println("Enter the S"); 
    S = sc.nextInt();
    System.out.println("Enter the M");
    M = sc.nextInt();
    System.out.println("Enter the L");
    L = sc.nextInt();
    
    result = 1*S + 2*M + 3*L;
    System.out.println(result);
    
    if(result >= 10)
    {
    System.out.println("Happy");
    }
    else
    {
    System.out.println("sad");
    }
    
    
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
