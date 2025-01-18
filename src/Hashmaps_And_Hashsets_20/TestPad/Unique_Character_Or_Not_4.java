package Hashmaps_And_Hashsets_20.TestPad;

import java.util.Scanner;
import java.util.*;

//Unique characters or not bookmark_border
//Given a string, you need to test the characters for their uniqueness. If all the characters occur at most 1 time in the string, then print “YES”, otherwise if some character occurs at least twice in the string print “NO”.
//
//Input Format:
//
//The first line of input contains an integer T denoting the no of test cases . Then T test cases follow. Each test case contains the string str.
//Function void isUniqueChars(char *str) will take the string as parameter and print YES or NO according to the occurence of characters in it.
//Output Format:
//
//For each test case, print YES or NO in new lines.
//Constraints:
//
//1 <= T <= 10
//Given string can contain any valid ASCII character.
//Sample Input
//
//2
//CodeQuotient
//Coding
//Sample Output
//
//NO
//YES
public class Unique_Character_Or_Not_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character>set=new HashSet<>();
        char[]chars=str.toCharArray();
        boolean flag=true;
        for(char ch:chars){
            if(set.contains(ch)) {
                flag=false;
                break;
            }
            set.add(ch);
        }
        if(flag) System.out.println("true");
        else System.out.println("false");
    }
}
