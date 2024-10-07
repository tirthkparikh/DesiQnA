package Beginner.Step0.ArrayAndArraylist;

import java.util.*;

public class Array {
    public static void main(String args[]) {
        int[] array = new int[5]; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("You entered the following integers:");
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

