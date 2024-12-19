package Two_D_Arrays_7;

import java.util.Scanner;

public class Wave_Form_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(grid[i][j] + " ");
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(grid[i][j] + " ");
                }
            }
        }
    }
}
