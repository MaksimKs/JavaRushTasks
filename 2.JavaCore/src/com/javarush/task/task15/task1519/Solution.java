package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String consoleInput = consoleReader.readLine();
            if (consoleInput.equalsIgnoreCase("exit")) {
                break;
            }
            else if (consoleInput.matches("-?[0-9]+\\.[0-9]+")) {
                double doubleNumber = Double.parseDouble(consoleInput);
                print(doubleNumber);
            } else if (consoleInput.matches("-?[0-9]+")) {
                int intNumber = Integer.parseInt(consoleInput);
                if (intNumber > 0 && intNumber < 128) {
                    print((short) intNumber);
                } else if (intNumber <= 0 || intNumber >= 128) {
                    print(intNumber);
                }
            /*} else if (consoleInput.matches("-?[0-9]")) {
                int integer = Integer.parseInt(consoleInput);
                if (integer <= 0 || integer >= 128 ) {
                    print(integer);
                }*/
            } else print(consoleInput);
        }
        consoleReader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
