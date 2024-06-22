// STEM Yard, 2020-11
import java.util.*;
public class CCC2018_j2_OccupyParking_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
      
      int N = sc.nextInt();
      // Consuming the leftover new line using the nextLine() method 
      sc.nextLine(); 

		String day1 = sc.nextLine();
		String day2 = sc.nextLine();
      int count = 0;
      for( int i = 0; i < N; i++) {
			if(day1.charAt(i) == 'C' &&
            day2.charAt(i) == 'C')
            count++; 
      }
		System.out.println(count);
		sc.close();
	}
}

/*
Sample Input 1
5
CC..C
.CC..

Output for Sample Input 1
1
Explanation of Output for Sample Input 1
Only the second parking space from the left was occupied yesterday and today.
-------------------------------------------
Sample Input 2
7
CCCCCCC
C.C.C.C

Output for Sample Input 2
4
Explanation of Output for Sample Input 2
The first, third, fifth, and seventh parking spaces were occupied yesterday and today.
*/