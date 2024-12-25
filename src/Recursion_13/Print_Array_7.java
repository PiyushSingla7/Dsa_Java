package Recursion_13;

import java.util.Scanner;

public class Print_Array_7 {
    public static void print(int i,int[]arr){
        if(i==arr.length)return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[]arr=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        print(0,arr);
    }
}
