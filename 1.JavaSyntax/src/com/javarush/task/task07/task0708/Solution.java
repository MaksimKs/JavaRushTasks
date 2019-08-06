package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter=0;
        while (counter < 5) {
            strings.add(reader.readLine());
            counter++;
        }
        int maxString = strings.get(0).length();

        for (int i = 1; i < strings.size(); i++) {
            if (maxString < strings.get(i).length()){
                maxString = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if (maxString == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
        }
        reader.close();
    }
}
