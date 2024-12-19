package String_Builder_9;

import java.util.Scanner;

public class Imp_String_Builder_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "Piyush";
        StringBuilder a = new StringBuilder(str);
        System.out.println(a.length());
        System.out.println(a.capacity());

        StringBuilder b = new StringBuilder(3);
        System.out.println(b.capacity()); //3
        System.out.println(b.length());

        StringBuilder c = new StringBuilder();
        System.out.println(c.capacity());//by default capacity for empty string is 16
        System.out.println(c.length());

        StringBuilder d = new StringBuilder(sc.nextLine());
        System.out.println(d);

        StringBuilder e = new StringBuilder("rohan");
        System.out.println(e);
        e.setCharAt(1,'g');
        System.out.println(e);

        e.append('r');
        System.out.println(e);

        StringBuilder f=new StringBuilder("Mohit");
        System.out.println(f);
        f.reverse();
        System.out.println(f);
    }
}
