package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sumOfNumbers = 0;
        double counter = 0;
        while (true) {
            int numberFromConsole = Integer.parseInt(reader.readLine());

            if (numberFromConsole == -1) {
                double average = sumOfNumbers/counter;
                //System.out.println(average);
                System.out.println(new BigDecimal(average).setScale(4, RoundingMode.HALF_EVEN));
                break;
            }
            sumOfNumbers += numberFromConsole;
            counter++;
        }
        reader.close();
    }
}

