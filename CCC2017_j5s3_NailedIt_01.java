// STEM Yard, 2020-11
import java.util.*;
public class CCC2017_j5s3_NailedIt_01 {
  public static void main(String[]args) {

    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine().trim();
    int N = Integer.parseInt(str);
   
    String[] words = sc.nextLine().trim().split(" ");
    int[] L = new int[N]; 

    for (int j=0; j < N; j++)
      L[j] = Integer.parseInt(words[j]);

    int[] boards = new int [4002]; 
    int[] woods = new int [2001]; 

    for (int i : L) {
      woods[i] += 1;    // count woods with same height
    }

    // pairing 2 collections of woods in all combinations, 
    // and count with same (x+y) height 
    for (int x=1; x < 2001; x++) {
        for (int y = x; y < 2001; y++) { // nested loop, 2000x2000, not too large
            if (x == y)
               boards[x+y] += woods[x]/2; 
            else
               boards[x+y] += Math.min(woods[x], woods[y]); // e.g., 3 x's, 5 y's, get 3 (x+y)'s, maybe 0
        }
    }
    int maxBoards = 0; // max number of boards with same height
    for (int b : boards)
        if (b > maxBoards)
          maxBoards = b;

    int ff = 0; // how many kinds of boards have same counts (fense length)
    for (int i: boards)
        if (i == maxBoards) 
          ff += 1;

    System.out.println (maxBoards + " " + ff);

  	 sc.close();
  }
  
 
}

/*
Sample Input 1
4
1 2 3 4

Output for Sample Input 1
2 1
Explanation for Output for Sample Input 1
Tudor first combines the pieces of wood with lengths 1 and 4 to form a board of length 5. Then he
combines the pieces of wood with lengths 2 and 3 to form another board of length 5. Finally, he
combines the boards to make a fence with length 2 and height 5.
--------------------------------------------
Sample Input 2
5
1 10 100 1000 2000

Output for Sample Input 2
1 10
Explanation for Output for Sample Input 2
Tudor can’t make a fence longer than length 1, and there are 10 ways to make a fence with length
1 by choosing any two pieces of wood to nail together. Specifically, he may have a fence of height
11, 101, 1001, 2001, 110, 1010, 2010, 1100, 2100 and 3000.
Version*/