package Two_D_Arrays_7;
//118 pascal triangle leetcode
//119 pascal triangle II most important question must visit and solve
import java.util.ArrayList;
import java.util.Scanner;

public class Imp_Pascal_Triangle_LC_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    a.add(1);
                } else {
                    a.add((result.get(i - 1).get(j) + result.get(i - 1).get(j - 1)));
                }
            }
            result.add(a);
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
