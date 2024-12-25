package Recursion_13;

import java.util.Scanner;

public class Imp_Subsets_8 {
    public static void printsub(int i,String s,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch=s.charAt(i);
        printsub(i+1,s,ans+ch);
        printsub(i+1,s,ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        printsub(0,a,"");
    }
}
