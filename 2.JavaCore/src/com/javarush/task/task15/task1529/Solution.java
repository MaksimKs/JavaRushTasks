package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFromConsole = "";
        try {
            inputFromConsole = reader.readLine();
            if (inputFromConsole.equalsIgnoreCase("helicopter")){
                result = new Helicopter();
            } else if (inputFromConsole.equalsIgnoreCase("plane")) {
                int amount = Integer.parseInt(reader.readLine());
                result = new Plane(amount);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
