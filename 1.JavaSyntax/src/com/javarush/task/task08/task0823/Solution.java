package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        if (string == null || string.trim().isEmpty()) {
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        String[] str = string.trim().split("\\s+");

        for (String word : str) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            String upperWord = firstLetter + word.substring(1);

            stringBuilder.append(upperWord);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString().trim());
    }
}
