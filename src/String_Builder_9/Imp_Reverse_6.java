package String_Builder_9;

import java.util.Scanner;

// reverse each word in a given sentence
// i am raghav garg -> i ma vahgar grag
public class Imp_Reverse_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] arr = a.split(" ");
        StringBuilder str = new StringBuilder();
        for (String temp : arr) {
            StringBuilder str2 = new StringBuilder(temp);
            str2.reverse();
            str.append(str2 + " ");
        }
        System.out.println(str);
    }
}
