package Arrays_And_Array_List_6;

import java.util.Scanner;

public class Next_Greatest_Element_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int max = -1;
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, nums[j]);
            }
            result[i] = max;
        }
        for (int ele : result) {
            System.out.print(ele + " ");
        }
    }
}
