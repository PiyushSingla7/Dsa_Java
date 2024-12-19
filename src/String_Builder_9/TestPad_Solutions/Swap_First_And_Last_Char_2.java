package String_Builder_9.TestPad_Solutions;

import java.util.Scanner;

//Swap first and last character of each word in a string bookmark_border
//Write a program which given a string, swap first and last character of each word in it.
//
//Complete the function swapFirstLastChar() that accepts a multiword string and swaps the first and last character of every word in it.
//
//Note: Every two adjacent words in the given string will be separated by exactly one space character.
//
//Input Format
//
//The first line of input consists number of testcases, T
//The next T lines contains a string on which the said operation is to be performed
//Output Format
//
//For each testcase, print the string after doing the given operatio
//Sample Input
//
//2
//Code Quotient
//Get better at coding
//Sample Output
//
//eodC tuotienQ
//teG retteb ta godinc
public class Swap_First_And_Last_Char_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(swapFirstLastChar(str));
    }
    static String swapFirstLastChar(String str) {
        String[]arr=str.split(" ");
        StringBuilder ans=new StringBuilder();
        for(String temp:arr){
            StringBuilder s=new StringBuilder(temp);
            char ch=s.charAt(0);
            s.setCharAt(0,s.charAt(s.length()-1));
            s.setCharAt(s.length()-1,ch);
            ans.append(s).append(" ");
        }
        return ans.toString().trim();
    }
}
