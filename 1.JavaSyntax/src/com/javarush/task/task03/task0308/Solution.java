package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int resultOfOneHundred = 1;
        int counter = 1;
        while (counter <= 10) {
            resultOfOneHundred *= counter;
            counter++;
        }
        System.out.println(resultOfOneHundred);
    }
}
