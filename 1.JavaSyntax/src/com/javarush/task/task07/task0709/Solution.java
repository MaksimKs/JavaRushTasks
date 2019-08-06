package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = 0;
        while (counter < 5) {
            list.add(reader.readLine());
            counter++;
        }
        int minString = list.get(0).length();

        for (int i = 1; i < list.size(); i++) {
            if (minString > list.get(i).length()) {
                minString = list.get(i).length();
            }
        }

        for (String elementOfList: list) {
            if (elementOfList.length() == minString) {
                System.out.println(elementOfList);
            }
        }
        reader.close();
    }
}
