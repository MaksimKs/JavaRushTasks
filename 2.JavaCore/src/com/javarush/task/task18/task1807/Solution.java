package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    static String fileNameFromConsole = "";

    public static void main(String[] args) {
        try {
            long amountOfCommasInFile = fileRead();
            System.out.println(amountOfCommasInFile);
        } catch (FileNotFoundException e) {
        System.out.println("File with name \"" + fileNameFromConsole + "\" not found");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static long fileRead () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long commaCount;
        fileNameFromConsole = reader.readLine();

            FileInputStream fileInputStream = new FileInputStream(fileNameFromConsole);
            commaCount = 0;
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                if (data == 44) {
                    commaCount++;
                }
            }
            fileInputStream.close();
            reader.close();
        return commaCount;
    }
}