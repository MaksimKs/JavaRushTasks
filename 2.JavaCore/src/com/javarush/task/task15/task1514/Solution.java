package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(1.123, "one");
        labels.put(2.234, "two");
        labels.put(3.345, "three");
        labels.put(4.456, "four");
        labels.put(5.567, "five");
    }


    public static void main(String[] args) {
        System.out.println(labels);
    }
}
