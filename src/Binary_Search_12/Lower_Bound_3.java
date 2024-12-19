package Binary_Search_12;

import java.util.Scanner;

public class Lower_Bound_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int low=0,high=n-1,lb=n;
        while(low<=high){
            int mid=(low)+(high-low)/2;
            if(arr[mid]>=target){
                lb= Math.min(lb,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(lb);
    }
}
