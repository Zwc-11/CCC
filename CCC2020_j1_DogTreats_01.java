// STEM Yard, 2020-11
import java.util.*;
public class CCC2020_j1_DogTreats_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		int S = sc.nextInt(); 
		int M = sc.nextInt(); 
		int L = sc.nextInt(); 
      
      int score = S * 1 + M * 2 + L * 3;

      if (score >= 10) 
        System.out.println("happy");
      else
        System.out.println("sad");

		sc.close();
	}
}

/*
Sample Input 1
3
1
0

Output for Sample Input 1
sad
Explanation of Output for Sample Input 1
Barley’s happiness score is 1  3 + 2  1 + 3  0 = 5, so he will be sad.
===============================================
Sample Input 2
3
2
1

Output for Sample Input 2
happy
Explanation of Output for Sample Input 2
Barley’s happiness score is 1*3 + 2*2 + 3*1 = 10, 
so he will be happy.
*/