package Recursion_13;

import java.util.Scanner;

public class Imp_Generate_Parathesis_12 {
    public static void gene(int n,String ans,int lc,int rc){
        if(ans.length()==2*n){
            System.out.println(ans);
            return;
        }
        if (lc < n) gene(n, ans + "(", lc + 1, rc);
        if (rc < lc) gene(n, ans + ")", lc, rc + 1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        gene(n,"",0,0);
    }
}
