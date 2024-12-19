package Arrays_And_Array_List_6;

import java.util.Scanner;

public class Sort_Zero_And_One_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int noz = 0;
        for (int ele : nums) {
            if (ele == 0) noz++;
        }
        for (int i = 0; i < n; i++) {
            if (i < noz) nums[i] = 0;
            else nums[i] = 1;
        }
        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }
}