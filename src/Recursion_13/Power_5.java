package Recursion_13;

import java.util.Scanner;

public class Power_5 {
    public static int pow(int a, int b) {
        if (b == 0) return 1;
        int c = pow(a, b / 2);
        if (b % 2 == 0) return (c * c);
        else return (c * c * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(pow(a, b));
    }
}
