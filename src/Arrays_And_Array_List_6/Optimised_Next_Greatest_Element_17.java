package Arrays_And_Array_List_6;

import java.util.Scanner;

public class Optimised_Next_Greatest_Element_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = new int[n];
        result[n - 1] = -1;
        int max = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            result[i] = max;
            max = Math.max(max, nums[i]);
        }
        for (int ele : result) {
            System.out.print(ele + " ");
        }
    }
}
