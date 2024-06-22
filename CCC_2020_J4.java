import java.io.*;
import java.util.*;
import java.util.Scanner;

public class CCC_2020_J4 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    
    String t = sc.nextLine();
    String s = sc.nextLine();
    int l = s.length();
    
    int l1 = t.length()-s.length()-1;

   boolean FA;

    for(int i = 0; i <s.length(); i++)
    {
    String st = s.substring(0,i).concat(s.substring(i));
          if(t.contains(st))
          {
            FA = true;
            break;
           }
      }
    
    if(FA == true){
    System.out.println("yes");
    }
    else{
    System.out.println("NO");
    }
}
}

    
    

  
  /* ADD YOUR CODE HERE */
  

