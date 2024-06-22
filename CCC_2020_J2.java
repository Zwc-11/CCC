/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class CCC_2020_J2 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int P =0;
     int   N =0;
     int   R =0;
     int day =0;
    //System.out.println("The number of Expected number of infections ");
    P = sc.nextInt();
    //System.out.println("The people infected in fisrt day");
    N = sc.nextInt();
    //System.out.println("The number of each people can spired ");
    R = sc.nextInt();
    double total =0;
    
    while(P>total){
      day ++;
    total += (Math.pow(R,day)*N);
    }
    System.out.println(day);
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
