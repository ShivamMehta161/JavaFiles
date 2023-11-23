import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the dimensions of matrix A
        System.out.print("Enter the number of rows for matrix A (p): ");
        int p = scanner.nextInt();

        System.out.print("Enter the number of columns for matrix A (q): ");
        int q = scanner.nextInt();

        // Prompt the user to enter the dimensions of matrix B
        System.out.print("Enter the number of rows for matrix B (s): ");
        int s = scanner.nextInt();

        System.out.print("Enter the number of columns for matrix B (r): ");
        int r = scanner.nextInt();

        // Check if the matrices can be multiplied
        if (q != s) {
            System.out.println("Matrix multiplication is not possible. Number of columns in A must be equal to the number of rows in B.");
            return;
        }

        // Create matrices A and B
        int[][] matrixA = new int[p][q];
        int[][] matrixB = new int[s][r];

        // Prompt the user to enter the elements of matrix A
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Prompt the user to enter the elements of matrix B
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Close the scanner to avoid resource leak
        scanner.close();

        // Perform matrix multiplication
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Display the result matrix
        System.out.println("Result of matrix multiplication (AXB):");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int p = A.length;
        int q = A[0].length;
        int r = B[0].length;

        int[][] result = new int[p][r];

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < q; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }
}
