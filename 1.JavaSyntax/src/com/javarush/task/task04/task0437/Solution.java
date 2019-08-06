package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        int formNumber = 8;
        int heightBound = 10;

        for (int i = 0; i < heightBound; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(formNumber);
            }
            System.out.println();
        }
    }
}