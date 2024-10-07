package Beginner.Step0.ArrayAndArraylist;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] array = new int[5];
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            frequencyMap.put(array[i], frequencyMap.getOrDefault(array[i], 0) + 1);
        }

        System.out.println("Frequency of each element:");
        for (Integer key : frequencyMap.keySet()) {
            System.out.println(key + ": " + frequencyMap.get(key));
        }
    }
}
