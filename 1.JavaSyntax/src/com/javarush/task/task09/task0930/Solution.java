package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        List<Integer> integerList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                integerList.add(Integer.parseInt(array[i]));
            } else stringList.add(array[i]);
        }

        for (int i = integerList.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (integerList.get(j + 1) > integerList.get(j)) {
                    int temp = integerList.get(j);
                    integerList.set(j, integerList.get(j + 1));
                    integerList.set(j + 1, temp);
                }
            }
        }

        for (int i = stringList.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (isGreaterThan(stringList.get(j), stringList.get(j + 1))) {
                    String temp = stringList.get(j);
                    stringList.set(j, stringList.get(j + 1));
                    stringList.set(j + 1, temp);
                }
            }
        }
        int stringCounter = 0;
        int intCounter = 0;

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                array[i] = integerList.get(intCounter).toString();
                intCounter++;
            } else {
                array[i] = stringList.get(stringCounter);
                stringCounter++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
