package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Set<String> duplicate = new HashSet<String>();
        for (Map.Entry<String,String> mapIn : map.entrySet()) {
            for (Map.Entry<String,String> values : map.entrySet()) {
                if (mapIn.getValue().equals(values.getValue()) && !mapIn.getKey().equals(values.getKey())) {
                    duplicate.add(mapIn.getValue());
                }
            }
        }
        for (String string : duplicate) {
            removeItemFromMapByValue(map,string);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        //Map<String,String> map1 = new HashMap<>(createMap());
        //removeTheFirstNameDuplicates(map1);
        /*for(Map.Entry<String,String> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }*/
        //map1.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
