package Hashmaps_And_Hashsets_20;

import java.util.HashSet;

public class Imp_Basic_Hashset_1 {
    public static void main(String[] args) {
        //insert,delete,search,size -> O(1)
        //add,remove,contains,size
        //if we search for an element that doesn't exist in hashmap then it doesn't through an error will work smoothly
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(-8);
        set.add(34);
        System.out.println(set); //elements of set will be printed in random order
        System.out.println(set.size());

        set.remove(34);
        System.out.println(set.size());

        // search -> true/false -> O(1)
        System.out.println(set.contains(50));
        System.out.println(set.contains(20));

        Object[] arr = set.toArray();

        //for iteration we dont use for/while loop we use foreach loop because in hashmaps there is no concept of indexes
        for (int ele : set) {
            System.out.print(ele + " ");
            //set.add(50); //error
        } // when we iterating in set we cant add or remove element it will throw an error

        set.clear(); //to empty the set
        // in hashset occurance of any element is only once we cant add the same element again
    }
}
