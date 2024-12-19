package String_Builder_9.TestPad_Solutions;

import java.util.Scanner;

//Capitalize the first letter of each word bookmark_border
//Write a program which given a string, Capitalize first letter of each word in it.
//
//Sample Input
//
//code quotient
//Sample Output
//
//Code Quotient
//Sample Input
//
//get better at coding
//Sample Output
//
//Get Better At Coding
public class Capitalize_First_Char_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(capitalizeFirstChar(str));
    }

    static String capitalizeFirstChar(String str) {
        String[] arr = str.split(" ");
        StringBuilder ans = new StringBuilder();
        for (String temp : arr) {
            if (temp.length() > 0) {
                StringBuilder a = new StringBuilder();
                a.append(Character.toUpperCase(temp.charAt(0)));
                a.append(temp.substring(1));
                ans.append(a).append(" ");
            }
        }
        return ans.toString().trim();
    }
}
