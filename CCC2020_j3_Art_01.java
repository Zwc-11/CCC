// STEM Yard, 2020-11
import java.util.*;
public class CCC2020_j3_Art_01 {
	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

      int N = sc.nextInt(); 
      sc.nextLine(); // Consuming the leftover new line (line change)
      
      int minX=101, maxX=-1, minY=101, maxY=-1; // check doc for range of x and y
      for(int i = 0; i < N; i++) {
         String[] words = sc.nextLine().trim().split(",");
         int x = Integer.parseInt(words[0]);
         int y = Integer.parseInt(words[1]);
      
         if(x < minX) minX = x;
         if(x > maxX) maxX = x;
         if(y < minY) minY = y;
         if(y > maxY) maxY = y;
        
       }
       System.out.println((minX-1) + "," + (minY-1));
       System.out.println((maxX+1) + "," + (maxY+1));

	  	 sc.close();
	}
}

/*
frame.
Sample Input
5
44,62
34,69
24,78
42,44
64,10

Output for Sample Input
23,9
65,79

Explanation of Output for Sample Input
The bottom-left corner of the frame is (23, 9). Notice that if the bottom-left corner is moved up,
the paint drop at (64, 10) will not be inside the frame. (See the diagram on the next page.) If the
corner is moved right, the paint drop at (24, 78) will not be inside the frame. If the corner is moved
down or left, then the frame will be larger and no longer the smallest rectangle containing all the
drops of paint. A similar argument can be made regarding the top-right corner of the frame.
*/