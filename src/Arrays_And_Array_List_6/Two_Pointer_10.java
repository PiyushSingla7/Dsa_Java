package Arrays_And_Array_List_6;

import java.util.Scanner;

public class Two_Pointer_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kindly Enter The Size Of The Array :- ");
        int x = sc.nextInt();

        System.out.print("Kindly Enter The Array Elements :- ");
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = x - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int ele:arr) {
            System.out.print(ele + " ");
        }
    }
}
