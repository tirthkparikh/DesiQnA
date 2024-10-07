package Beginner.Step0.PatternLec10;

public class Solution {
    public static void main(String[] args) {
        int N = 4; // Fixed value of N

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print((2 * ((i + j) % N) + 1));
            }
            System.out.println();
        }
    }
}
