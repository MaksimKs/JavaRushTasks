package com.javarush.task.task16.task1630;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    private static String firstFileName;
    private static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;

        String dataFromFile = "";
        StringBuffer stringBuffer = new StringBuffer(dataFromFile);


        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return stringBuffer.toString();
        }
            /*List<String> list = new ArrayList<>();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    list.add(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return list.toString();
        }*/



        public synchronized void run() {
            synchronized (this) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
                    String temp;
                    while ((temp = bufferedReader.readLine()) != null) {
                        stringBuffer.append(temp);
                        stringBuffer.append(" ");
                    }
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
