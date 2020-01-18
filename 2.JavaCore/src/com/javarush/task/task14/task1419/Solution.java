package com.javarush.task.task14.task1419;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Solution solution = null;
            solution.equals(0);
        } catch (NullPointerException nfe) {
            exceptions.add(nfe);
        }

        int [] array = {1,2,3};
        try {
            int fourIndex = array[4];
            System.out.println(fourIndex);
        } catch (ArrayIndexOutOfBoundsException ae) {
            exceptions.add(ae);
        }

        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream("D:/test.txt");
            fileInputStream.close();
        } catch (IOException ioe) {
            exceptions.add(ioe);
        }

        Iterator<Integer> listIterator = new ArrayList<Integer>().iterator();
        try {
            listIterator.remove();
        } catch (IllegalStateException ise) {
            exceptions.add(ise);
        }

        try {
            String str = "Hi";
            int numberFromStr = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            exceptions.add(nfe);
        }


        class Lang {}
        class EnglishLand extends Lang{}
        class ProgrammingLang extends Lang{}
        try {
            Lang lang = new Lang();
            lang = (EnglishLand) new EnglishLand();
            ProgrammingLang java  = (ProgrammingLang) lang;
        } catch (ClassCastException cce) {
            exceptions.add(cce);
        }
        try {
            new SimpleDateFormat("MM, dd, yyyy").parse("date");
        } catch (ParseException pe) {
            exceptions.add(pe);
        }

        String simpleString = "Hello";
        try {
            simpleString.charAt(8);
        } catch (IndexOutOfBoundsException iobE) {
            exceptions.add(iobE);
        }

        try{
            Thread.currentThread().sleep(-4000);
        } catch (IllegalArgumentException | InterruptedException ie) {
            exceptions.add(ie);
        }
    }
}
