package Beginner.Step0.ArrayAndArraylist;

import java.util.Scanner;

public class BoundaryMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 4, cols = 4; 
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Boundary elements:");
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] + " "); // Top row
        }
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(matrix[i][cols - 1] + " "); // Right column
        }
        for (int j = cols - 1; j >= 0; j--) {
            System.out.print(matrix[rows - 1][j] + " "); // Bottom row
        }
        for (int i = rows - 2; i > 0; i--) {
            System.out.print(matrix[i][0] + " "); // Left column
        }
    }
}
