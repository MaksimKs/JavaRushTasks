package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());

        if (firstNumber == secondNumber && firstNumber == thirdNumber ) {
            System.out.println(firstNumber);
        } else if (firstNumber == secondNumber || firstNumber == thirdNumber) {
            System.out.println(firstNumber);
        } else if (firstNumber > secondNumber && firstNumber < thirdNumber ||
                firstNumber < secondNumber && firstNumber > thirdNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber > firstNumber && secondNumber < thirdNumber ||
                secondNumber < firstNumber && secondNumber > thirdNumber) {
            System.out.println(secondNumber);
        } else System.out.println(thirdNumber);

        reader.close();
    }
}