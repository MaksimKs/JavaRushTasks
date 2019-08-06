package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        double rate = 1.1299;
        int firstAmountOfEur = 20;
        int secondAmountOfEur = 15;
        System.out.println(convertEurToUsd(firstAmountOfEur,rate));
        System.out.println(convertEurToUsd(secondAmountOfEur,rate));

    }

    public static double convertEurToUsd(int eur, double course) {
        double amountInUsd = eur * course;
        return amountInUsd;

    }
}
