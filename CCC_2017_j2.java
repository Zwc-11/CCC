/**
 * Auto Generated Java Class.
 */
import java.util.*;
import java.util.Scanner;
public class CCC_2017_j2 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    
    int line1 = sc.nextInt();
    int line2 = sc.nextInt();
    
    int total = line1;
  
    for(int i =1; i <= line2; i++){
    int number = (int)(line1 * Math.pow(10,i));
    total += number;
    }
  
  /* ADD YOUR CODE HERE */
    System.out.println(total);
}
}