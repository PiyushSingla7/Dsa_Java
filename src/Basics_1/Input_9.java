package Basics_1;

import java.util.Scanner;

public class Input_9 {
    public static void main(String[] args) {
        // take input and print square of the number
        Scanner sc = new Scanner(System.in);
        System.out.print("Kindly Enter An Number :- ");
        int x = sc.nextInt();
        System.out.println("The Square Of "+x+" is :- "+x*x);
    }
}
