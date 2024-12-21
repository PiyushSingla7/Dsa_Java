package Recursion_13;

import java.util.Scanner;

public class Maze_Path_6 {
    public static int maze(int i,int j,int row,int col){
        if(i==row || j==col) return 1;
        int rightways=maze(i,j+1,row,col);
        int downways=maze(i+1,j,row,col);
        return rightways+downways;
    }
    public static int maze2(int row,int col){
        if(row==1 || col==1) return 1;
        int rightways=maze2(row,col-1);
        int downways=maze2(row-1,col);
        return rightways+downways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        //System.out.println(maze(1,1,row,col));
        System.out.println(maze2(row,col));
        //maze uses 4 variables while we optimised the code in maze2
    }
}
