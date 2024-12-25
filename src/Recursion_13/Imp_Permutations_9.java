package Recursion_13;

import java.util.Scanner;

public class Imp_Permutations_9 {
    public static void printper(String ans,String s){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1,s.length());
            printper(ans+ch,left+right);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        printper("",s);
    }
}
