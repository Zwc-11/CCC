/**
 * Auto Generated Java Class.
 */



import java.util.Scanner;


public class CCC_2020_J3 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());
    int[] x = new int[num];
    int[] y = new int[num];
       for(int i = 0; i< num; i++)
    {
      String[] inputnum = sc.nextLine().split(",");
      x[i] = Integer.parseInt(inputnum[0]);
      y[i] = Integer.parseInt(inputnum[1]);
    
    }
 
    
    int xMin = Integer.MAX_VALUE;
    int xMax = Integer.MIN_VALUE;
    int yMin = Integer.MAX_VALUE;
    int yMax = Integer.MIN_VALUE;
    
    for (int i = 0; i < num; i++) {
   if (x[i] < xMin) {
    xMin = x[i];
   }
   if (x[i] > xMax) {
    xMax = x[i];
   }
   if (y[i] < yMin) {
    yMin = y[i];
   }
   if (y[i] > yMax) {
    yMax = y[i];
   }
    
   
    
    
  }
   System.out.println((xMin - 1) + "," + (yMin - 1));
    System.out.println((xMax + 1) + "," + (yMax + 1));
  /* ADD YOUR CODE HERE */
  
}
}
