// STEM Yard, 2020-11
import java.util.*;
public class CCC2017_j3_ExactlyElectrical_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		int ax = sc.nextInt(); 
      int ay = sc.nextInt();
		int bx = sc.nextInt(); 
      int by = sc.nextInt();
      int t = sc.nextInt();

      int min_t = Math.abs(ax - bx) + Math.abs(ay - by);
      if (t < min_t)
         System.out.println("N");
      else if  (t == min_t)
         System.out.println("Y");
      else
      {  // take around will increase even number of units
         // so target t and mint_t both must be even, or odd
         if ((t - min_t) % 2 == 0) // all even, or all odd
            System.out.println("Y");
         else  
            System.out.println("N");
      } 

		sc.close();
	}
}

/*
Sample Input 1
3 4
3 3
3

Output for Sample Input 1
Y
Version franc¸aise sont apr`es la version anglaise
Explanation for Output for Sample Input 1
One possibility is to travel from (3; 4) to (4; 4) to (4; 3) to (3; 3).
------------------------------------------------------------------------
Sample Input 2
10 2
10 4
5

Output for Sample Input 2
N
Explanation for Output for Sample Input 2
It is possible to get from (10; 2) to (10; 4) using exactly 2 units of electricity, by going north 2
units.
It is also possible to travel using 4 units of electricity as in the following sequence:
(10; 2) ! (10; 3) ! (11; 3) ! (11; 4) ! (10; 4):
It is also possible to travel using 5 units of electricity from (10; 2) to (11; 4) by the following
sequence:
(10; 2) ! (10; 3) ! (11; 3) ! (12; 3) ! (12; 4) ! (11; 4):
It is not possible to move via any path of length 5 from (10; 2) to (10; 4), however.
------------------------------------------------------------------------
Sample Input j3.15.in
-2 -2
2 1
7

Output from j3.15.out
Y

*/