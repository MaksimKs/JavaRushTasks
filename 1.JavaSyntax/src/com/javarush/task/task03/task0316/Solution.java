package com.javarush.task.task03.task0316;

/* 
Экранирование символов
*/

public class Solution {
    public static void main(String[] args) {
        String pathW = "\"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        String pathJ = "\\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"";
        System.out.println("It's Windows path: " + pathW);
        System.out.println("It's Java string: " + pathJ);
    }
}
