package Hashmaps_And_Hashsets_20;

import java.util.HashMap;
import java.util.Objects;

public class Imp_Basic_Hashmaps_2 {
    public static void main(String[] args) {
        //insert,search,remove,size -> O(1)
        //put,get,remove,size
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Piyush", 98);
        map.put("Rohan", 87);
        map.put("Mohan", 95);
        map.put("Johan", 95);
        map.put("Sohan", 76);
        map.put("Sohan", 87); //similarly like hashsets we cant add same items in hashmaps but in hashmaps the value gets changed
        //{Mohan=95, Sohan=87, Piyush=98, Rohan=87}
        System.out.println(map);
        System.out.println(map.containsKey("Piyush"));
        System.out.println(map.containsValue(95));

        System.out.println(map.size());
        map.remove("Rohan");
        //if we try to remove an key that doesnt exist then nothing happens no error will be shown code runs smoothly

        System.out.println(map.get("Sohan"));
        for (String temp : map.keySet()) {
            System.out.print(temp + " ");
        }

        System.out.println();

        for (int val : map.values()) {
            System.out.print(val + " ");
        }

        System.out.println();

        for (Object pair : map.entrySet()) {
            System.out.println(pair);
        }
    }
}
