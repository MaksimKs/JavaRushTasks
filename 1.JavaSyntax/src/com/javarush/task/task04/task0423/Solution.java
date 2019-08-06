package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int ageFromConsole = Integer.parseInt(reader.readLine());

        verificationAge(name, ageFromConsole);
        reader.close();
    }

    static void verificationAge(String name, int age) {
        if (age > 20) {
            System.out.println("И 18-ти достаточно"); /*("18 is old enough");*/
        }
    }
}