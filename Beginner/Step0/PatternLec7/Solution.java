package Beginner.Step0.PatternLec7;

public class Solution {
    public static void main(String[] args) {
        int N = 3;   
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" "); 
            }
            for (int j = 0; j < N; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
