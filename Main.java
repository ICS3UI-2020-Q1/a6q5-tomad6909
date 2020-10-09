import java.util.Scanner;
/**
 * This program will populate an array with 2 spots on it and then it will output in ascending order to the console
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // create an array with 2 integers
    int[] integers = new int[2];

    // ask the user to enter in 2 integers
    System.out.println("Please enter the 2 values for the array");

    // create a for loop and enter in 2 values
    for(int i = 0; i < 2; i++){
      integers[i] = input.nextInt();
    }
    if(integers[0] <= integers[1]){
      System.out.println("Your numbers in ascending order are " + integers[0] + " and " + integers[1]);
    } else{
      System.out.println("Your numbers in ascending order are " + integers[1] + " and " + integers[0]);
    }
    
  }
}
