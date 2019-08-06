package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long counter = 0;
        while (true) {
            String numberFromConsole = reader.readLine();
            if (numberFromConsole.equals("сумма")){ /*sum*/
                break;
            }
            try {
                int numberConsole = Integer.parseInt(numberFromConsole);
                counter += numberConsole;
            } catch (NumberFormatException e) {
                System.out.println("Not a number");
            }
        }
            System.out.println(counter);
            reader.close();
    }
}
