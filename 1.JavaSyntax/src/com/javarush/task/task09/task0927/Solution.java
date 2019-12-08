package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String,Cat> mapCat = new HashMap<>();
        mapCat.put("Black",new Cat("Black"));
        mapCat.put("Grey",new Cat("Grey"));
        mapCat.put("White",new Cat("White"));
        mapCat.put("Foxy",new Cat("Foxy"));
        mapCat.put("Jumper",new Cat("Jumper"));
        mapCat.put("Kali",new Cat("Kali"));
        mapCat.put("Felix",new Cat("Felix"));
        mapCat.put("Flash",new Cat("Flash"));
        mapCat.put("Mag",new Cat("Mag"));
        mapCat.put("Ali",new Cat("Ali"));
        return mapCat;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> setCat = new HashSet<>();
        for (Iterator<Map.Entry<String,Cat>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String,Cat> pair = iterator.next();
            setCat.add(pair.getValue());
        }
        return setCat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
