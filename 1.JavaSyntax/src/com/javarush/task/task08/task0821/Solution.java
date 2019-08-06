package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String,String> names = new HashMap<String,String>();
        names.put("Bobby","Bob");
        names.put("Chin", "Kate");
        names.put("Al", "Alan");
        names.put("White", "Andy");
        names.put("Brown", "Alex");
        names.put("Si","Olga");
        names.put("Robinson","Nate");
        names.put("Bond","Kate");
        names.put("Bobby","Tom");
        names.put("Robinson","Bob");

        return names;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
