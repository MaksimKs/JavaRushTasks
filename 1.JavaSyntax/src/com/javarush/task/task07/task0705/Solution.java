package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] firstArr = new int[20];
        int [] secondArr = new int[10];
        int [] thirdArr = new int[10];

        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = Integer.parseInt(reader.readLine());
        }
        secondArr = Arrays.copyOfRange(firstArr,0,10);
        thirdArr = Arrays.copyOfRange(firstArr, 10,20);

/*        for (int secondA:
             secondArr) {
            System.out.println(secondA);
        }*/

        for (int i = 0; i < thirdArr.length; i++) {
            System.out.println(thirdArr[i]);
        }
        reader.close();
    }
}
