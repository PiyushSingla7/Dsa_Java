package Basics_1;

import java.util.Scanner;

public class Imp_Sum_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Sum Of "+x+" And "+y+" Is :- "+(x+y));
        //System.out.println("Sum Of "+x+" And "+y+" Is :- "+x+y); this will return 56 as sum
    }
}
