package Beginner.Step0.ArrayAndArraylist;

import java.util.Scanner;

public class ZMatrix {
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
        System.out.println("Elements in Z form:");
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] + " "); // Top row
        }
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(matrix[i][cols - 1 - i] + " "); // Diagonal
        }
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[rows - 1][j] + " "); // Bottom row
        }
    } 
}
