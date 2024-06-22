// STEM Yard, 2020-11
import java.util.*;
public class CCC2016_j2_MagicSquares_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

      int [][] mat = new int [4][4];
      
      for(int i = 0; i < 4; i++) {
         String[] words = sc.nextLine().trim().split(" ");
         for(int j = 0; j < 4; j++)
           mat[i][j] = Integer.parseInt(words[j]);
      }
      
      int[] rsum = new int[4];
      int[] csum = new int[4];
      // add up
      for(int i = 0; i < 4; i++) {
         for(int j = 0; j < 4; j++) {
           rsum[i] += mat[i][j];
           csum[j] += mat[i][j];
         }
      }                      
      
      boolean magic = true;
      for(int i = 1; i < 4; i++) {
        if(rsum[0] != csum[0] ||
           rsum[0] != rsum[i] ||
           csum[0] != csum[i])
           magic = false;
      }
      
      if(magic)
        System.out.println("magic");
      else
        System.out.println("not magic");

	  	 sc.close();
	}
}

/*
Sample Input 1
16 3 2 13
5 10 11 8
9 6 7 12
4 15 14 1

Output for Sample Input 1
magic
Explanation for Output for Sample Input 1
Notice that each row adds up to 34, and each column also adds up to 34.
Sample Input 2
5 10 1 3
10 4 2 3
1 2 8 5
3 3 5 0

-------------------------------------------------
Output for Sample Input 2
not magic
Explanation for Output for Sample Input 2
Notice that the top row adds up to 19, but the rightmost column adds up to 11.*/