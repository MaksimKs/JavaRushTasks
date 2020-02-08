package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Файл в статическом блоке
*/

public class Solution {

    public static List<String> lines = new ArrayList<String>();

    static {
        File file = new File(Statics.FILE_NAME);
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

/*    static {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String stringFromFile;
            while ((stringFromFile = reader.readLine()) != null) {
                lines.add(stringFromFile);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
