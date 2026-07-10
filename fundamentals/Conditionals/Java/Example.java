import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Let's simulate a grading system.");

            System.out.print("Enter the student's grade (0-100): ");
            int grade = scanner.nextInt();

            switch (grade) {
                case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100 -> System.out.println("Grade: A");
                case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89 -> System.out.println("Grade: B");
                case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79 -> System.out.println("Grade: C");
                case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69 -> System.out.println("Grade: D");
                default -> System.out.println("Grade: F");
            }

            if (grade >= 90) {
                System.out.println("Excellent work!");
            } else if (grade >= 70) {
                System.out.println("Good Job!");
            } else {
                System.out.println("You need to improve.");
            }
        }
    }
}
