package Beginner.BabySteps.Lec4;

public class Main {
    public static void main(String [] args){
        
        int [] arr = {1,2,3,4};

        String [] name =  {"Tirth","Ram","Keyur"};

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }

        //  only print even element
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
        }
        
        //  sum
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
           sum += arr[i];
        }
        System.out.println(sum);


        //  count only even numbers
        // sum only even numbers
        int count = 0 ;
        int evenSum =0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
               evenSum += arr[i];
               count++;
            }
        }
        System.out.println("Count=> "+count);
        System.out.println("EvenSum=> "+evenSum);
    } 
}
