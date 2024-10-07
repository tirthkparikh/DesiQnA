package Beginner.Step0.ArrayAndArraylist;

import java.util.Scanner;

public class SumAndMultiplication {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0, product = 1;
        for (int num : array) {
            sum += num;
            product *= num;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}

