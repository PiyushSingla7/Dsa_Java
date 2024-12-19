package Hashmaps_And_Hashsets_20.TestPad;

import java.util.HashSet;
import java.util.Scanner;

//Find all pairs with K difference bookmark_border
//Given an array of N distinct integers, find all the pairs of integers in it, with the difference equals to a given number K.
//
//Complete the function in the editor, which takes the array and K as parameters and return the number of pairs with the difference K.
//
//Input Format:
//
//First line of input will contain a positive integer T = number of test cases. Each test case will contain 2 lines.
//First line of each test case contains two positive integers, N and K.
//Next line will contain N distinct numbers separated by space.
//Output Format:
//
//For each test case, print number of pairs whose difference will be equal to k.
//Constraints:
//
//1 ≤ T ≤ 10
//1 ≤ N ≤ 10^5
//1 ≤ K ≤ 10^8
//-(10^7) ≤ arr[i] ≤ 10^7
//Sample Input
//
//3  // Test cases
//10 7  // N K (testcase 1)
//1 2 3 4 5 6 7 8 9 10
//5 4   // N K (testcase 2)
//4 2 3 1 10
//6 27  // N K (testcase 3)
//10 15 38 22 11 36
//Sample Output
//
//3
//0
//1
public class Find_All_Pairs_With_K_Difference_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        HashSet<Integer> a = new HashSet<>();
        int c = 0;
        for (int ele : arr) {
            if (a.contains(ele - target)) c++;
            if (a.contains(ele + target)) c++;
            a.add(ele);
        }
        System.out.println(c);
    }
}