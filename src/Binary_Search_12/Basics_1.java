package Binary_Search_12;

import java.util.Scanner;

//it is used to search a given element in a sorted space(array)
//it is used to reduce the search space in half after every term
//usually we apply binary sort when it is given that it is an sorted array
public class Basics_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        
    }
}
