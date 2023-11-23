import java.util.Scanner;

public class quadratic{

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check the discriminant
        if (discriminant > 0) {
            // Two real solutions
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The equation has two real solutions:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            // One real solution
            double root = -b / (2 * a);

            System.out.println("The equation has one real solution:");
            System.out.println("Root: " + root);
        } else {
            // No real solutions
            System.out.println("The equation has no real solutions.");
        }
    }
}
