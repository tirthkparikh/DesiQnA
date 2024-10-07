package Beginner.Step0.PatternLec3;
import java.util.*;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String [] args){
        System.out.print("Enter total rows you want");
          Scanner sn = new Scanner(System.in);
          int row = sn.nextInt();
          for(int i = 0; i <row; i++){
              char ch = (char)('A'+i);
              for(int j =0; j <= i; j++){
                  System.out.print(ch);
                  ch++;
              }
              System.out.println();
          }
    }

    }

