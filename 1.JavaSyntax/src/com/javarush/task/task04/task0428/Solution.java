package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());

        //System.out.println(firstNumber + ", " + secondNumber + ", " + thirdNumber);

        System.out.println(countNumbers(firstNumber, secondNumber, thirdNumber));

        reader.close();
    }

    static int countNumbers(int firstN, int secondN, int thirdN) {
        int counter = 0;
        if (firstN > 0) {
            counter++;
        }
        if (secondN > 0) {
            counter++;
        }
        if (thirdN > 0) {
            counter++;
        }
        return counter;
    }
}
