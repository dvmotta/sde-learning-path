public class Example {

    public static void main(String[] args) {
        int age = 23;

        System.out.println("The age used on example is: " + age);

        // Addition
        int sum = age + 5;
        System.out.println("Sum 5 to the age: " + sum);

        // Subtraction
        int difference = age - 5;
        System.out.println("Subtract 5 from the age: " + difference);

        // Multiplication
        int product = age * 5;
        System.out.println("Multiply the age by 5: " + product);

        // Division
        int quotient = age / 5;
        System.out.println("Divide the age by 5: " + quotient);
        
        // Division for floating point numbers
        double quotientDouble = (double) age / 5;
        System.out.println("Divide the age by 5 (floating point): " + quotientDouble);

        // Modulus
        int remainder = age % 5;
        System.out.println("Remainder of the age divided by 5: " + remainder);
    }
    
}
