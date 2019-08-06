package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("White", dateFormat.parse("MAY 1 2012"));
        map.put("Robinson",dateFormat.parse("APRIL 3 2000"));
        map.put("Johnson",dateFormat.parse("JUNE 5 2010"));
        map.put("Brown",dateFormat.parse("SEPTEMBER 14 2008"));
        map.put("Chin",dateFormat.parse("JANUARY 2 2001"));
        map.put("Si",dateFormat.parse("JULY 28 1999"));
        map.put("James",dateFormat.parse("NOVEMBER 10 2003"));
        map.put("Antony",dateFormat.parse("AUGUST 21 2005"));
        map.put("Tin",dateFormat.parse("MARCH 7 2002"));
        map.put("Leonard",dateFormat.parse("OCTOBER 10 1994"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        for (Iterator<Map.Entry<String,Date>> iterator = map.entrySet().iterator(); iterator.hasNext();){
            Map.Entry<String,Date> pair = iterator.next();
            /*Date date = pair.getValue();
            String month = dateFormat.format(date);
            month = month.toUpperCase();*/
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
