package String_Builder_9;

import java.util.Scanner;

//given a string consisting of lowercase english alphabets print the charcters count
public class Frequency_Array_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                System.out.print("Count Of " + (char) (i + 'a') + " is:- " + arr[i]);
                System.out.println();
            }
        }
    }
}
