package Arrays_And_Array_List_6;

import java.util.Scanner;

public class Linear_Search_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kindly Enter The Size Of The Array :- ");
        int x = sc.nextInt();

        System.out.print("Kindly Enter The Array Elements :- ");
        int[] arr = new int[x];
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("kindly Enter The Element You Want To Find :- ");
        int target = sc.nextInt();

        boolean flag = false;
        int idx = -1;
        for (int i = 0; i < x; i++) {
            if (arr[i] == target) {
                idx = i;
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Element Found At Index Number " + idx);
        } else {
            System.out.println("Element Is Not Present In The Array Try Again!!");
        }
    }
}
