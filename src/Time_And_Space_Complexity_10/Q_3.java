package Time_And_Space_Complexity_10;

import java.util.*;

public class Q_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i += 2) {
            System.out.println(i);
        }
        // time complexicity -> O(n/2) ~ O(n)
        // final time complexicity -> O(n)
    }
}
