package Beginner.Step0.ArrayAndArraylist;

import java.util.Scanner;

public class Matrix {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 3, cols = 3; // Change as needed
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
