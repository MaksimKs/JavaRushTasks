package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final String OLD_FORMAT = "yyyy-MM-dd";
        final String NEW_FORMAT = "MMM dd, yyyy";

        String oldDate = bufferedReader.readLine();
        String newDate;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(OLD_FORMAT);
        Date date = simpleDateFormat.parse(oldDate);
        simpleDateFormat.applyPattern(NEW_FORMAT);
        newDate = simpleDateFormat.format(date).toUpperCase();

        System.out.println(newDate);
    }
}