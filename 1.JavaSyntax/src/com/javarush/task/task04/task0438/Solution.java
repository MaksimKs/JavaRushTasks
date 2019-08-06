package com.javarush.task.task04.task0438;

/* 
Рисуем линии
*/

public class Solution {
    public static void main(String[] args) {
        int formNumber = 8;
        int horizontalBound = 10;
        int verticalBound = 11;

        for (int i = 0; i <= verticalBound; i++) {
            if (i > 0) {
                System.out.println(formNumber);
                continue;}
            for (int j = 1; j < horizontalBound; j++) {
                System.out.print(formNumber);
            }
        }
    }
}
