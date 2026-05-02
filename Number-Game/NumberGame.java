//! Project
//todo     Number Guessing Game 
import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int randomnum = rand.nextInt(101);
        
       System.out.println("---------------------------------");
       System.out.println("       Number Guessing Game      ");
       System.out.println("---------------------------------");

       System.out.println("\nGuess a number between 1 and 100 ");
       
       int guess = 0 ;
       int attempt = 0 ;
       while(guess!=randomnum)
       {
          System.out.print("\nEnter your Guess : ");
          guess = sc.nextInt();
          if(randomnum==guess)
          {
            System.out.println("Correct! You guessed the number.");
            attempt++;
            break;
          }
          else if(guess>randomnum)
          {
            System.out.println("Too High!");
            attempt++;
          }
          else
          {
            System.out.println("Too low!");
            attempt++;
          }
       }
       System.out.println();
       System.out.println("Number of attempts : "+attempt);
       System.out.println("---------------------------------");

    }
}