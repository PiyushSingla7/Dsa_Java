package Arrays_And_Array_List_6;

import java.util.Scanner;

public class Imp_Sort_Colors_Dutch_Flag_Algorithm_14 {
    public static void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // method-1:-
        // int noz = 0, noo = 0;
        // for (int ele : nums) {
        //     if (ele == 0) noz++;
        //     else if (ele == 1) noo++;
        // }
        // for (int i = 0; i < n; i++) {
        //     if (i < noz) nums[i] = 0;
        //     else if (i < noz + noo) nums[i] = 1;
        //     else nums[i] = 2;
        // }
        // for (int ele : nums) {
        //     System.out.print(ele + " ");
        // }

        // method-2 :-
        int low,mid,high;
        low=mid=0;
        high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2) {
                swap(nums,mid,high);
                high--;
            }
        }
        for(int ele:nums){
            System.out.print(ele+" ");
        }
    }
}
