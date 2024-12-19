package String_Builder_9;

import java.util.Arrays;
import java.util.Scanner;

public class Imp_Sorting_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[]ch=str.toCharArray();
        for(char ele:ch){
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for(char ele:ch){
            System.out.print(ele);
        }
        System.out.println();
    }
}
