package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Solution {
    public static void main(String[] args) throws Exception {

        int firstNumberFromConsole = initNumber();
        int secondNumberFromConsole = initNumber();

        System.out.println(checkerNod(firstNumberFromConsole,secondNumberFromConsole));

    }

    static int initNumber() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        if (number <= 0) {
            throw new NumberLessOrZeroException("Input number less 0 or equal 0");
        } else return number;
    }

    static int checkerNod(int firstNumber, int secondNumber) {
        int minOfTwoNumbers;
        int NOD = 0;

        if (firstNumber < secondNumber) {
            minOfTwoNumbers = firstNumber;
        } else minOfTwoNumbers = secondNumber;

        for (int i = minOfTwoNumbers; i > NOD; i--) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                NOD = i;
            }
        }
        return NOD;
    }
}