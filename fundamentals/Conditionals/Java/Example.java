import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Let's simulate a grading system.");

            System.out.print("Enter the student's grade (0-100): ");
            int grade = scanner.nextInt();

            String score;
            if (grade >= 90) {
                score = "A";
                System.out.println("Grade: A");
            } else if (grade >= 80) {
                score = "B";
                System.out.println("Grade: B");
            } else if (grade >= 70) {
                score = "C";
                System.out.println("Grade: C");
            } else if (grade >= 60) {
                score = "D";
                System.out.println("Grade: D");
            } else if (grade >= 0) {
                score = "F";
                System.out.println("Grade: F");
            } else {
                score = "Invalid";
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
            }

            switch (score) {
                case "A" -> System.out.println("Excellent work!");
                case "B", "C" -> System.out.println("Good job!");
                case "D", "F" -> System.out.println("You need to improve.");
                default -> System.out.println("Invalid grade.");
            }
        }
    }
}
