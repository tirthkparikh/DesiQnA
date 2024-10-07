package Beginner.Step0.ArrayAndArraylist;
import java.util.Scanner;

public class SumOfPairs {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Sum of pairs:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.println(array[i] + " + " + array[j] + " = " + (array[i] + array[j]));
            }
        }
    }
}
