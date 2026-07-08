import java.util.Scanner;

public class Example{
    public static void main(String[] args) {
        System.out.println("Let's calculate when you'll turn 100 years old?"); 

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: "); 
            String name = scanner.nextLine(); // getting user input for name

            System.out.print("Enter your age: ");
            int age = scanner.nextInt(); // getting user input for age and converting it to an integer

            System.out.println(name + ", you'll be 100 in " + (100 - age) + " years!"); // printing the result to the console
        }
}
}