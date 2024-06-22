// STEM Yard, 2020-11
import java.util.*;
public class CCC2018_j4s2_Sunflowers_01 {
  public static void main(String[]args) {

    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    int N = Integer.parseInt(str);

    int[][] mat = new int[N][N];
      
    for (int i=0; i< N; i++) {
       String[] line = sc.nextLine().trim().split(" ");
       for (int j=0; j< N; j++) {
          mat[i][j] = Integer.parseInt(line[j]);
       }
     } 
  	  sc.close();

    // solve

    // rotate 90 degrees, CCW, brute force
    // only check first row and first column
    for(int r=0; r <3; r++) { // max 3 times
      boolean needRotate = false;
      for(int j=0; j < N-1; j++) { // 1st row
        if(mat[0][j] > mat[0][j+1]) {
          needRotate = true;
          break;
        }
      }
      for(int i=0; i < N-1; i++) { // 1st column
        if(mat[i][0] > mat[i+1][0]) {
          needRotate = true;
          break;
        }
      }
      if (needRotate)
        //rotateMatrixInplace(mat);
        rotateMatrixWithTmp(mat, N);
      else
        break;
    }
    // output
    for (int i=0; i<N; i++) {
      String out = "";
      for (int j=0; j<N; j++) {
        out += (String.valueOf(mat[i][j]));
        if(j < N-1)
          out += " ";
      }
      System.out.println(out);
    }
  }
  
  /* Function to rotate  
   N x N matrix by 90 degrees in 
   anti-clockwise direction, using tmp matrix 
   Simple and easier to understand, compare to inplace rotation
  */
  static void rotateMatrixWithTmp(int [][] mat, int N ) {
   int[][]  tmpMat = new int [N][N];

    // CCW, per row to col (upside down)
    for (int r = 0; r < N; r++) 
      for(int c = 0; c < N; c++) 
        tmpMat[N-1-c][r] = mat[r][c];
  
    // assign back  
    for (int r = 0; r < N; r++) 
      for(int c = 0; c < N; c++) 
        mat[r][c] = tmpMat[r][c];
  }

}

/*
Sample Input 1
2
1 3
2 9

Output for Sample Input 1
1 3
2 9
Explanation of Output for Sample Input 1
The data has been rotated a multiple of 360 degrees, meaning that the input arrangement is the
original arrangement.
--------------------------------------
Sample Input 2
3
4 3 1
6 5 2
9 7 3

Output for Sample Input 2
1 2 3
3 5 7
4 6 9
Explanation of Output for Sample Input 2
The original data was rotated 90 degrees to the right/clockwise.
--------------------------------------
Sample Input 3
3
3 7 9
2 5 6
1 3 4

Output for Sample Input 3
1 2 3
3 5 7
4 6 9
Explanation of Output for Sample Input 3
The original data was rotated 90 degrees to the left/counter-clockwise.
*/