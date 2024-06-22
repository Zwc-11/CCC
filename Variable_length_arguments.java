/**
 * Auto Generated Java Class.
 */
public class Variable_length_arguments {
       
  
  public static void main(String[] args) { 
    System.out.println(average(44,45));
  }
  public static int average(int...numbers){
  int total =0;
    for(int x:numbers)
      total+=x;
    
    return total/numbers.length;
  
  }
  
  /* ADD YOUR CODE HERE */
  
}
