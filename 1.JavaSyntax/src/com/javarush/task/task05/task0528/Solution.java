package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Solution {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        String formatDate = localDate.format(DateTimeFormatter.ofPattern("dd MM yyyy"));
        System.out.println(formatDate);

    }
}
