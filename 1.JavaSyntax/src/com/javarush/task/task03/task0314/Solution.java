package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        for (int i = 1; i <= table.length; i++) {

            for (int j = 1; j <= table.length; j++) {

                System.out.print(i * j + " ");
            }
            System.out.print("\n");
        }
    }
}