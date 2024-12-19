package String_Builder_9;

import java.util.Scanner;

// input an string from user and update all the even positions in the string to character a consider 0 based indexing
//physics wallah skills
//ahasaca aaalahasaiala
public class Change_String_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String t = "";
        for (int i = 0; i < a.length(); i++) {
            if (i % 2 == 0) {
                t += 'a';
            } else {
                t += a.charAt(i);
            }
        }
        System.out.println(t);
    }
}
