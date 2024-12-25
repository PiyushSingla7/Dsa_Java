package Recursion_13;

import java.util.Scanner;

public class Gcd_10 {
    public static int hcf(int a,int b){
        if(b%a==0) return a;
        return hcf(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(hcf(a,b));
    }
}
