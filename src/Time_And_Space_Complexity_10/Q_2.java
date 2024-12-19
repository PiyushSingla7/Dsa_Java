package Time_And_Space_Complexity_10;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n + 3; i++) {
            System.out.println(i);
        }
        // time complexicity -> O(n+3) ~ O(n)
        // final time complexicity -> O(n)
    }
}
