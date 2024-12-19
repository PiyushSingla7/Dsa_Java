package Arrays_And_Array_List_6;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_7 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(6);
        list1.add(50);
        list1.add(0, 12);
        list1.add(1, 14);
        list1.add(2, 17);
        list1.add(3, 11);
        list1.add(15);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        } // 12 14 17 11 50 15
        // for initializing we use add function to change the value we use set function to get the value we use get function

        System.out.println();
        System.out.println();

        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(list2 + " " + list2.size());
        list2.add(60);

        System.out.println(list2 + " " + list2.size());
        list2.add(50);

        System.out.println(list2 + " " + list2.size());
        list2.add(70);

        System.out.println(list2 + " " + list2.size());
        list2.add(10);
        System.out.println(list2 + " " + list2.size());

        list2.remove(1);
        System.out.println(list2 + " " + list2.size());
    }
}
