package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberFromConsole = Integer.parseInt(reader.readLine());

        if (numberFromConsole == 0) {
            System.out.println(numberFromConsole);
        }
        if (numberFromConsole > 0) {
            System.out.println(numberFromConsole *= 2);
        }
        if (numberFromConsole < 0) {
            System.out.println(numberFromConsole += 1);
        }
        reader.close();
    }
}