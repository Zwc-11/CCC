// STEM Yard, 2020-11
import java.util.*;
public class CCC2016_j1_TournamentSelection_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
      
      int wins = 0;
      for(int i = 0; i < 6; i++) {
        char c = sc.nextLine().charAt(0); 
        if(c == 'W')
          wins++;
      }
      
      int group = -1;
      if(wins == 5 || wins == 6) group = 1;
      if(wins == 3 || wins == 4) group = 2;
      if(wins == 1 || wins == 2) group = 3;
      
      System.out.println(group);

  	   sc.close();
	}
}

/*
Sample Input 1
W
L
W
W
L
W

Output for Sample Input 1
2
----------------------------------
Sample Input 2
L
L
L
L
L
L

Output for Sample Input 2
-1

*/