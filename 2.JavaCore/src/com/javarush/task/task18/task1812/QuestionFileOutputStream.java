package com.javarush.task.task18.task1812;

/* 
Расширяем AmigoOutputStream
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream amigoOutputStream;

    public QuestionFileOutputStream (AmigoOutputStream amigoOutputStream) {
        this.amigoOutputStream = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        amigoOutputStream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write (byte [] b) throws IOException {
        amigoOutputStream.write(b);
    }

    @Override
    public void write (byte [] b, int off, int length) throws IOException {
        amigoOutputStream.write(b, off, length);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputFromConsole = bufferedReader.readLine();
        if (inputFromConsole.equals("Д")) {
            amigoOutputStream.close();
        }
    }
}

