package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] intArr = new int[15];
        int evenHouseResidents = 0;
        int oddHouseResidents = 0;

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] =Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                evenHouseResidents += intArr[i];
            } else oddHouseResidents += intArr[i];
        }
        if (evenHouseResidents > oddHouseResidents) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
