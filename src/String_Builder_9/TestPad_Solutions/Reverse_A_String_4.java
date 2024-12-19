package String_Builder_9.TestPad_Solutions;

import java.util.Scanner;

//Reverse a string bookmark_border
//Given a string, the task is to reverse it.
//
//For example, if the string is "Hello" , reversed string is "olleH".
//
//Complete the function reverseString() given in the editor that accepts a string & reverses it.
//
//Input Format:
//
//First line inputs number of Testcases t
//Then t strings follow in each line
//Output Format:
//
//For each test case output the reversed string
//Sample Input 1
//
//1
//codequotient
//Sample Output 1
//
//tneitouqedoc
//Sample Input 2
//
//1
//programming
//Sample Output 2
//
//gnimmargorp
public class Reverse_A_String_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }
    static String reverseString(String str) {
        StringBuilder ans = new StringBuilder(str);
        return (ans.reverse().toString());
    }
}
