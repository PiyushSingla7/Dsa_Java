package String_Builder_9;

import java.util.Scanner;

public class Maximum_Number_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        sc.nextLine();
        String[]arr=new String[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextLine();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            int a= Integer.parseInt(arr[i]);
            max=Math.max(a,max);
        }
        System.out.println(max);
    }
}
