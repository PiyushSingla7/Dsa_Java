package Two_D_Arrays_7;

import java.util.Scanner;

//write a program to print the transpose of the matrix entered by the user and store it in a new matrix
public class Transpose_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = arr[i][j];
            }
        }
        for (int[] b : result) {
            for (int ele : b) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
