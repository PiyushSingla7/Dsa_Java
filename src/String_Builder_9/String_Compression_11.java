package String_Builder_9;

import java.util.Scanner;

public class String_Compression_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        String ans = "";
        int i = 0, j = 0;
        while (j < arr.length) {
            if (arr[j] == arr[i]) j++;
            else {
                ans += arr[i];
                if ((j - i) > 1) {
                    ans += (j - i);
                }
                i = j;
            }
        }
        ans += arr[i];
        if ((j - i) > 1) {
            ans += (j - i);
        }
        System.out.println(ans);
    }
}
