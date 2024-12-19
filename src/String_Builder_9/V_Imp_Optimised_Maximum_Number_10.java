package String_Builder_9;

import java.util.Scanner;
//implement a custom logic to determine the "maximum" string based on lexicographical or numerical comparison, even with leading zeros.
//5
//000123
//0456
//0000
//999
//00123
// ouput -> 999

//4
//000
//00
//0000
//0
// output -> 0000

//4
//000123
//123
//0123
//00123
//ouput -> 000123

//5
//12345678987654321234567654321234567654321234567
//12345678
//765432
//567876543
//23456789876543212345678765432
//output -> 12345678987654321234567654321234567654321234567
public class V_Imp_Optimised_Maximum_Number_10 {
    public static String max(String a, String b) {
        String str1 = purify(a), str2 = purify(b);
        if (str1.length() > str2.length()) return a;
        else if (str2.length() > str1.length()) return b;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (str1.charAt(i) > str2.charAt(i)) return a;
                else if (str1.charAt(i) < str2.charAt(i)) return b;
            }
        }
        if (a.length() > b.length()) return a;
        else return b;
    }

    public static String purify(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '0') return a.substring(i);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLine();
        }
        String maxs = arr[0];
        for (int i = 0; i < size; i++) {
            maxs = max(maxs, arr[i]);
        }
        System.out.println(maxs);
    }
}
