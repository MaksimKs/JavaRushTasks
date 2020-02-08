package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URLFromConsole = "";

        try {
            URLFromConsole = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int signSeparator = URLFromConsole.indexOf("?");
        String URLWithSeparator = URLFromConsole.substring(signSeparator + 1);

        String[] paramArray = URLWithSeparator.split("&");
        List<String> list = new ArrayList<>();
        String valueOfObj = "";
        boolean thereIsObj = false;

        for (int i = 0; i < paramArray.length; i++) {
            if (paramArray[i].contains("=")) {
                list.add(paramArray[i].substring(0, paramArray[i].indexOf("=")));
            } else {
                list.add(paramArray[i]);
            }

            if (paramArray[i].contains("obj")) {
                thereIsObj = true;
                valueOfObj = paramArray[i].substring((paramArray[i].indexOf("=")) + 1);
            }
        }

        for (String ls : list) {
            System.out.print(ls + " ");
        }

        if (thereIsObj) {
            try {
                alert(Double.parseDouble(valueOfObj));
            } catch (NumberFormatException nfe) {
                alert(valueOfObj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
