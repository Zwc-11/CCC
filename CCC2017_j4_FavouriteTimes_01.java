// STEM Yard, 2020-11
import java.util.*;
public class CCC2017_j4_FavouriteTimes_01 {
  public static void main(String[]args) {

    Scanner sc = new Scanner(System.in);

    String strD = sc.nextLine().trim();
    int  D = Integer.parseInt(strD);
      
    // Every 60*12 = 720 min, the clock takes a round 
    // from 12:00 to 11:59 + 1
    int hours12 = D / (60*12-1);
    int minutes = D % (60*12);
    int countIn12Hours = 0;
    int countInMinutes = 0;
    if(hours12 > 0)
      countIn12Hours = countSequences(60*12-1);
    
    countInMinutes = countSequences(minutes);
    int countTotal = countIn12Hours * hours12 + countInMinutes;

    //System.out.println(D + " 12 h = " + hours12);
    
    System.out.println(countTotal);

  	 sc.close();
  }
  
  static int countSequences(int m) {
    // 0 <= m <= 60*12 = 720
    int h=0;
    int min = 0;
    int [] digits = new int [4];
    int countS = 0;
    int countOneHour = 0;
    for(int i = 0; i <= m; i++) {
      if(i/60 == 0)
        h = 12;
      else
        h = i/60;
      
      min = i % 60;
      
      digits[0] = h/10;
      digits[1] = h%10;
      digits[2] = min/10;
      digits[3] = min%10;
   // System.out.println(digits[0] + " " + digits[1] + " " +digits[2] + " " +digits[3]);
      
      if(digits[0] == 0) { // ignore leading '0'
        if(digits[1] - digits[2] == digits[2] - digits[3])
          countS += 1;
      }
      else { // 10, 11, 12 
        if((digits[0] - digits[1] == digits[1] - digits[2])
            && 
           (digits[1] - digits[2] == digits[2] - digits[3]))
          countS += 1;
      }
      
    }
    //System.out.println(countS);
    return countS;
  }

}

/*
Sample Input 1
34

Output for Sample Input 1
1
Explanation of Output for Sample Input 1
Between 12:00 and 12:34, there is only the time 12:34 for which the digits form an arithmetic
sequence.
-------------------------------------
Sample Input 2
180

Output for Sample Input 2
11

Explanation of Output for Sample Input 2
Between 12:00 and 3:00, the following times form arithmetic sequences in their digits (with
the difference shown:
 - 12:34 (difference 1),
 - 1:11 (difference 0),
 - 1:23 (difference 1),
 - 1:35 (difference 2),
 - 1:47 (difference 3),
 - 1:59 (difference 4),
 - 2:10 (difference -1),
 - 2:22 (difference 0),
 - 2:34 (difference 1),
 - 2:46 (difference 2),
 - 2:58 (difference 3).
*/