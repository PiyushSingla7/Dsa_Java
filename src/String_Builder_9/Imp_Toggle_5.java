package String_Builder_9;

import java.util.Scanner;

// input a string and toggle all the charcaters of it (replace small case with capital case and vice versa)
// A->65 Z->90
// a->97 z->122
public class Imp_Toggle_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder a = new StringBuilder(sc.nextLine());
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 65 && ascii <= 90) { //capital
                ascii += 32;
            } else if (ascii >= 97 && ascii <= 122) {
                ascii -= 32;
            }
            ch = (char) ascii;
            a.setCharAt(i, ch);
        }
        System.out.println(a);
    }
}
