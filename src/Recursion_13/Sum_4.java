package Recursion_13;

import java.util.Scanner;

public class Sum_4 {
    public static int Sum(int n) {
        if (n == 1) return 1;
        return n + Sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));
    }
}
