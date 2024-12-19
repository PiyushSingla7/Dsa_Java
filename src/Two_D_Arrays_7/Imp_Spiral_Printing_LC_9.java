package Two_D_Arrays_7;
// 54 spiral matrix leetcode
import java.util.Scanner;

public class Imp_Spiral_Printing_LC_9 {
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
        int minr = 0, minc = 0, maxr = rows - 1, maxc = cols - 1;
        while (minr <= maxr && minc <= maxc) {
            for (int j = minc; j <= maxc; j++) {
                System.out.print(grid[minr][j] + " ");
            }
            minr++;
            if((minr > maxr || minc > maxc)) break;
            for (int j = minr; j <= maxr; j++) {
                System.out.print(grid[j][maxc] + " ");
            }
            maxc--;
            if((minr > maxr || minc > maxc)) break;
            for (int j = maxc; j >= minc; j--) {
                System.out.print(grid[maxr][j] + " ");
            }
            maxr--;
            if((minr > maxr || minc > maxc)) break;
            for (int j = maxr; j >= minr; j--) {
                System.out.print(grid[j][minc] + " ");
            }
            minc++;
        }
    }
}
