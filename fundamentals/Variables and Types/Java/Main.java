public class Main {
    public static void main(String[] args) {

        // Primitive variables
        String name = "Davi";
        int age = 23;
        double height = 1.75;
        boolean student = true;

        // Compound variables
        String[] shoppingList = {"Milk", "Bread", "Eggs"}; // Fixed-size array of strings

        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I'm " + age + " years old.");
        System.out.println("My height is " + height + " meters.");
        System.out.println("I'm a student? " + student);

        System.out.println();

        System.out.println("Shopping list:");

        System.out.println(shoppingList[0]);
        System.out.println(shoppingList[1]);
        System.out.println(shoppingList[2]);

        }
    }