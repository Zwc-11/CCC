// CCC 2020 j5_s2
// STEM Yard, 2020-11
// Copyright reserved

// EscapeRoom.java
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Stack;
import java.util.Set;
import java.util.HashSet;
//import java.util.*;

/*class ArrayIndex {

  public int row, col;
  
  /*public ArrayIndex(int row_index, int col_index) {
    row = row_index;
    col = col_index;  
  } 
  
}
*/
public class EscapeRoomV04 {
   public static void main(String[] args) {
    
    EscapeRoomV04 es = new EscapeRoomV04();
    es.loadData();
    
    if (es.findEscape())
      System.out.println("yes");
    else
      System.out.println("no");
  }
  
  public int M, N;
  public int target;
  public int [][] arr;
  public boolean canEscape = false;
  
  //public Stack <ArrayIndex> jumps_stack = new Stack <ArrayIndex>(); 
  public Stack <Integer> jumps_stack = new Stack <Integer>(); 
  public HashSet <Integer> appeared_set = new HashSet <Integer>(); 
  
  public int unionIndex (int r, int c) {
    //System.out.println("u=" + (r*10000 + c));
    return r*10000 + c;
  }
  
  public int indexRow (int union_i) {
    //System.out.println("r=" + (union_i / 10000)+ ", u " + union_i);
    return union_i / 10000;
  }

  public int indexCol (int union_i) {
    //System.out.println("c=" + (union_i - union_i / 10000 * 10000)+ ", u " + union_i);
    return union_i % 10000;
    //return union_i - union_i / 10000 * 10000;
  }

  public boolean findEscape() {
    target = M * N;
    
    System.out.println("M=" + M + ", N=" + N);
    // start from [0,0] cell
    jumps_stack.push(unionIndex(0, 0));
    appeared_set.add(arr[0][0]);
    
    while (jumps_stack.size() > 0)
    {
      int union_i = jumps_stack.pop();
      findJumps (indexRow(union_i), indexCol(union_i));
    }
//
    return canEscape;
  }

  public void findJumps(int row, int col) 
  { 
    int m = row;
    int n = col; 
    boolean foundJump = false;
    
    if (arr[m][n] == target)
    {
       canEscape = true;
       return;
    }

    // find jumps from cell arr[m][n]
    int jump_m_by_n = arr[m][n];
   
    for (int r = 0; r < M; r++)
    {
      double divide = (double)jump_m_by_n / (double)(r+1);
      int i_divide = (int)divide;
      
      if (i_divide > N)
        continue;
      
      if ((r+1) * i_divide == jump_m_by_n)
      {
        int c = i_divide - 1;
        if (arr[r][c] == target)
        {
          canEscape = true;
          return;
        }
        
        if (!appeared_set.contains(arr[r][c]))
        {
          appeared_set.add(arr[r][c]);
          jumps_stack.push(unionIndex(r, c));
          //System.out.println("r= " + r + ", c= " + c);
          foundJump = true;
        }
        //else
        //  System.out.print("appeared ");
      }
    }

  }

  public void loadData() {
    String data_folder = "../CCC/all_data/junior_data/j5_s2/";
    try {
      String fname;
      fname = "j5.01.01.in";
      fname = "j5.01.01.in";
      fname = "j5.02.01.in";   // one row
      fname = "j5.02.02.in";   // one row
      fname = "j5.07.07.in";
      
      fname = "j5.sample.in"; // yes

      // M = 2 and N = 2; Tested
      fname = "j5.01.01.in"; // yes
      fname = "j5.01.02.in"; // yes
      fname = "j5.01.03.in"; // yes
      fname = "j5.01.04.in"; // no tested
      fname = "j5.01.05.in"; // no
      fname = "j5.01.06.in"; // no
      fname = "j5.01.07.in"; // no 

      // M = 1; Tested                
      //  fname = "j5.02.01.in"; // yes
      //  fname = "j5.02.02.in"; // yes
      //  fname = "j5.02.03.in"; // no
      //  fname = "j5.02.04.in"; // no
      //  fname = "j5.02.05.in"; // no
      //  fname = "j5.02.06.in"; // no

      // all of the integers in the cells will be unique.
      //  fname = "j5.03.01.in"; // no tested
      //  fname = "j5.03.02.in"; // no tested
      //  fname = "j5.03.03.in"; // yes tested
      //  fname = "j5.03.04.in"; // yes tested
      //  fname = "j5.03.05.in"; // no tested //# error caused by j5.03.05.in has several extra blank lines
      //  fname = "j5.05.01.in"; // no tested
      //  fname = "j5.05.02.in"; // no tested
      //  fname = "j5.05.03.in"; // yes tested
      //  fname = "j5.05.04.in"; // yes tested

      // M >= 200 and N >= 200; Tested
      //  fname = "j5.06.01.in"; // no tested
      //  fname = "j5.06.02.in"; // no tested
      //  fname = "j5.06.03.in"; // yes tested
      // fname = "j5.06.04.in"; // yes tested
      //  fname = "j5.06.05.in"; // yes tested
      //  fname = "j5.06.06.in"; // yes tested

      // M = 1000 and N = 1000; Tested
      //  fname = "j5.07.01.in"; // no tested
      //  fname = "j5.07.02.in"; // yes, tested
      //  fname = "j5.07.03.in"; // yes, tested
      //  fname = "j5.07.04.in"; // yes, tested
      //  fname = "j5.07.05.in"; // yes, tested
      //  fname = "j5.07.06.in"; // yes, tested 
      fname = "j5.07.07.in"; // yes, tested
      
      String file_and_folder = data_folder + fname; 
      File f = new File(file_and_folder);
      
      Scanner myReader = new Scanner(f);
      String strM = myReader.nextLine();
      String strN = myReader.nextLine();
      M = Integer.parseInt(strM);
      N = Integer.parseInt(strN);
      arr = new int[M][N];
      
      while (myReader.hasNextLine()) {
         for (int i=0; i<arr.length; i++) {
            String[] line = myReader.nextLine().trim().split(" ");
            for (int j=0; j<line.length; j++) {
               arr[i][j] = Integer.parseInt(line[j]);
               //System.out.print(" " + arr[i][j]);
            }
            //System.out.println("");
         }
         break; //# some files have extrra blank lines. error caused by j5.03.05.in has several extra blank lines
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}