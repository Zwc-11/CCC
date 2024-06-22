// STEM Yard, 2020-11
import java.util.*;
public class CCC2019_j3_ColdCompress_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
      
		int n = sc.nextInt();
		while(n-- > 0) {          // for(int m=0; m < n; m++)
			String s = sc.next();
			int i = 0;
			for(i = 0; i < s.length(); i++) {
				char c = s.charAt(i); int cnt = 0;
				while(i < s.length()) {
					if(s.charAt(i) != c) 
                 {i--; break;}
					i++;
					cnt++;
				}
				System.out.print(cnt + " " + c + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}

/*
Sample Input
4
+++===!!!!
777777......TTTTTTTTTTTT
(AABBC)
3.1415555

Output for Sample Input
3 + 3 = 4 ! 
6 7 6 . 12 T 
1 ( 2 A 2 B 1 C 1 ) 
1 3 1 . 1 1 1 4 1 1 4 5 

*/