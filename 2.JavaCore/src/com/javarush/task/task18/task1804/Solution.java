package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
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
            int count = mapForBytes.containsKey(data) ? mapForBytes.get(data) : 0;
            mapForBytes.put(data, count + 1);
        }
        fileInputStream.close();
        reader.close();

        Integer minAmountOfBytes = Collections.min(mapForBytes.values());
        //System.out.println(minAmountOfBytes);

        for (Map.Entry<Integer, Integer> entry : mapForBytes.entrySet()) {
            if (entry.getValue().equals(minAmountOfBytes)) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
