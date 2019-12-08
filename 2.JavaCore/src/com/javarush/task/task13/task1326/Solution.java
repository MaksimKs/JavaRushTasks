package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        try {
            String path = new ConsoleReader().inputFileNameFromConsole();

            ReadFromFile readFromFile = new ReadFromFile();
            readFromFile.fileReader(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ExitException e) {
        }
    }

    static class ConsoleReader {
        String inputFileNameFromConsole() throws ExitException, IOException {
            BufferedReader inputFromConsole = new BufferedReader(new InputStreamReader(System.in));
            String consoleInput = inputFromConsole.readLine();
            if (consoleInput.equalsIgnoreCase("exit")) {
                inputFromConsole.close();
                throw new ExitException("Exit from program");
            } else if (consoleInput.isEmpty()) {
                throw new FileNotFoundException();
            }
            else return consoleInput;
        }
    }

    static class ReadFromFile {
        private ArrayList<Integer> list = new ArrayList<>();

        void fileReader(String inputFromConsole) throws IOException {
            InputStream fileInputStream = new FileInputStream(inputFromConsole);
            fileInputStream.close();
            BufferedReader reader = new BufferedReader(new FileReader(inputFromConsole));
            while (reader.ready()) {
                String stringFromFile = reader.readLine();
                if (stringFromFile.startsWith("\uFEFF")) {
                    stringFromFile = stringFromFile.substring(1);
                } if (!stringFromFile.isEmpty()) {
                    int digit = Integer.parseInt(stringFromFile);
                    if (digit % 2 == 0) {
                        list.add(digit);
                    }
                }
            }
            Collections.sort(list);
            for (Integer digit:list) {
                System.out.println(digit);
            }
            reader.close();
        }
    }
}