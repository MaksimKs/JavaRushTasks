package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        inputReader();
        //System.out.println(allLines.toString());
        //System.out.println(forRemoveLines.toString());
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            System.out.printf("Error code: %d\nError message: %s", e.getErrorCode(), e.getMessage());
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException(3,"Task condition #3 hasn't performed");
        }
    }

    private static void inputReader() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFilePath = "";
        String secondFilePath = "";
        try {
            firstFilePath = reader.readLine();
            secondFilePath = reader.readLine();
            reader.close();
            if (firstFilePath.isEmpty()) {
                throw new NoSuchFileException("path to first file is empty");
            }
            if (secondFilePath.isEmpty()) {
                throw new NoSuchFileException("path to second file is empty");
            }
        } catch (NoSuchFileException e) {
            System.out.printf("File not found: %s", e.getMessage());
            return;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

            readerForFiles(allLines, firstFilePath);
            readerForFiles(forRemoveLines, secondFilePath);
    }

    private static void readerForFiles(List<String> list, String filePath) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(new File(filePath)));
            String line;
            while ((line = fileReader.readLine()) != null) {
                list.add(line);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.printf("File not found %s \n", filePath);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        /*try {
            list.addAll(Files.readAllLines(Paths.get(filePath), StandardCharsets.UTF_8));
        }
        catch (NoSuchFileException e) {
            System.out.printf("File not found %s \n", filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
