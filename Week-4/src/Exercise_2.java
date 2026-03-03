import java.util.Random;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = rand.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess it?");

        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Larger!");
            }
            else if (guess > secretNumber) {
                System.out.println("Smaller!");
            }
            else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts!");
            }
        }
        System.out.println("_____________________");
        System.out.println("Thanks for playing Anvar Game!");
        scanner.close();
    }
}
