package Arrays_And_Array_List_6;

import java.util.Scanner;

public class Rotate_The_Array_11 {
    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        return;
    }

    public static void main(String[] args) {
        // rotate the given array a by k steps where k is non negative
        // k can be greater than n as well n is the size of array a
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % n;
        reverse(nums, 0, n - k - 1);
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - 1);

        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }
}
