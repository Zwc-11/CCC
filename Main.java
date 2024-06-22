import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  
  int previousStop = -1; // Variable used to track last time a different character was encountered
  
  // Input
  Scanner input = new Scanner(System.in);
  int numberOfLines = Integer.parseInt(input.nextLine());
  String[] sequences = new String[numberOfLines];
  
  for (int i = 0; i < numberOfLines; i++) {
   sequences[i] = input.nextLine();
  }
  input.close();
  
  // Data Process and Output
  for (int i = 0; i < numberOfLines; i++) { 
   for (int j = 0; j < sequences[i].length(); j++) {
    
    if (j < (sequences[i].length() - 1)) {
     if (sequences[i].charAt(j) != sequences[i].charAt(j+1)) {
      System.out.print(j - previousStop + " " + sequences[i].charAt(j) + " ");
      previousStop = j; 
     }   
    } else {   
     System.out.print(j - previousStop + " " + sequences[i].charAt(j));    
    }
    
   }
   System.out.println();
   previousStop = -1; // Reset counter for next string
  }
  
 }
 
}