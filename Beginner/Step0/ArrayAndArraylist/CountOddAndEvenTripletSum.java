package Beginner.Step0.ArrayAndArraylist;
import java.util.Scanner;
public class CountOddAndEvenTripletSum {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int oddCount = 0, evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    int sum = array[i] + array[j] + array[k];
                    if (sum % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
            }
        }
        System.out.println("Count of odd triplet sums: " + oddCount);
        System.out.println("Count of even triplet sums: " + evenCount);
    }
}

