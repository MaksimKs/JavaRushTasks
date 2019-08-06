package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int firstNumber = 0;
        int counter = 1;
        while (counter <= 5) {
            firstNumber += counter;
            System.out.println(firstNumber);
            counter++;
        }
    }
}
