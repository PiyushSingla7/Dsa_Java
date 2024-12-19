package Arrays_And_Array_List_6;

import java.util.Scanner;

public class Basics_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int[] arr2 = {1, 3, 4, 5, 1};

        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
