// STEM Yard, 2020-11
import java.util.*;
public class CCC2016_j5s2_TandemBicycle_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
String str = "188";
int n = Integer.parseInt(str);
      int T = Integer.parseInt(sc.nextLine().trim());
      int N = Integer.parseInt(sc.nextLine().trim());

      // must use Integer, instead of int for Array sorting
      Integer [] dmo = new Integer [N];
      Integer [] peg = new Integer [N];
      
      String[] words = sc.nextLine().trim().split(" ");
      for(int i = 0; i < N; i++)
           dmo[i] = Integer.parseInt(words[i]);
      
      words = sc.nextLine().trim().split(" ");
      for(int i = 0; i < N; i++)
           peg[i] = Integer.parseInt(words[i]);
      

      Arrays.sort(dmo);
      
      if(T == 1)
        Arrays.sort(peg);
      else
        // Sorts arr[] in descending order, Tian Ji Horse Racing
        Arrays.sort(peg, Collections.reverseOrder());
      long sum = 0;
      for(int i = 0; i < N; i++)
        sum += Math.max(dmo[i], peg[i]); 
      
      System.out.println(sum);

	  	sc.close();
	}
}

/*
Sample Input 1
1
3
5 1 4
6 2 4

Output for Sample Input 1
12
Explanation for Output for Sample Input 1
There is a unique optimal solution:
 - Pair the citizen from Dmojistan with speed 5 and the citizen from Pegland with speed 6.
 - Pair the citizen from Dmojistan with speed 1 and the citizen from Pegland with speed 2.
 - Pair the citizen from Dmojistan with speed 4 and the citizen from Pegland with speed 4.
--------------------------------------------------------
Sample Input 2
2
3
5 1 4
6 2 4

Output for Sample Input 2
15
Explanation for Output for Sample Input 2
There are multiple possible optimal solutions. Here is one optimal solution:
 - Pair the citizen from Dmojistan with speed 5 and the citizen from Pegland with speed 2.
 - Pair the citizen from Dmojistan with speed 1 and the citizen from Pegland with speed 6.
 - Pair the citizen from Dmojistan with speed 4 and the citizen from Pegland with speed 4.
--------------------------------------------------------
Sample Input 3
2
5
202 177 189 589 102
17 78 1 496 540

Output for Sample Input 3
2016
Explanation for Output for Sample Input 3
There are multiple possible optimal solutions. Here is one optimal solution:
 - Pair the citizen from Dmojistan with speed 202 and the citizen from Pegland with speed 1.
 - Pair the citizen from Dmojistan with speed 177 and the citizen from Pegland with speed 540.
 - Pair the citizen from Dmojistan with speed 189 and the citizen from Pegland with speed 17.
 - Pair the citizen from Dmojistan with speed 589 and the citizen from Pegland with speed 78.
 - Pair the citizen from Dmojistan with speed 102 and the citizen from Pegland with speed 496.
This sum yields 202 + 540 + 189 + 589 + 496 = 2016.

*/