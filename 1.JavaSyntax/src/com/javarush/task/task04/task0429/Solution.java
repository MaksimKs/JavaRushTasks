package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());

        countNumbers(firstNumber, secondNumber, thirdNumber);

        reader.close();
    }
    static void countNumbers (int firstN, int secondN, int thirdN) {
        int positiveCounter = 0;
        int negativeCounter = 0;

        if (firstN > 0) {
            positiveCounter++;
        } else if (firstN < 0) negativeCounter++;

        if (secondN > 0) {
            positiveCounter++;
        } else if (secondN < 0) negativeCounter++;

        if (thirdN > 0) {
            positiveCounter++;
        } else if (thirdN < 0) negativeCounter++;
        System.out.println("количество отрицательных чисел:  " + negativeCounter + "\n" +
                "количество положительных чисел: " + positiveCounter);
    }
}
