package Hashmaps_And_Hashsets_20.TestPad;

import java.util.HashMap;
import java.util.Scanner;

//First Unique Character bookmark_border
//Given a string that contains only lowercase English letters, find the first non-repeating character in it and return its index. If it doesn't exist, then return -1.
//
//Input Format:
//
//First line contains a string.
//Output Format:
//
//Print the index of the first non-repeating character in the given string. If it doesn’t exist, then print -1.
//Constraints:
//
//‘a’ <= str[i] <= ‘z’
//1 <= length of str <= 100000
//Sample Input 1
//
//codequotientchamp
//Sample Output 1
//
//2
//Explanation 1
//
//‘d’ is the first non-repeating character in the given string, therefore the output is its index i.e. 2.
//Sample Input 2
//
//silentlisten
//Sample Output 2
//
//-1
//Explanation 2
//
//All the characters in the given string are repeating, therefor
public class Imp_First_Unique_Character_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> result = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char temp : chars) {
            result.put(temp, result.getOrDefault(temp, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (result.get(ch) == 1) {
                System.out.println(i);
                break;
            }
            ;
        }
    }
}
