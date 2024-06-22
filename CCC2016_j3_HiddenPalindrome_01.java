// STEM Yard, 2020-11
import java.util.*;
public class CCC2016_j3_HiddenPalindrome_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
      
		String str = sc.nextLine();
      char [] chars = str.toCharArray();

      int maxL = 1;
      int slen = chars.length;
      for( int i = 0; i < slen; i++) { 
        for( int j = slen-i; j > 0; j--) {  // find longer one 
          int toCheck = j;
 
          if(isPalindrome(chars, i, toCheck)) {
            if(toCheck > maxL )
               maxL = toCheck;
            break; // don't need find shorter ones
          }
        }
      }
		System.out.println(maxL);
		sc.close();
	}
   
   static boolean isPalindrome(char []chars, int start, int length) {
     int m = length % 2; // odd or even
   
     boolean yes= true;
     for( int k = 0; k < length / 2; k++) { 
        if(chars[start+k] != chars[start+(length-1)-k]) {      
          yes = false;
          break;
        }
     }
     return yes;
   }  
}

/*
Sample Input 1
banana

Output for Sample Input 1
5

Explanation for Output for Sample Input 1
The palindrome anana has 5 letters.
------------------------
Sample Input 2
abracadabra

Output for Sample Input 2
3

Explanation for Output for Sample Input 2
The palindromes aca and ada have 3 letters, and there are no other palindromes in the input
which are longer.
------------------------
Sample Input 3
abba

Output for Sample Input 3
4
*/