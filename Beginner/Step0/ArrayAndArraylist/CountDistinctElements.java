package Beginner.Step0.ArrayAndArraylist;
import java.util.HashSet;
import java.util.Scanner;

public class CountDistinctElements {
    public static void main(String[] args) {
        int[] array = new int[5]; 
        HashSet<Integer> distinctElements = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (1 to 100):");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            distinctElements.add(array[i]);
        }
        System.out.println("Count of distinct elements: " + distinctElements.size());
    }
}

