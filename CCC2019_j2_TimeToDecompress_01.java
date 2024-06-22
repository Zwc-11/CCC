// STEM Yard, 2020-11
import java.util.*;
public class CCC2019_j2_TimeToDecompress_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
      
		int N = sc.nextInt(); 
      // Consuming the leftover new line using the nextLine() method 
      sc.nextLine(); 

		for( int line = 0; line < N; line++) {
         String [] words = sc.nextLine().trim().split(" ");

			int n = Integer.parseInt(words[0]); 
         char c = words[1].charAt(0);
			
         for(int i = 0; i < n; i++) 
           System.out.print(c);
			System.out.println();
		}
		sc.close();
	}
}

/*
Sample Input
4
9 +
3 -
12 A
2 X

Output for Sample Input
+++++++++
---
AAAAAAAAAAAA
XX
*/