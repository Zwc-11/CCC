// STEM Yard, 2020-11
import java.util.*;
public class CCC2018_j3_AreWeThereYet_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
      
      int [][] dis= new int [5][5];
      int [] gap = new int [5];
      int [] loc = new int [5];
      
      gap[0] = 0;
      loc[0] = 0;
      for(int i = 1 ; i < 5; i++) {
        gap[i] = sc.nextInt();
        loc[i] = loc[i-1] + gap[i];
      }
      for(int r = 0 ; r < 5; r++) {
        for(int c = 0 ; c < 5; c++) {
          System.out.print(Math.abs(loc[r]-loc[c]) + " ");
        }
        System.out.println();
      }
		sc.close();
	}
}

/*
Sample Input
3 10 12 5

Output for Sample Input
0 3 13 25 30
3 0 10 22 27
13 10 0 12 17
25 22 12 0 5
30 27 17 5 0

Explanation of Output for Sample Input
The first line of output contains:
0, since the distance from city 1 to city 1 is 0;
3, since the distance between city 1 and city 2 is 3;
13, since the distance between city 1 and city 3 is 3 + 10 = 13;
25, since the distance between city 1 and city 4 is 3 + 10 + 12 = 25;
30, since the distance between city 1 and city 5 is 3 + 10 + 12 + 5 = 30.
*/