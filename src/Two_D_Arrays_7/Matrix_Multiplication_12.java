package Two_D_Arrays_7;

import java.util.Scanner;

public class Matrix_Multiplication_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] arr2 = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        if (col1 != row2) {
            System.out.println("Matrix Multiplication Is Not Possible For The Given Input");
        } else {
            int[][] result = new int[row1][col2];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    for (int k = 0; k < row2; k++) {
                        result[i][j] += (arr1[i][k] * arr2[k][j]);
                    }
                }
            }
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}











