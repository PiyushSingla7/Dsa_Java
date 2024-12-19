package Two_D_Arrays_7;
// 48 rotate image leetcode
import java.util.Scanner;

public class Imp_Rotate_The_Matrix_LC_7 {
    public static void swap(int[][] grid, int i, int j) {
        int temp = grid[i][j];
        grid[i][j] = grid[j][i];
        grid[j][i] = temp;
    }

    public static void reverse(int[][] grid, int i) {
        int low = 0;
        int high = grid[i].length - 1;
        while (low < high) {
            int temp = grid[i][low];
            grid[i][low] = grid[i][high];
            grid[i][high] = temp;
            low++;
            high--;
        }
    }

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
            for (int j = 0; j < i; j++) {
                swap(grid, i, j);
            }
        }
        for (int i = 0; i < rows; i++) {
            reverse(grid, i);
        }
        for (int[] a : grid) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
