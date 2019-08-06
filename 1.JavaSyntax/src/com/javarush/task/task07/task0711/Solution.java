package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
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

        for (int i = 0; i < 13; i++) {
            String temp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0,temp);
        }
        for (String listElement: list) {
            System.out.println(listElement);
        }
        reader.close();
    }
}
