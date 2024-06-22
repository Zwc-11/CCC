// STEM Yard, 2020-11
import java.util.*;
public class CCC2018_j1_TelemarketerOrNot_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt(); 
      int n2 = sc.nextInt();
      int n3 = sc.nextInt();
		int n4 = sc.nextInt(); 

      if( (n1 == 8 || n1 == 9) &&
          (n2 == n3) &&
          (n4 == 8 || n4 == 9) ) 
          System.out.println("ignore");
      else
          System.out.println("answer");
 
		sc.close();
	}
}

/*
Sample Input 1
9
6
6
8

Output for Sample Input 1
ignore
Explanation of Output for Sample Input 1
The first digit is 9, the last digit is 8, and the second and third digit are both 6, 
so this is a telemarketer
number.
----------------------------------
Sample Input 2
5
6
6
8

Output for Sample Input 2
answer
Explanation of Output for Sample Input 2
The first digit is 5, and so this is not a telemarketer number.
*/