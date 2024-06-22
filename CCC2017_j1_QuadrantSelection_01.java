// STEM Yard, 2020-11
import java.util.*;
public class CCC2017_j1_QuadrantSelection_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt(); 
      int y = sc.nextInt();

      int q = 0;
		if(x > 0 && y > 0) q = 1;
		if(x < 0 && y > 0) q = 2;
		if(x < 0 && y < 0) q = 3;
		if(x > 0 && y < 0) q = 4;
         
      System.out.println(q);

		sc.close();
	}
}

/*
Sample Input 1
12
5

Output for Sample Input 1
1
--------------------------------------
Sample Input 2
9
-13

Output for Sample Input 2
4
--------------------------------------
Self defined
Sample Input 3
-9
13

Output for Sample Input 2
2
--------------------------------------
Self defined
Sample Input 4
-9
-13

Output for Sample Input 2
2


*/