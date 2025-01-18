package Hashmaps_And_Hashsets_20.TestPad;

import java.util.Scanner;
import java.util.*;

//Count frequency of each character bookmark_border
//Given a string that contains only lowercase characters. Write a program to print all the distinct characters along with their frequency in the order of their occurrence. For example if the string is “helloworld”, then you should print h1 e1 l3 o2 w1 r1 d1
//
//Complete the given function countFrequency() and print the frequency of each character as per the given statement.
//
//Input Format
//
//First line contains a string with lowercase characters.
//Constraints
//
//'a' <= str[i] <= 'z'
//1 <= length of str <= 100000
//Output Format
//
//Print all the distinct characters along with their frequency followed by a space. And the characters must be printed in the order of their occurrence.
//Sample Input
//
//codequotient
//Sample Output
//
//c1 o2 d1 e2 q1 u1 t2 i1 n1
public class Count_Frequency_Of_Each_Char_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer>map=new HashMap<>();
        char[]chars=str.toCharArray();
        for(char ch:chars){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i=0;i<chars.length;i++) {
            char ch=chars[i];
            if(map.containsKey(ch)){
                System.out.print(ch + "" + map.get(ch) + " ");
                map.remove(ch);
            }
        }
    }
}
