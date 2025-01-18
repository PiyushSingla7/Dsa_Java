package Hashmaps_And_Hashsets_20.TestPad;

import java.util.Scanner;
import java.util.*;

//Check if two arrays are equal or not bookmark_border
//Given two array of same size, find out if given arrays are equal or not.
//
//Note: Two arrays are said to be equal if both of them contain same set of elements, although arrangements (or permutation) of elements may be different.
//
//Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal..
//
//For example, if A = [11, 12, 13] and B = [12, 11, 13] then answer is 1 and,
//
//if A = [11, 12, 13, 12, 13] and B = [12, 11, 13, 12, 13] then answer is 1 and,
//
//if A = [11, 12, 13] and B = [12, 13, 12] then answer is 0.
//
//Complete the function arraysEqualorNot() given in the editor, which takes two arrays as input and returns the answer(0/1) as output.
//
//Input Format
//
//The 1st line contains an integer N, the number of elements in A and B.
//The 2nd line contains N integers separated by space.
//The 3rd line contains N integers separated by space.
//Output Format
//
//Print 1 or 0 as per the condition.
//Constraints
//
//  1 <= N <= 10^5
// -50000 <= A[i], B[i] <= 50000
//Sample Input
//
//3         // N
//11 12 13  // A[]
//12 11 13  // B[]
//Sample Output
//
//1
public class Check_If_Two_Arrays_Are__Equal_Or_Not_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]A=new int[n];
        int[]B=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            B[i]=sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<A.length;i++){
            if(A[i]!=B[i]) System.out.println("0");
        }
        System.out.println("1");
    }
}
