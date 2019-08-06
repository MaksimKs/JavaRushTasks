package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long firstNumber = Long.parseLong(bufferedReader.readLine());
        long secondNumber = Long.parseLong((bufferedReader.readLine()));

        System.out.println(comparisonFunc(firstNumber,secondNumber));

        bufferedReader.close();

    }

    static long comparisonFunc(long firstN, long secondN) {
        if (firstN < secondN) {
            return firstN;
        } else if (firstN > secondN) {
            return secondN;
        } else if (firstN == secondN) {
            return firstN;
        } else return 0;
    }
}