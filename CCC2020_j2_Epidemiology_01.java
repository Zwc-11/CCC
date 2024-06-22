// STEM Yard, 2020-11
import java.util.*;
public class CCC2020_j2_Epidemiology_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt(); 
      int N = sc.nextInt(); // # on day 0
		int R = sc.nextInt(); // ratio
      
      int sum = N;
      int newp = N;
      int days = 0;
      for(;;) {
         if(sum > P)
            break;
         days++;
         newp *= R; 
         sum +=newp;
      }
      System.out.println(days);

		sc.close();
	}
}

/*
Sample Input 1
750
1
5

Output for Sample Input 1
4
Explanation of Output for Sample Input 1
The 1 person on Day 0 with the disease infects 5 people on Day 1. On Day 2, exactly 25 people
are infected. On Day 3, exactly 125 people are infected. A total of 1 + 5 + 25 + 125 + 625 = 781
people have had the disease by the end of Day 4 and 781 > 750.
---------------------------------------------------
Sample Input 2
10
2
1

Output for Sample Input 2
5
La version franc¸aise figure `a la suite de la version anglaise.
Explanation of Output for Sample Input 2
There are 2 people on Day 0 with the disease. On each other day, exactly 2 people are infected. By
the end of Day 4, a total of exactly 10 people have had the disease and by the end of Day 5, more
than 10 people have had the disease.
*/