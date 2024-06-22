// STEM Yard, 2020-11
import java.util.*;
public class CCC2016_j4_ArrivalTime_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

      String[] words = sc.nextLine().trim().split(":");
      int hh = Integer.parseInt(words[0]);
      int mm = Integer.parseInt(words[1]);
      
      boolean[] rush = new boolean [24];
      for(int i = 0; i < 24; i++)
        if((i >=  7 && i < 10) || (i >= 15 && i < 19))
           rush[i] = true;
        else
           rush[i] = false;

      int mtogo = 60*2;   // normal time
      int arrh = hh;
      int arrm = 0;
      if((mm == 0) && (hh <=5 || hh >= 19)) { // short-cuts
         arrh +=2; arrm = mm;
      }
      else if((mm > 0) && hh <= 4 || hh > 19) { // short-cuts
         arrh +=2 ; arrm = mm;
      }
      else {    
        for(int h = hh; h <= hh + 6; h++) {
          if(mtogo == 0) {arrm=0; break;}
          if(rush[h] == false) { // easy to feagure out
            if(h== hh) {mtogo -= 60 - mm; arrh++;}
            else if( mtogo >= 60) { mtogo -= 60; arrh++;}
            else { arrm = mtogo; break;}
          }  
          else { // rush[h] == true
             if(mtogo >= 30) { mtogo -= 30; arrh++; }
             else { arrm = mtogo*2; break; }        
          }   
        }
      }
      arrh %= 24;
      System.out.println(String.format("%02d", arrh) + ":" + 
                         String.format("%02d", arrm));

  	   sc.close();
	}
}

/*
Sample Input 1
05:00

Output for Sample Input 1
07:00
Explanation for Output for Sample Input 1
Fiona does not encounter any rush-hour traffic, and leaving at 5am, she arrives at exactly 7am.
----------------------------
Sample Input 2
07:00

Output for Sample Input 2
10:30
Explanation for Output for Sample Input 2
Fiona drives for 3 hours in rush-hour traffic, but only travels as far as she normally would after
driving for 1.5 hours. During the final 30 minutes (0.5 hours) she is driving in non-rush-hour
traffic.
----------------------------
Sample Input 3
23:20

Output for Sample Input 3
01:20
Explanation for Output for Sample Input 3
Fiona leaves at 11:20pm, and with non-rush-hour traffic, it takes two hours to travel, so she arrives
at 1:20am the next day.
*/