package Arrays_And_Array_List_6;

import java.util.Scanner;

public class Imp_Opt_Zero_And_One_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (nums[i] == 0) i++;
            if (nums[j] == 1) j--;
            if (nums[i] == 1 && nums[j] == 0 && i < j) {
                nums[i++] = 0;
                nums[j--] = 1;
            }
        }
        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }
}
