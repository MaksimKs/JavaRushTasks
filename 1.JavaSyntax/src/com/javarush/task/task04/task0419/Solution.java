package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long firstNumber = Long.parseLong(reader.readLine());
        long secondNumber = Long.parseLong(reader.readLine());
        long thirdNumber = Long.parseLong(reader.readLine());
        long fourthNumber = Long.parseLong(reader.readLine());

        long [] arrayNumber = {firstNumber,secondNumber,thirdNumber,fourthNumber};

        long maxNumber = arrayNumber[0];
        int maxIndex = 0;
        for (int i = 1; i < arrayNumber.length; i++) {

            if (arrayNumber[i] >= maxNumber) {
                maxNumber = arrayNumber[i];
                maxIndex = i;
            }
        }
        System.out.println(arrayNumber[maxIndex]);

        reader.close();
    }
}
