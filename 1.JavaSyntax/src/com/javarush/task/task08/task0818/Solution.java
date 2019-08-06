package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> employees = new HashMap<String,Integer>();
        employees.put("Bobby", 450);
        employees.put("Chin", 510);
        employees.put("Al", 700);
        employees.put("White", 499);
        employees.put("Brown", 500);
        employees.put("Si", 501);
        employees.put("Robinson", 600);
        employees.put("Bond",800);
        employees.put("Curry", 850);
        employees.put("Johnson", 498);
        return employees;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        for(Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String,Integer> pair = iterator.next();
            if (pair.getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
/*        Map<String,Integer> pair1 = new HashMap<>(createMap());
        removeItemFromMap(pair1);
        pair1.forEach((k,v) -> System.out.println(k + " " + v));*/

    }
}