// STEM Yard, 2020-11
import java.util.*;
public class CCC2019_j4s1_Flipper_01 {
  public static void main(String[]args) {

    Scanner sc = new Scanner(System.in);
      
    String str = sc.nextLine().trim();
    char [] hv = str.toCharArray();
	 sc.close();
    
    flipping(hv);
       
  }
  
  static void flipping(char [] hv) {
    int [][] grid = {{1,2}, {3,4}};
    int [] tmp = new int[2];
      
    for(int i=0; i< hv.length; i++) {
      if(hv[i] == 'H') {
        tmp[0] = grid[0][0];
        tmp[1] = grid[0][1];
        grid[0][0] = grid[1][0];
        grid[0][1] = grid[1][1];
        grid[1][0] = tmp[0];
        grid[1][1] = tmp[1];
      }
      else {
        tmp[0] = grid[0][0];
        tmp[1] = grid[1][0];
        grid[0][0] = grid[0][1];
        grid[1][0] = grid[1][1];
        grid[0][1] = tmp[0];
        grid[1][1] = tmp[1];
      }
    }
    
    System.out.println(grid[0][0] + " " + grid[0][1]);
    System.out.println(grid[1][0] + " " + grid[1][1]);
  }


}

/*
Sample Input 1
HV

Output for Sample Input 1
4 3
2 1
-----------------------------------------
Sample Input 2
VVHH

Output for Sample Input 2
1 2
3 4
*/