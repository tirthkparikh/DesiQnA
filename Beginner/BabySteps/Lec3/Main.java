package Beginner.BabySteps.Lec3;

public class Main {
    public static void main(String args[]){

        //  loops to do recursive taks

        //  for loop
        for(int i = 1; i <= 50; i++){
            System.out.println(i);
        }

        //  while loop
        int i = 1;
        while(i <= 50){
            System.out.println(i);
            i++;
        }

        //  combined if and for
        for(int j = 1; j <= 50; j++){
            if(j % 2 == 0){
                System.out.println(j + "=>EVEN");
            }
            else{
                System.out.println(j + "=>ODD");

            }
        }

    }
}
