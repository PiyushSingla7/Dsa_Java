package Hashmaps_And_Hashsets_20.TestPad;

import java.util.*;

//Pair with the given sum bookmark_border
//Given a sorted array of n elements, and an integer k. Find whether there exists any two elements in the array that sums up to the given value k. If such a pair is found, then print “Found”, else print “Not Found”.
//
//Note: You can not use the same index element twice.
//
//Input Format
//
//First line will contain an integer T, denoting the number of test cases.
//For each test case:
//  First line will contain an integer n, denoting the number of elements in the array.
//  Second line will contain n space separated integers that denote the array elements.
//  Third line contains an integer k, that denotes the target sum.
//Output Format
//
//For each test case, print “Found” if there exists at least one pair whose sum equals to k, else print 'Not Found'.
//Constraints
//
//  1 <= T <= 10
//  1 <= n <= 10^5
// -(10^9) <= arr[i] <= 10^9
// -(10^9) <= k <= 10^9
//Sample Input
//
//2  // Test Cases
//5               // n (testcase 1)
//1 3 4 6 7       // arr[]
//9               // k
//6               // n (testcase 2)
//-3 -1 4 5 7 12  // arr[]
//7               // k
//Sample Output
//
//Found
//Not Found
//Explanation:
//
//Testcase 1:
//Sum of 3 and 6 in the given array is 9.
//
//Testcase 2:
//No pair in the given array has sum equals to 7.
public class Pair_With_Given_Sum_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer>set=new HashSet<>();
        boolean flag=false;
        for(int i:arr){
            if(set.contains(k-i)) {
                flag=true;
                break;
            }
            set.add(i);
        }
        if(flag) System.out.println("1");
        else System.out.println("0");
    }
}
