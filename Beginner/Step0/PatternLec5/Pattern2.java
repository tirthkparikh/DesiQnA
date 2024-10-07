package Beginner.Step0.PatternLec5;

public class Pattern2 {
    public static void main(String[] args) {
        int N = 3; 

        // Upper half of the diamond
        for (int i = 1; i <= N; i += 2) {
            // space
            for (int j = N; j > i; j -= 2) {
                System.out.print(" ");
            }
          
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = N - 2; i >= 1; i -= 2) {
            for (int j = N; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
