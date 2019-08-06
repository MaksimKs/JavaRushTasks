package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strArr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strArr.add(i, reader.readLine());
        }

        for (int i = 1; i < strArr.size(); i++) {
            if (strArr.get(i - 1).length() > strArr.get(i).length()) {
                System.out.println(i);
                break;
            }
        }
        reader.close();
    }
}

