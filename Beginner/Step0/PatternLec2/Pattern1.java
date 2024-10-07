package Beginner.Step0.PatternLec2;
import java.util.*;
public class Pattern1 {
    public static void main(String[] args){
        System.out.print("Enter total rows you want");
        Scanner sn = new Scanner(System.in);
        int row = sn.nextInt();
        for(int i = 1; i <= row; i++){
            for(int j =0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
