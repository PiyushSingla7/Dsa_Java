package Binary_Search_12;

import java.util.Scanner;

public class Binary_Search_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int low = 0;
        int high = n - 1;
        boolean flag = false;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (flag) {
            System.out.println("Target Found");
        } else {
            System.out.println("Target Not Found");
        }
    }
}
