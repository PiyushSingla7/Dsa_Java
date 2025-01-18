package Hashmaps_And_Hashsets_20.TestPad;

import java.util.Scanner;
import java.util.*;

//Maximum Frequency in a sequence bookmark_border
//Given a list of integers, find out the number that has the highest frequency. If there are more than one such numbers, output the smaller one.
//
//Input:
//
//First line of input will contain an integer T = number of test cases.
//Each test case will contain two lines:
//First line will contain an integer N = number of elements in the sequence.
//Next line will contain N space separated integers of sequence A.
//Output:
//
//For each test case, print on a single line, the smallest number with highest frequency in the sequence.
//Constraints
//
//1 <= T <= 100
//1 <= N <= 10^5
//0 <= A[i] <= 1000
//Sample Input
//
//3  // No. of test cases
//7
//2 4 5 2 3 2 4
//6
//1 2 1 1 2 1
//10
//1 1 1 1 1 1 1 1 1 1
//Sample Output
//
//2
//1
//1
public class Maximum_Frequency_In_A_Sequence_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:A){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=Collections.max(map.values());
        ArrayList<Integer>list=new ArrayList<>();
        for(int i:A){
            int val=map.get(i);
            if(val==max) list.add(i);
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
