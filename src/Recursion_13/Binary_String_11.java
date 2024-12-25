package Recursion_13;

import java.util.Scanner;

public class Binary_String_11 {
    public static void binary(int n,String ans){
        int m=ans.length();
        if(m==n) {
            System.out.println(ans);
            return;
        }
        if(m==0||ans.charAt(m-1)=='0'){
            binary(n,ans+"0");
            binary(n,ans+"1");
        }
        else binary(n,ans+"0");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        binary(n,"");
    }
}
