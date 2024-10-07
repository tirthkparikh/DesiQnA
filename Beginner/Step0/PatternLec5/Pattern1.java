package Beginner.Step0.PatternLec5;

public class Pattern1 {

        public static void main(String[] args) {
            int N = 5; // Number of rows
    
            for (int i = 1; i <= N; i++) {
                // Print leading spaces
                for (int j = N; j > i; j--) {
                    System.out.print(" "); // Print spaces
                }
    
                // Print increasing numbers
                for (int j = i; j < 2 * i; j++) {
                    System.out.print(j); // Print increasing numbers
                }
    
                // Print decreasing numbers
                for (int j = 2 * i - 2; j >= i; j--) {
                    System.out.print(j); // Print decreasing numbers
                }
    
                // Move to the next line after each row
                System.out.println();
            }
        }
    
}
