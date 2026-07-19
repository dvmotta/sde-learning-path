
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome!");
        System.out.println("What you want to do?");
        System.out.println("1. Print multiplication table (using for loop)");
        System.out.println("2. Guess a number between 1 and 10(using while loop)");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch(choice) {
            case 1 -> {
                System.out.println("Multiplication table.");
                System.out.print("Enter a number: ");
                int n = scanner.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.printf("%d x %d = %d%n", n, i, n * i);
                }
            }
            case 2 -> {
                System.out.println("Guess a number between 1 and 10.");
                int num = 6; // predefined number to guess
                
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();

                while (guess != num) {
                    System.out.println("Wrong guess! Try again.");
                    System.out.print("Enter your guess: ");
                    guess = scanner.nextInt();
                }
                System.out.println("Congratulations! You guessed the correct number.");
            }
            default -> System.out.println("Invalid choice. Please run the program again and select either 1 or 2.");
        }

    }
}