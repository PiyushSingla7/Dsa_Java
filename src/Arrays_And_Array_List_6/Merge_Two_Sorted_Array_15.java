package Arrays_And_Array_List_6;

import java.util.Scanner;

public class Merge_Two_Sorted_Array_15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[]arr1=new int[m];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }

        int n=sc.nextInt();
        int[]arr2=new int[n];
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }

        int[]result=new int[m+n];
        int i,j,k;
        i=j=k=0;

        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                result[k]=arr1[i];
                i++;
            }
            else{
                result[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            result[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n){
            result[k]=arr2[j];
            j++;k++;
        }
        for(int ele:result){
            System.out.print(ele+" ");
        }
    }
}
