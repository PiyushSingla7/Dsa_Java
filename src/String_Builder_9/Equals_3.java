package String_Builder_9;

public class Equals_3 {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String c = "abc";
        c = c + "xyz";
        System.out.println(s == a); //true
        System.out.println(s == b); //false
        System.out.println(s == c); //false
        // if we are using == in string then it compares the adress of the string

        System.out.println(s.equals(a)); //true
        System.out.println(s.equals(b)); //true
        System.out.println(s.equals(c)); //true
    }
}
