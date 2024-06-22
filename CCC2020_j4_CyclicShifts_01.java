// STEM Yard, 2020-11
import java.util.*;
public class CCC2020_j4_CyclicShifts_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
		String T = sc.nextLine().trim();
		String S = sc.nextLine().trim();
		sc.close();
      
    if (checkCyclic(T, S))
      System.out.println("yes");
    else
      System.out.println("no");
  
  }
   
  static boolean checkCyclic(String T, String S) {
    boolean has = false;
    
    //System.out.println(T);
    for (int i =0; i < S.length(); i++) {
      String c = S.substring(i) +  S.substring(0,i); 
         //System.out.println(c);
         if (T.contains(c))
           return true;
      }
    
    return has;
  }

}

/*
Sample Input 1
ABCCDEABAA
ABCDE

Output for Sample Input 1
yes
Explanation of Output for Sample Input 1
CDEAB is a cyclic shift of ABCDE and it is contained in the text ABCCDEABAA.
--------------------------------
Sample Input 2
ABCDDEBCAB
ABA

Output for Sample Input 2
no
Explanation of Output for Sample Input 2
The cyclic shifts of ABA are ABA, BAA, and AAB. None of these shifts are contained in the text
ABCDDEBCAB.
*/