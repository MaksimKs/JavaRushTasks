package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        Solution.readData();
    }

    private static void readData() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Long> longArrayList = new ArrayList<>();
        while (true) {
            try {
                long numberFromConsole = Long.parseLong(bufferedReader.readLine());
                longArrayList.add(numberFromConsole);
            } catch (NumberFormatException e) {
                printNumbersFromConsole(longArrayList);
                return;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static void printNumbersFromConsole (ArrayList<Long> number) {
        for (Long list : number) {
            System.out.println(list);
        }
    }
}
