package com.javarush.task.task18.task1802;

/* 
Минимальный байт
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int minByteInFile = fileReader();
        if (minByteInFile == 2147483647) {
            System.out.println("Error occurred");
        } else  System.out.println(minByteInFile);

    }

    static int fileReader() {
        int minByteInInputFile = 255;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            FileInputStream fileInputStream;
            try {
                fileInputStream = new FileInputStream(fileName);
            } catch (FileNotFoundException e) {
                System.out.printf("File with name \"%s\" not found. ", fileName);
                return 2147483647;
            }
                while (fileInputStream.available() > 0) {
                    int data = fileInputStream.read();
                    if (data < minByteInInputFile) {
                        minByteInInputFile = data;
                    }
                }
                reader.close();
                fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return minByteInInputFile;
    }
}
