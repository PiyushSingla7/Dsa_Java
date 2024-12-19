package Time_And_Space_Complexity_10;

import java.util.Scanner;

public class Imp_Q_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("Okay");
            }
        }
        // time complexicity -> O(n^2)
    }
}
