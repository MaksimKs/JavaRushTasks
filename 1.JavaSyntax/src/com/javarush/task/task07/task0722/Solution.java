package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> listStr = new ArrayList<>();
/*
        while (true) {
            String line = reader.readLine();
            if (line.equals("end")) {
                break;
            } else listStr.add(line);
        }*/

        String line = reader.readLine();
        while (!line.equals("end")) {
            listStr.add(line);
            line = reader.readLine();
        }
        for (String list : listStr) {
            System.out.println(list);
        }
    }
}