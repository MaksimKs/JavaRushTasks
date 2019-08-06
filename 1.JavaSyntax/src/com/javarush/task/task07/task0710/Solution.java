package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> listStr = new ArrayList<>();

        int counter = 0;
        while (counter < 10) {
            listStr.add(0, reader.readLine());
            counter++;

        }

        for(String elementListStr: listStr) {
            System.out.println(elementListStr);
        }
    }
}

