package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        Map<Integer, Integer> mapForBytes = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            /*Integer value = mapForBytes.get(data);
            if (value == null) mapForBytes.put(data, 1);
            else mapForBytes.put(data, value + 1);*/

            int count = mapForBytes.containsKey(data) ? mapForBytes.get(data) : 0;
            mapForBytes.put(data, count + 1);
        }

        int key = 0;
        int amountOfRepeat = 0;

        for (Map.Entry<Integer,Integer> entry : mapForBytes.entrySet()) {
            if (entry.getValue() > amountOfRepeat) {
                amountOfRepeat = entry.getValue();
                key = entry.getKey();
            }
        }
        for (Map.Entry<Integer,Integer> entry : mapForBytes.entrySet()) {
            if (entry.getValue().equals(amountOfRepeat)) {
                System.out.print(entry.getKey() + " ");
            }
        }

        /*mapForBytes.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed());

*/

        reader.close();
        fileInputStream.close();
    }
}
