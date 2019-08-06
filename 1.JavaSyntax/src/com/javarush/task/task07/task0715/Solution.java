package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("мама");
        strList.add("мыла");
        strList.add("раму");
        String element = "именно";

        for (int i = 0; i < strList.size(); i ++) {
            strList.add(++i,element);
        }
        for (String list:strList) {
            System.out.println(list);
        }
    }
}
