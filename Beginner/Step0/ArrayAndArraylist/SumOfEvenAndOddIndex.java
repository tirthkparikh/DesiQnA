package Beginner.Step0.ArrayAndArraylist;
import java.util.Scanner;

public class SumOfEvenAndOddIndex {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int evenIndexSum = 0, oddIndexSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evenIndexSum += array[i];
            } else {
                oddIndexSum += array[i];
            }
        }

        System.out.println("Sum of elements at even indices: " + evenIndexSum);
        System.out.println("Sum of elements at odd indices: " + oddIndexSum);
    }
}

