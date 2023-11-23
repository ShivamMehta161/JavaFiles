import java.util.Scanner;

public class fibonaci {

    // Non-recursive function to calculate the nth Fibonacci number
    public static int fibonacciNonRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        int fib1 = 1, fib2 = 1, fib = 0;

        for (int i = 3; i <= n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }

        return fib;
    }

    // Recursive function to calculate the nth Fibonacci number
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Print the nth Fibonacci number using the non-recursive function
        System.out.println("Non-recursive Fibonacci(" + n + "): " + fibonacciNonRecursive(n));

        // Print the nth Fibonacci number using the recursive function
        System.out.println("Recursive Fibonacci(" + n + "): " + fibonacciRecursive(n));
    }
}
