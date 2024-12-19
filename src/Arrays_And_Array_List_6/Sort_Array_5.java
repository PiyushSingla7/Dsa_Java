package Arrays_And_Array_List_6;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Array_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kindly Enter The Size Of The Array :- ");
        int x = sc.nextInt();

        System.out.print("Kindly Enter The Array Elements :- ");
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        Arrays.sort(arr);
        System.out.println();

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
