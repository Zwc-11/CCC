// STEM Yard, 2020-11
import java.util.*;
public class CCC2019_j5_RuleOfThree_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);
      
		Rule[] rules = new Rule[3];
      
      for(int i = 0; i < 3; i++) {
        rules[i].from = sc.next();
        rules[i].to = sc.next();
      }
      S = sc.nextInt();
      I = sc.next(); // initial string
      F = sc.next(); // final string

		sc.close();
      
      // keynotes:
      // original - froms + tos == target
      // Q1: how many conbinations of 'froms' and 'tos'
      // Q2: sequence applied
      ruleOfThree();
		System.out.println();
	}
    
   static int S;
   static String I, F; 
   
   // inner classes
   static class Rule {
     public String from, to;
     public int fromAs, fromBs, ToAs, ToBs;
     public Rule(String f, String t) { 
       from = f; to = t;
       
       for (x: from)
         if (x == 'A') fromAs++; else fromBs++;
       for (x: to) 
         if (x == 'A') toAs++; else toBs++;
      }
    
   }

  static Data data = new Data(); 
  static void ruleOfThree() {
    int steps = 0;
    String newSeq = data.I;
    String temp;
    
    // find out how many times of each rules applied, without consider ther sequence
    for(int r1=1; r1 <= S; r1++) {
      for (int r2 = 1; r2 <= S; r2++) {
        if(r1 + r2 > S) continue;
        if(r1 + r2 <= S)
          r3 = S - r1 - r2;
        if(charsMatch(r1,r2,r3)) // frequency, histogram
          System.out.println(r1 + " " + r2 + " " + r3);
      }
    }

    ///
    for(;;) {
      for (int i = 0; i < newSeq.length(); i++) { // i will be changed according length 
        for (int r = 0; r < 3; r++) {
      
          int ruleLen = data.rules[r][0].length();
          if (i+ruleLen <= newSeq.length()) {
            String sub = newSeq.substring(i, i+ruleLen);
            System.out.println("sub=" + sub);
        
          if (newSeq.substring(i, i+ruleLen).equals(data.rules[r][0])) {
          //substitution 
            temp = newSeq.substring(0,i) + data.rules[r][1] + newSeq.substring(i + ruleLen-1);
            System.out.println("Rule="+ data.rules[r][0] + " Steps= " + steps + " tmp= " + temp);
            steps++;
            if (temp.equals(data.F) && steps == data.S)
              return; 
            if (steps == data.S)
            continue;

          }
        }
      }
//      if (newF.equals(F) && steps == S)
//       break; 
    }
  }
  
 }
 
 static boolean charsMatch(int r1,int r2,int r3) {// frequency, histogram
    
 }
 
 static class Data {
  public String [][] rules = new String [3][2];
  public int S;
  public String I, F;
  public Stack <RulePos> rule_stack = new Stack <RulePos>(); 
}

   static class RulePos {
     public int rule, pos;
     public RulePos parent;

     public RulePos (int rule, int pos, RulePos parent) {
       this.rule = rule;
       this.pos = pos;
       this.parent = parent;
     }
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