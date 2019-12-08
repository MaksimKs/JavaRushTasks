package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter
                    ("D:\\" + reader.readLine() + ".txt", true));
            boolean recorder = true;
            while (recorder) {
                String inputFromConsole = reader.readLine();
                bufferedWriter.write(inputFromConsole + "\n");
                if (inputFromConsole.equalsIgnoreCase("exit")) {
                    recorder = false;
                }
            }
            bufferedWriter.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Invalid file name");
        }
    }
}
