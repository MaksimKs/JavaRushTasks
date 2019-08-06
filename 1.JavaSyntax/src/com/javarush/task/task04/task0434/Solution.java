package com.javarush.task.task04.task0434;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 1;

        while (firstNumber <= 10) {
            System.out.print(firstNumber * secondNumber + " ");
            firstNumber++;

            if (firstNumber > 10) {
                System.out.print("\n");
                firstNumber /= firstNumber;
                secondNumber++;
            }
            if (secondNumber > 10) {
                break;
            }
        }
    }
}
