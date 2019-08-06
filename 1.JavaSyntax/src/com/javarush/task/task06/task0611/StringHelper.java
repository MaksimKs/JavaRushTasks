package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        int counter = 0;
        while (counter < 5) {
            result += s;
            counter++;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        int counterForInt = 0;
        while (counterForInt < count) {
            result += s;
            counterForInt++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(StringHelper.multiply("gogo", 5));
        System.out.println(StringHelper.multiply(" go study"));
    }
}
