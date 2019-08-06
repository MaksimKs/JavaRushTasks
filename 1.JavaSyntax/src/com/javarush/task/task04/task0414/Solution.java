package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTheYear = 0;
        int numberOfOrdinaryD = 365;
        int numberOfLeapD = 366;
        try {
            numberOfTheYear = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (numberOfTheYear % 4 == 0 && numberOfTheYear % 100 != 0) {
            System.out.println("количество дней в году: " + numberOfLeapD);
        } else if (numberOfTheYear % 400 == 0 && numberOfTheYear % 100 == 0) {
            System.out.println("количество дней в году: " + numberOfLeapD);
        } else if (numberOfTheYear % 100 == 0) {
            System.out.println("количество дней в году: " + numberOfOrdinaryD);
        } else {
            System.out.println("количество дней в году: " + numberOfOrdinaryD);
        }

        bufferedReader.close();
    }
}