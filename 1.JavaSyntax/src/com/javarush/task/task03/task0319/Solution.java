package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int number = Integer.parseInt(bufferedReader.readLine());
        int years = Integer.parseInt(bufferedReader.readLine());
        System.out.println(name + " получает " + number + " через " + years + " лет.");
    }
}