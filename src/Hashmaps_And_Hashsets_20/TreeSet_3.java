package Hashmaps_And_Hashsets_20;

import java.util.TreeSet;

public class TreeSet_3 {
    public static void main(String[] args) {
        //tree works in O(logn) complexity but the benefit of trees are that they works in sorted ordered
        //treeset and treemap are also known as ordered set and ordered map
        //hashset and hashsmap are also known as unordered set and unordered map
        TreeSet<Integer>set=new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(-8);
        set.add(34);
        System.out.println(set); // -8 10 20 34

    }
}
