package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds (int hour) {
        //int numberInSeconds = hour * 60;
        return hour*3600;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(60));
        System.out.println(convertToSeconds(10));
    }
}