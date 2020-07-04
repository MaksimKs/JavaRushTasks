package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            filesReader();
        } catch (IncorrectFileNameException e) {
            System.out.println("Exception occurred: " + e);
        }
    }

    static void filesReader() throws IncorrectFileNameException {
        BufferedReader fileReader;
        FileInputStream inputStream;
        try {
            fileReader = new BufferedReader(new InputStreamReader(System.in));
            String firstFileName = fileReader.readLine();
            String secondFileName = fileReader.readLine();
            String thirdFileName = fileReader.readLine();

            inputStream = new FileInputStream(firstFileName);

            fileWriter(inputStream, secondFileName,thirdFileName);
            fileReader.close();
            inputStream.close();
        } catch (FileNotFoundException e) {
            throw new IncorrectFileNameException("Incorrect file name");
            }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    static void fileWriter (FileInputStream inputStream, String secondFileName, String thirdFileName)
            throws IncorrectFileNameException{
        try {
            FileOutputStream outputStreamForSecondFile = new FileOutputStream(secondFileName);
            FileOutputStream outputStreamForThirdFile = new FileOutputStream(thirdFileName);

            byte[] buffer = new byte[inputStream.available()];
            while (inputStream.available() > 0) {
                int count = inputStream.read(buffer);

                if (buffer.length % 2 != 0) {
                    outputStreamForSecondFile.write(buffer, 0, buffer.length / 2 + 1);
                    outputStreamForThirdFile.write(buffer, buffer.length / 2 + 1, count / 2);
                }
                if (buffer.length % 2 == 0) {
                    outputStreamForSecondFile.write(buffer, 0, count / 2);
                    outputStreamForThirdFile.write(buffer, buffer.length / 2,  count / 2);
                }
            }
            outputStreamForSecondFile.close();
            outputStreamForThirdFile.close();
        } catch (FileNotFoundException fe) {
            throw new IncorrectFileNameException("Incorrect file name ");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
