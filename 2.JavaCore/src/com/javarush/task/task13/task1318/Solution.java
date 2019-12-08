package com.javarush.task.task13.task1318;

import java.io.*;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        boolean cycle  = true;
        while (cycle) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String consoleInput = reader.readLine();
                if (consoleInput.equalsIgnoreCase("exit")) {
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(consoleInput);
                StringBuilder stringBuilder = new StringBuilder();
                int data = 0;
                while ((data = fileInputStream.read()) != -1) {
                    stringBuilder.append((char) data);
                    //System.out.print((char)data);
                }
                System.out.println(stringBuilder.toString());
                fileInputStream.close();
                reader.close();
                cycle = false;
            } catch (IOException e) {
                System.out.println("File not found");
            }
        }
    }
}