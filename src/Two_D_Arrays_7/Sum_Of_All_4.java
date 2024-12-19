package Two_D_Arrays_7;

import java.util.Scanner;

public class Sum_Of_All_4 {
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
        int sum = 0;
        for (int[] ele : nums) {
            for (int b : ele) {
                sum += b;
            }
        }
        System.out.println(sum);
    }
}
