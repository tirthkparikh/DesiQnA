package Beginner.Step0.PatternLec4;
import java.net.Socket;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String [] args){
        System.out.print("Enter total rows you want");
        Scanner sn = new Scanner(System.in);
        int row = sn.nextInt();
        for(int i = 0; i < row; i++){
            //  space are decreasing
            for(int j = row-1 ; j > i; j--){
                System.out.print(" ");
            }
            //  values are increasing
            for(int j = 1; j <= i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
