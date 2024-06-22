/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class CCC_2019_J1 {
  
  
  public static void main(String[] args) { 
    Scanner sc  = new Scanner(System.in);
    Scanner sc1  = new Scanner(System.in);
    
    int apple_1 =sc.nextInt();
    int apple_2 = sc.nextInt();
    int apple_3 = sc.nextInt();
    int Bananas_1 = sc1.nextInt();
    int Bananas_2 = sc1.nextInt();
    int Bananas_3 = sc1.nextInt();
    
    int sum_apple  = apple_1 * 3 + apple_2 *2 + apple_3 * 1;
    int sum_Bananas = Bananas_1 * 3 +  Bananas_2 * 2 +  Bananas_3 * 1;
    
    if(sum_apple > sum_Bananas){
    System.out.println("A");
    }
    else if(sum_apple < sum_Bananas)
    {
    System.out.println("B");
    }
    else
    {
    System.out.println("T");
    }
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
