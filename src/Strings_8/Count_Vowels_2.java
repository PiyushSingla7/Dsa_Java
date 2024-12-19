package Strings_8;

import java.util.Scanner;

public class Count_Vowels_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str= s.toLowerCase();
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'e') {
                c++;
            }
        }
        System.out.println(c);
    }
}
