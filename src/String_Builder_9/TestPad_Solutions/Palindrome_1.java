package String_Builder_9.TestPad_Solutions;

import java.util.Scanner;

//Find occurrences of palindrome words in a string bookmark_border
//Write a function which given a string, count and return the palindrome words present in the string. A word in a string is separated with space(s).
//
//Sample Input 1
//
//Mom and Dad are my best friends
//Sample Output 1
//
//2
//Explanation 1
//
//﻿This string contains two palindrome words (i.e., Mom, Dad) so the count is 2.
//Sample Input 2
//
//mohit speaks english
//Sample Output 2
//
//0
//Explanation 2
//
//This string contains no palindrome words.
public class Palindrome_1 {
    static int countPalindrome(String str) {
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        int count = 0;
        for (String temp : arr) {
            if (ispalin(temp)) count++;
        }
        return count;
    }
    static boolean ispalin(String a) {
        StringBuilder b = new StringBuilder(a);
        b.reverse();
        return b.toString().equals(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countPalindrome(str));
    }
}
