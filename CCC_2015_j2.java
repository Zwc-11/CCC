/**
 * Auto Generated Java Class.
 */
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class CCC_2015_j2 {
  
  
  public static void main(String[] args) { 
    Scanner sc =new Scanner(System.in);
    int sad=0;
    int happy=0;
    String line  =sc.nextLine();
    String sadface = ":-(";
    String happyface = ":-)";
    
    for(int i = 0; i < line.length(); i++){
      if (line.contains(sadface) ){
      sad=sad+1;
      }
     else if(line.contains(happyface)){
     happy = happy+1;
      
      }
    }
    if( sad > happy){
    System.out.println("sad");
    }
    else if(happy > sad){
    System.out.println("happy");
    }
    else
    {
    System.out.println("None");
    }
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
