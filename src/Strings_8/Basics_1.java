package Strings_8;

import java.util.Scanner;

public class Basics_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char[] name = {'P', 'I', 'Y', 'U', 'S', 'H'};
        for (char ch : name) {
            System.out.print(ch);
        }

        String n = "PIYUSH";
        System.out.println(n);

        String str=sc.next(); //dont take full string rejects input after space
        System.out.println(str);

        sc.nextLine(); //to clear the buffer

        String str2=sc.nextLine(); // take full sentence as input
        System.out.println(str2);
    }
}
