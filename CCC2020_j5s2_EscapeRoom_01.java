// STEM Yard, 2020-11
import java.util.*;
public class CCC2020_j5s2_EscapeRoom_01 {
  public static void main(String[]args) {
    Scanner reader = new Scanner(System.in);

    //String str;
    //str = reader.nextLine().trim();
    //int M = Integer.parseInt(str);
    //str = reader.nextLine().trim();
    //int N = Integer.parseInt(str);
    M = reader.nextInt();
    N = reader.nextInt();

    arr = new int[M][N];
      
    for (int i=0; i<M; i++) {
        for (int j=0; j<N; j++) {
           arr[i][j] = reader.nextInt();
           //System.out.print(" " + arr[i][j]);
        }
        //System.out.println("");
    }
    
    if (findEscape())
      System.out.println("yes");
    else
      System.out.println("no");

  }
  
  static boolean findEscape() {
    target = M * N;
    
    //System.out.println("M=" + M + ", N=" + N);
    // start from [0,0] cell
    jumps_stack.push(new Grid(0, 0));
    appeared_set.add(arr[0][0]);
    
    while (jumps_stack.size() > 0)
    {
      Grid rc = jumps_stack.pop();
      findJumps (rc.row, rc.col);
    }
    return canEscape;
  }
  
  static int M, N;
  static int target;
  static int [][] arr;
  static  boolean canEscape = false;
  
  //static  Stack <ArrayIndex> jumps_stack = new Stack <ArrayIndex>(); 
  static Stack <Grid> jumps_stack = new Stack <Grid>(); 
  static  HashSet <Integer> appeared_set = new HashSet <Integer>(); 
  
  static void findJumps(int row, int col) { 
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
          jumps_stack.push(new Grid(r, c));
          //System.out.println("r= " + r + ", c= " + c);
          foundJump = true;
        }
        //else
        //  System.out.print("appeared ");
      }
    }

  }
  
  static class Grid {

    public int row, col;
  
    public Grid(int row_index, int col_index) {
      row = row_index;
      col = col_index;  
    } 
  
  }
}

/*
Sample Input
3
4
3 10 8 14
1 11 12 12
6 2 3 9

Output for Sample Input
yes
La version franc¸aise figure `a la suite de la version anglaise.
Explanation of Output for Sample Input
Starting in the cell at (1; 1) which contains a 3, one possibility is to jump to the cell at (1; 3).
This cell contains an 8 so from it, you could jump to the cell at (2; 4). This brings you to a cell
containing 12 from which you can jump to the exit at (3; 4). Note that another way to escape is to
jump from the starting cell to the cell at (3; 1) to the cell at (2; 3) to the exit.
Notes
1. The online grader begins by testing submissions using the sample input. All other tests are
skipped if the sample test is not passed. If you are only attempting the first three subtasks
(the first 7 marks), then you might want to handle the specific values of the sample input as
a special case.
2. For the final subtask (worth 2 marks), if you are using Java, then Scanner will probably
take too long to read in the large amount of data. A much faster alternative is BufferedReader.
*/