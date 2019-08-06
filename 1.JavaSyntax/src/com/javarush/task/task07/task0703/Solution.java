package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String [] arrString = new String [10];
        int [] arrInt = new int [10];

        for (int i = 0; i < arrString.length; i++) {
            arrString[i] = reader.readLine();

            int j = i; {
                arrInt[j] = arrString[i].length();
            }
        }
        for (int number:
             arrInt) {
            System.out.println(number);
        }
        reader.close();
    }
}
