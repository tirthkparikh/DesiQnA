package Beginner.Step0.PatternLec4;
import java.util.Scanner;

public class Pattern2 {
    public static void main(String [] args){
        System.out.print("Enter total rows you want");
        Scanner sn = new Scanner(System.in);
        int row = sn.nextInt();
        for(int i = row; i > 0; i--){
            //  values are increasing
            for(int j = 0; j<i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
