package Time_And_Space_Complexity_10;

import java.util.*;

public class Q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = i;
        }
        for (int i = 0; i < m; i++) {
            b[i] = m - i;
        }
        // time complexicity -> O(n+m)
    }
}
