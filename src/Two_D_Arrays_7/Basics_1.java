package Two_D_Arrays_7;

public class Basics_1 {
    public static void main(String[] args) {

        // basic initializing and printing
        int[][] grid = new int[3][3];  // declaration
        // 10 20 30
        // 40 50 60
        // 70 80 90
        grid[0][0] = 10;   // initialization
        grid[0][1] = 20;
        grid[0][2] = 30;
        grid[1][0] = 40;
        grid[1][1] = 50;
        grid[1][2] = 60;
        grid[2][0] = 70;
        grid[2][1] = 80;
        grid[2][2] = 90;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8}};
        for (int[] ele : nums) {
            for (int x : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
