package Hashmaps_And_Hashsets_20.TestPad;

import java.util.*;

//Largest subarray with 0 (ZERO) sum bookmark_border
//Given an unsorted array of integers. Find the largest sub-array which adds to 0 (ZERO). For example,
//
//Given A = {11, 2, -2, 10, 1, -4, -7, 19} , Print "6" as the sum 0 is found between indexes 1 and 6. Note that from index 1 to index 2 is also resulting in 0, but we need to print the largest.
//
//If no sub-array found print -1.
//
//Input Format
//
//First Line will contain an integer N denoting the number of elements.
//Second line contains N integers separated by space.
//Output Format
//
//Print the length of the largest sub-array as shown if found otherwise print -1.
//Sample Input
//
//8
//11 2 -2 10 1 -4 -7 19
//Sample Output
//
//6
public class Largest_Subarray_With_Sum_Zero_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int idx=-1;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0) idx=i+1;
            if(map.containsKey(sum)){
                idx=Math.max(idx,i-map.get(sum));
                continue;
            }
            map.put(sum,i);
        }
        System.out.println(idx);
    }
}
