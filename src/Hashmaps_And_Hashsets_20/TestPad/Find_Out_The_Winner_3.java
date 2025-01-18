package Hashmaps_And_Hashsets_20.TestPad;

import java.util.Scanner;
import java.util.*;

//Find out the winner bookmark_border
//Given an array of strings, find out the string which occurs maximum number of times. If two strings occurs maximum times, return the alphabetically later string. For example,
//
//if array is ["Amit", "Girdhar", "Amit", "Girdhar", "Girdhar", "Amit", "Amit"] then return "Amit", and
//
//if array is ["Amit", "Girdhar", "Amit", "Girdhar", "Girdhar", "Amit"] then return "Girdhar" as both occurs 3 times but Girdhar comes after Amit in alphabetical order.
//
//So, write a function which accepts a string array as input and return the output string.
//
//Input Format
//
//The first line contains an integer n, the number of names in string array.
//Each the n subsequent lines contains a string describing array[i] where 0 ≤ i < n.
//Output Format
//
//Print the output string
//Constraints
//
//1 ≤ n ≤ 10^5
//1 ≤ length of string ≤ 64
//string will contain only lowercase english alphabets i.e. from 'a' to 'z'
//Sample Input
//
//6
//Amit
//Girdhar
//Amit
//Girdhar
//Girdhar
//Amit
//Sample Output
//
//Girdhar
public class Find_Out_The_Winner_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        for(int i=0;i<n;i++){
            words[i]=sc.nextLine();
        }
        HashMap<String,Integer>map=new HashMap<>();
        for(String word:words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        int max = Collections.max(map.values());
        String result = "";
        for (String word : map.keySet()) {
            if (map.get(word) == max) {
                if (result.equals("") || word.compareTo(result) > 0) {
                    result = word;
                }
            }
        }
        System.out.println(result);
    }
}
