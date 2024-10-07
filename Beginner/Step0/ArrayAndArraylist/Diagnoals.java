package Beginner.Step0.ArrayAndArraylist;

import java.util.Scanner;

public class Diagnoals {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 3; // Change as needed
        int[][] matrix = new int[size][size];

        System.out.println("Enter elements for the matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Diagonals:");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + " "); 
            if (i != size - 1 - i) { 
                System.out.print(matrix[i][size - 1 - i] + " "); 
            }
        }
        System.out.println();
    }
}
