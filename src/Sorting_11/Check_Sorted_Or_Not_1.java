package Sorting_11;

import java.util.Scanner;

public class Check_Sorted_Or_Not_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Unsorted Array");
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("Sorted Array");
    }
}
