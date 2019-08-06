package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String [] arrStr = new String[10];
        for (int i = 0; i < 8; i++) {
            arrStr[i] = reader.readLine();
        }
        reader.close();

        for (int j = arrStr.length - 1; j >= 0; j--) {
            System.out.println(arrStr[j]);
        }
    }
}