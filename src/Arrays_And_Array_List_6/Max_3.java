package Arrays_And_Array_List_6;

import java.util.Scanner;

public class Max_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kindly Enter The Size Of The Array :- ");
        int x = sc.nextInt();

        System.out.print("Kindly Enter The Array Elements :- ");
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < x; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
