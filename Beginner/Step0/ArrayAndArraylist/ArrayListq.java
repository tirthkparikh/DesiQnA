package Beginner.Step0.ArrayAndArraylist;
import java.util.*;
public class ArrayListq {
        public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("You entered the following integers:");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
