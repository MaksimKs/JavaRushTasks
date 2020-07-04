package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int maxByteInFile = fileReader();
        System.out.println(maxByteInFile);
    }

    static int fileReader() {
        int maxByteInInputFile = 0;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            FileInputStream fileInputStream;
            try {
                fileInputStream = new FileInputStream(fileName);
            } catch (FileNotFoundException e) {
                System.out.printf("File with name \"%s\" not found. ", fileName);
                return -1;
            }
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                if (data > maxByteInInputFile) {
                    maxByteInInputFile = data;
                }
            }
            reader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maxByteInInputFile;
    }
}
