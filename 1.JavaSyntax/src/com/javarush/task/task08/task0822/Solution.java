package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int minimumFromList = array.get(0);
        for (Integer numberFromArray : array) {
            if (minimumFromList > numberFromArray) {
                minimumFromList = numberFromArray;
            }
        }
        return minimumFromList;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberForCount = Integer.parseInt(reader.readLine());
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < numberForCount; i++) {
            integerList.add(Integer.parseInt(reader.readLine()));
        }
        return integerList;
    }
}
