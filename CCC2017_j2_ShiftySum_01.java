// STEM Yard, 2020-11
import java.util.*;
public class CCC2017_j2_ShiftySum_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); 
      int k = sc.nextInt();

      long sum = N;
      long shifted = N;
      for(int i=0; i < k; i++) {
        shifted *= 10;
        sum += shifted;
      }
         
      System.out.println(sum);

		sc.close();
	}
}

/*
Sample Input
12
3
Output for Sample Input
13332
*/