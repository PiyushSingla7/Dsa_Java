package Arrays_And_Array_List_6;

import java.util.Scanner;

public class Reverse_Of_Array_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kindly Enter The Size Of The Array :- ");
        int x = sc.nextInt();

        System.out.print("Kindly Enter The Array Elements :- ");
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<x/2;i++){
            int temp=arr[i];
            arr[i]=arr[x-i-1];
            arr[x-i-1]=temp;
        }

        for (int i = 0; i < x; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
