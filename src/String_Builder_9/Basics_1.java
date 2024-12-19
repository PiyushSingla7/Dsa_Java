package String_Builder_9;

public class Basics_1 {
    public static void main(String[] args) {
        String s = "hello";
        // want to change it to heylo
        // s.charAt(2)='y'; this will give an error

        s = "heylo"; // this is one way to change the entire String
        System.out.println(s);

        s = s.substring(0, 2) + 'y' + s.substring(3);// this is another way to change the string
        System.out.println(s);

        // we can change the string by using the above two methods but they are not recomended because they uses extra time and extra space also every time an new string is created and then it is assigned to the variable so string are immutuable in java so we need stringbuilder

    }
}
