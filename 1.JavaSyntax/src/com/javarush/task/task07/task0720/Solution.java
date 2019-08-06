package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int firstNumberFromCons = Integer.parseInt(reader.readLine());
        int secondNumberFromCons = Integer.parseInt(reader.readLine());

        ArrayList<String> listStr = new ArrayList<>();
        for (int i = 0; i < firstNumberFromCons; i++) {
            listStr.add(reader.readLine());
        }

        for (int i = 0; i < secondNumberFromCons; i++) {
                String temp = listStr.get(0);
                listStr.remove(0);
                listStr.add(temp);
        }

        for(String list: listStr) {
            System.out.println(list);
        }
    }
}
