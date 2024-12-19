package Two_D_Arrays_7;

// write a program to store roll number and marks obtained by n students side by side in a matrix

import java.util.Scanner;

public class Store_Roll_Number_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[][] college = new int[x][2];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 2; j++) {
                college[i][j] = sc.nextInt();
            }
        }
        for (int[] ele : college) {
            for (int b : ele) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
