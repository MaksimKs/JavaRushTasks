package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long firstNumber = Long.parseLong(reader.readLine());
        long secondNumber = Long.parseLong(reader.readLine());
        long thirdNumber = Long.parseLong(reader.readLine());

        long[] array = new long[]{firstNumber, secondNumber, thirdNumber};
        comparisonNumbers(array);
    }

    static void comparisonNumbers (long [] array) {

        for (int i = array.length - 1; i > 0; i--){
            for (int j = 0; j < array.length - 1; j ++) {
                if (array[j + 1] > array[j]) {
                    long temporary = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temporary;
                }
            }
        }
        for (int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
    }
}
