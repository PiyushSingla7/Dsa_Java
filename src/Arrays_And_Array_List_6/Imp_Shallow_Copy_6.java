package Arrays_And_Array_List_6;

import java.util.Arrays;
import java.util.Scanner;

public class Imp_Shallow_Copy_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kindly Enter The Size Of The Array :- ");
        int x = sc.nextInt();

        System.out.print("Kindly Enter The Array Elements :- ");
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        int[] nums = arr;
        nums[0] = 70;
        System.out.println(arr[0]);

        // changing element of nums but element in arr also changed this is known as shallow copy it means nums and arr refers to the array it just have two different names but the array is same
        //we can avoid the same by doing deep copying

        //deep copy
        int[] brr = Arrays.copyOf(arr, arr.length);
        brr[0] = 100;
        System.out.println(arr[0]);

        //deep copy
        int[] crr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            crr[i] = arr[i];
        }
    }
}
