package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long numberConsole = Long.parseLong(reader.readLine());

        if (numberConsole < 1 || numberConsole > 999) {
        } else if (numberConsole >= 1 && numberConsole < 10 && numberConsole % 2 == 0) {
            System.out.println("четное однозначное число");
        } else if (numberConsole >= 1 && numberConsole < 10 && numberConsole % 2 != 0) {
            System.out.println("нечетное однозначное число");
        } else if (numberConsole >= 10 && numberConsole < 100 && numberConsole % 2 == 0) {
            System.out.println("четное двузначное число");
        } else if (numberConsole >= 10 && numberConsole < 100 && numberConsole % 2 != 0) {
            System.out.println("нечетное двузначное число");
        } else if (numberConsole >= 100 && numberConsole < 1000 && numberConsole % 2 == 0) {
            System.out.println("четное трехзначное число");
        } else if (numberConsole >= 100 && numberConsole < 1000 && numberConsole % 2 != 0) {
            System.out.println("нечетное трехзначное число");

            reader.close();
        }
    }
}
