package com.javarush.task.task18.task1805;

/* 
Сортировка байт
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws Exception {

        Set<Integer> setOfBytes = new TreeSet<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            setOfBytes.add(data);
        }

        for (Integer byteFromSet:setOfBytes) {
            System.out.print(byteFromSet + " ");
        }
        fileInputStream.close();
        reader.close();
    }
}
