package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int firstSide = Integer.parseInt(bufferedReader.readLine());
        int secondSide = Integer.parseInt(bufferedReader.readLine());
        int thirdSide = Integer.parseInt(bufferedReader.readLine());

        if (firstSide+secondSide > thirdSide && secondSide+thirdSide > firstSide &&
                thirdSide+firstSide > secondSide) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}