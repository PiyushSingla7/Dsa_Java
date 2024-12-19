package Basics_1;

import java.util.Scanner;

public class Modulus_Operator_11 {
    public static void main(String[] args) {
        // % operator provides the remainder 36 % 10 -> 6
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x % y);
        // a % b = a[a < b]
        // a % (-b) = a % b
        // (-a) % b = -(a % b)
    }
}
