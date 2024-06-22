// STEM Yard, 2020-11
import java.util.*;
public class CCC2019_j1_WinningScore_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		int a1 = sc.nextInt(); 
      int a2 = sc.nextInt();
      int a3 = sc.nextInt();

		int b1 = sc.nextInt(); 
      int b2 = sc.nextInt();
      int b3 = sc.nextInt();

      int a = a1 * 3 + a2 * 2 + a3;
      int b = b1 * 3 + b2 * 2 + b3;

		if(a > b) System.out.println("A");
		if(b > a) System.out.println("B");
		if(a == b) System.out.println("T");

		sc.close();
	}
}

/*
Sample Input 1
10
3
7
8
9
6
Output for Sample Input 1
B
----------------------------------
Input for Sample Input 2
7
3
0
6
4
1
Output for Sample Input 2
T
*/