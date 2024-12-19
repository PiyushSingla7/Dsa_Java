package Two_D_Arrays_7;

import java.util.Scanner;

public class Largest_Element_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] nums = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for (int[] ele : nums) {
            for (int b : ele) {
                if (b > max) max = b;
            }
        }
        System.out.println(max);
    }
}
