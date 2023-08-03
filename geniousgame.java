import java.util.Random;
import java.util.Scanner;

public class geniousgame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 10;
        int score = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        while (attempts > 0) {
            System.out.print("Guess the number: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                score += attempts * 10;
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
            
            
                System.out.println("Too high! Try again.");
            }

            attempts--;
        }

        if (attempts == 0) {
            System.out.println("Oops! You ran out of attempts.");
            System.out.println("The secret number was: " + secretNumber);
        }

        System.out.println("Your score: " + score);
    }
}
