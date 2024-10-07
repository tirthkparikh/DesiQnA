package Beginner.Step0.PatternLec8;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            StringBuilder pattern = new StringBuilder();       
            for (int j = 1; j <= i; j++) {
                sum += j;
                pattern.append(j);
                if (j < i) {
                    pattern.append("+");
                }
            }    
            pattern.append("=").append(sum);
            System.out.println(pattern);
        } 
    }
}
