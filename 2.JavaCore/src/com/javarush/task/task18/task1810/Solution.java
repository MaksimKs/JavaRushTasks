package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException {
        try {
            fileNameReader();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void fileNameReader() throws IOException, DownloadException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = bufferedReader.readLine();
            FileInputStream fileInputStream = new FileInputStream(fileName);
            if (fileInputStream.available() < 1000) {
                fileInputStream.close();
                bufferedReader.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {
    }
}

/*
    ---couldn't pass the validation with the code below---
    static void fileNameReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean b = true;
        while (true) {
            String fileName = bufferedReader.readLine();
            try {
                fileReader(fileName);
            } catch (DownloadException e) {
                e.printStackTrace();
                break;
            }
        }
        bufferedReader.close();
    }

    static void fileReader(String fileName) throws DownloadException {
        boolean b = true;
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);

            if (fileInputStream.available() < 1000) {
                fileInputStream.close();
                throw new DownloadException();
            }
        }
        catch (IOException e) {
            throw new DownloadException();
        }
    }

public static class DownloadException extends Exception {
}
}*/
