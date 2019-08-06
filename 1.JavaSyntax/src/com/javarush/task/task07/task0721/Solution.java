package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));



        int [] numArray = new int[20];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = Integer.parseInt(reader.readLine());
        }
        int maximum = numArray[0];
        int minimum = numArray[0];

        for (int j = 1; j < numArray.length; j++) {
            if (maximum < numArray[j]) {
                maximum = numArray[j];
            } else if (minimum > numArray[j]) {
                minimum = numArray[j];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
