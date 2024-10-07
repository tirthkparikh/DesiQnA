package Beginner.Step0.PatternLec3;
import java.util.*;
import java.util.Scanner;

public class Pattern2 {
    public static void main(String [] args){
        System.out.print("Enter total rows you want");
          Scanner sn = new Scanner(System.in);
          int row = sn.nextInt();
          for(int i = row-1; i >= 0; i--){
            char ch = (char)('A'+i);
              for(int j =0; j < row-i; j++){
                  System.out.print(ch);
                  ch++;
              }
              System.out.println();
          }
    }

    }

