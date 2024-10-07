package Beginner.Step0.PatternLec6;

public class Solution {
    public static void main(String[] args) {
        int N = 4; 
        int size = 2 * N - 1; 

   
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int minDistance = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));      
                System.out.print((N - minDistance) + " ");
            }
            System.out.println();
        }
    }
}
