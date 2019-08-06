package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int sumOfNumbers = 0;
        String n = String.valueOf(number);
        String [] array = n.split("");
        for (int i = 0; i < array.length; i++) {
            sumOfNumbers += Integer.parseInt(array[i]);
        }
        return sumOfNumbers;
    }
}