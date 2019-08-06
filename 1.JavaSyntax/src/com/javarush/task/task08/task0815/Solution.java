package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String,String> names = new HashMap<>();
        names.put("Bobby","Bob");
        names.put("Chin", "Kate");
        names.put("Al", "Alan");
        names.put("White", "Andy");
        names.put("Brown", "Alex");
        names.put("Si","Olga");
        names.put("Robinson","Nate");
        names.put("Bond","Kate");
        names.put("Curry","Tom");
        names.put("Johnson","Bob");
        return names;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int firstNameCounter = 0;
        for (Map.Entry<String, String> pairFirstN : map.entrySet()) {
            if (pairFirstN.getValue().equalsIgnoreCase(name)) {
                firstNameCounter++;
            }
        }
        return firstNameCounter;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int secondNameCounter = 0;
        for(Map.Entry<String,String> pairSecondN : map.entrySet()) {
            if (pairSecondN.getKey().equalsIgnoreCase(lastName)) {
                secondNameCounter++;
            }
        }
        return secondNameCounter;
    }

    public static void main(String[] args) {
/*        int b = getCountTheSameFirstName(createMap(),"white");
        int n = getCountTheSameLastName(createMap(),"andy");
        System.out.println(b);
        System.out.println(n);*/
    }
}
