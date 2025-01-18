package Hashmaps_And_Hashsets_20.TestPad;

import java.util.Scanner;
import java.util.*;

//Kth distinct element bookmark_border
//Given an array of positive integers, and an integer K, your task is to find the Kth distinct element present in the array. If there are fewer than K distinct elements, then return 0 as the answer.
//
//A distinct element is an element which is present only once in an array.
//
//Note: The elements are considered in the same order in which they appear in the array from left to right.
//
//Example: arr[] = {6, 11, 4, 11, 9, 4}, K = 2
//
//The only distinct elements in the array are 6 and 9.
//
//6 appears first so it the 1st distinct element, and 9 appears second so it the 2st distinct element in the array. Hence, for K=2 the answer is 9.
//
//Input Format:
//
//First line of input contains T = number of test cases.
//Each test case contains three lines:
//  First Line will contain an integer N, denoting the size of the array.
//  Second line contains N integers separated by space, denoting the array elements.
//  Third line contains an integer representing K.
//Constraints:
//
//1 <= T <= 10
//1 <= N <= 10^5
//1 <= arr[i] <= 10^5
//1 <= K <= N
//Output Format:
//
//Print the Kth distinct element present in the array.
//Sample Input 1
//
//3  // Test Cases
//6             // N (testcase 1)
//6 11 4 11 9 4 // arr[]
//2             // K﻿﻿
//5             // N (testcase 2)
//7 6 7 3 6     // arr[]
//1             // K
//6             // N (testcase 3)
//8 5 3 5 5 5   // arr[]
//4             // K
//Sample Output
//
//9
//3
//0
//Explanation
//
//Testcase 1:
//9 is the 2nd distinct element present in the array from left to right
//
//Testcase 2:
//3 is the first distinct element present in the array from left to right
//
//Testcase 3:
//Only 2 distinct elements are present in the array, i.e., 8 and 3
//Since there are less than 4 distinct elements, therefore the answer is
public class Kth_Distinct_Element_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[]arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=0;i<N;i++){
            int val=map.get(arr[i]);
            if(val==1) list.add(arr[i]);
        }
        if(list.size()>=K) System.out.println(list.get(K-1));
        else System.out.println("0");
    }
}
