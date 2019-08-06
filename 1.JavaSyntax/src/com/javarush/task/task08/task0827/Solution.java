package com.javarush.task.task08.task0827;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        //String [] arrayStr = date.trim().split("\\s");
        Date dateIn = new Date(date);

        SimpleDateFormat dateFormat = new SimpleDateFormat("D", Locale.US);
        int dayFromStartOfYear = Integer.parseInt(dateFormat.format(dateIn));

        return dayFromStartOfYear % 2 != 0;

        /*SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date date1 = dateFormat.parse(date);*/
    }
}
