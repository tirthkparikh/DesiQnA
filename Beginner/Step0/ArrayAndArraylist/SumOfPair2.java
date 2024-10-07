package Beginner.Step0.ArrayAndArraylist;
import java.util.Scanner;
public class SumOfPair2 {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers for the first array:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter 5 integers for the second array:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }
        System.out.println("Sum of pairs:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.println(array1[i] + " + " + array2[j] + " = " + (array1[i] + array2[j]));
            }
        }
    }
    
}
