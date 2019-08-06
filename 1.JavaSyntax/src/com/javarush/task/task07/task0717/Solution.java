package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listStr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listStr.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(listStr);

        for(String multiStr: result) {
            System.out.println(multiStr);
        }
        reader.close();
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            String temp = list.get(i);
            list.add(i + 1, temp);
            i++;
        }
        return list;
    }
}
