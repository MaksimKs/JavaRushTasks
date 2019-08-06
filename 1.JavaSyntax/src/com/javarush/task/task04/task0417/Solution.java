package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int firstNumberFromConsole = Integer.parseInt(scanner.nextLine());
        int secondNumberFromConsole = Integer.parseInt(scanner.nextLine());
        int thirdNumberFromConsole = Integer.parseInt(scanner.nextLine());

        if (firstNumberFromConsole == secondNumberFromConsole &&
                firstNumberFromConsole == thirdNumberFromConsole) {
            System.out.println(firstNumberFromConsole + " " +
                    secondNumberFromConsole + " " + thirdNumberFromConsole);

        } else if (firstNumberFromConsole == secondNumberFromConsole) {
            System.out.println(firstNumberFromConsole + " " + secondNumberFromConsole);

        } else if (secondNumberFromConsole == thirdNumberFromConsole) {
            System.out.println(secondNumberFromConsole + " " + thirdNumberFromConsole);

        } else if (firstNumberFromConsole == thirdNumberFromConsole) {
            System.out.println(firstNumberFromConsole + " " + thirdNumberFromConsole);
        } else{}
    }
}