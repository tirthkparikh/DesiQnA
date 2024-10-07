package Beginner.Step0.ArrayAndArraylist;

import java.util.Scanner;

public class ReverseNumbersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range (start and end):");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += reverse(i);
        }

        System.out.println("Sum of reversed numbers: " + sum);
    }

    private static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
}

