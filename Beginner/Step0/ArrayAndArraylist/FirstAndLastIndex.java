package Beginner.Step0.ArrayAndArraylist;
import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Enter target element:");
        int target = scanner.nextInt();

        int firstIndex = -1, lastIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                if (firstIndex == -1) firstIndex = i;
                lastIndex = i;
            }
        }
        System.out.println("First index: " + firstIndex);
        System.out.println("Last index: " + lastIndex);
    }
}

