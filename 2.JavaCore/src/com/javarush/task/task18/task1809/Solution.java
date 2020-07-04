package com.javarush.task.task18.task1809;


import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            readFiles();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readFiles() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(firstFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(secondFileName);
        byte[] buffer = new byte[inputStream.available()];

        byte [] reverseOrder = new byte[buffer.length];
        while (inputStream.available() > 0) {
            int data = inputStream.read(buffer);

            int tempIndex = 0;
            for (int i = buffer.length - 1; i >= 0; i--) {
            reverseOrder[tempIndex++] = buffer[i];
        }
            fileOutputStream.write(reverseOrder, 0, data);
        }
        fileOutputStream.close();
        inputStream.close();
        reader.close();
    }
}