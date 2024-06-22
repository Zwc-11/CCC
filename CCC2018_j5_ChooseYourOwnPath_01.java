// STEM Yard, 2020-11
import java.util.*;
public class CCC2018_j5_ChooseYourOwnPath_01 {

  int nodes; // number of nodes (vertices)
  ArrayList<Integer> shortest = new ArrayList<Integer>();
  LinkedList<Integer> adj[]; //Adjacency Lists
  boolean [] pageReached;

  public static void main(String[]args) {

    CCC2018_j5_ChooseYourOwnPath_01 job = new CCC2018_j5_ChooseYourOwnPath_01();
    
    job.solve();
  }
  
  void solve() {  
    Scanner sc = new Scanner(System.in);

    String str = sc.nextLine();
    int N = Integer.parseInt(str);// Number of pages in the book

    int[][] mat = new int[N][];  // sub-array lengths are different
    // N lines, chatper jumps, lengths of sub-array are different
    // Since we can't declare a 10,000x10,000 two-D array 

    for (int i=0; i< N; i++) {
      String[] line = sc.nextLine().trim().split(" ");
      mat[i] = new int[line.length];
      for (int j=0; j<line.length; j++) {
         mat[i][j] = Integer.parseInt(line[j]);
      }
      nodes +=mat[i][0]; // first # is jumps, a lot of are '0'
    }
  	 sc.close();

    // solve

  
    // BFS variables and methods
    //int V; // Number of vertices (Nodes)
    
    initGraph(nodes);
    
    for(int i=0; i < mat.length; i++) {
      if(mat[i][0] == 0) // no jumps from this page
        shortest.add(i+1);
      else {  
        for(int j=1; j <= mat[i][0]; j++) { 
          addEdge(i+1, mat[i][j]);
        }
      }
    } 
	 System.out.println("Following is Breadth First Traversal "+
						"(starting from vertex 1)");

    pageReached = new boolean [N + 1];
    pageReached[0] = true;
    for (int i = 1; i < pageReached.length; i++)
      pageReached[i] = false;
      
    BFS(1);

    //for (int i = 1; i < pageReached.length; i++)
    //  System.out.println(i + " " + pageReached[i]);
      
    boolean allPageReached = true;
    for (int i = 1; i < pageReached.length; i++)
      if(pageReached[i] == false) {
        allPageReached = false;
        break;
      } 
    // output 1 
    if (allPageReached)
      System.out.println("Y");
    else
      System.out.println("N");
    
    // output 2, min jumps to a '0' page (or end of book?)
    

  }
  
  void initGraph(int v)
  {
	 adj = new LinkedList[v+1];
    for (int i=0; i<v+1; ++i)
      adj[i] = new LinkedList();
  }
  // Function to add an edge into the graph
  void addEdge(int v,int w)
  {
    adj[v].add(w);
  }
  
  // prints BFS traversal from a given source s
  void BFS(int s) {
    // Mark all the vertices as not visited(By default
    // set as false)
    boolean visited[] = new boolean[nodes+1];

    // Create a queue for BFS
    LinkedList<Integer> queue = new LinkedList<Integer>();

    // Mark the current node as visited and enqueue it
    visited[s]=true;
    queue.add(s);

    while (queue.size() != 0)
    {
      // Dequeue a vertex from queue and print it
      s = queue.poll();
      System.out.print(s+" ");

      // Get all adjacent vertices of the dequeued vertex s
      // If a adjacent has not been visited, then mark it
      // visited and enqueue it
      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext())
      {
        int n = i.next();
        if (!visited[n])
        {
          visited[n] = true;
          queue.add(n);
        }
        pageReached[n]=true;
      }
    }
    
      for(int i=0; i < visited.length; i++)
        System.out.println(i + " " + visited[i]);
  }
  

}

/*
Sample Input 1
3
2 2 3
0
0

Output for Sample Input 1
Y
2
Explanation of Output for Sample Input 1
Since we start on page 1, and can reach both page 2 and page 3, all pages are reachable. The only
paths in the book are 1 ! 2 and 1 ! 3, each of which is 2 pages in length.
----------------------------------
Sample Input 2
3
2 2 3
0
1 1

Output for Sample Input 2
Y
2
Explanation of Output for Sample Input 2
Every page is reachable, since from page 1, we can reach pages 2 and 3. The shortest path is the
path 1! 2, which contains two pages.
*/