package Strings_8;

import java.util.Scanner;

public class Imp_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "Piyush";
        String b = "Piyush";
        System.out.println(a);
        System.out.println(b);
        // here a and b points to same
        b = "Rohan";
        // here Piyush that is attached to b is still remain in the memory b just inverted its point now b is pointing towards Rohan but Piyush still exits in memory
        System.out.println(b);
        System.out.println(a);

        String c = new String("Piyush");
        // here c points to different one no relationship with a and b new Piyush in memory is created

        int[] arr = {1, 2, 3};
        int[] brr = arr; // shallow copy
        System.out.println(arr[0]);
        System.out.println(brr[0]);
        arr[1] = 10; // changing in arr or brr occur in both because they point to same adress
        System.out.println(arr[1]);
        System.out.println(brr[1]);

        int[] crr = {1, 2, 3};
        int[] drr = {1, 2, 3}; // deep copy
        System.out.println(crr[0]);
        System.out.println(drr[0]);
        crr[1] = 10; // changing in crr only ocurs in crr because here deep copy is performed both crr and drr are different
        System.out.println(crr[1]);
        System.out.println(drr[1]);
    }
}
