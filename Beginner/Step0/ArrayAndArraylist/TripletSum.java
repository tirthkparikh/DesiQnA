package Beginner.Step0.ArrayAndArraylist;
import java.util.Scanner;
public class TripletSum {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Triplet sums:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    System.out.println(array[i] + " + " + array[j] + " + " + array[k] + " = " + (array[i] + array[j] + array[k]));
                }
            }
        }
    }
}

