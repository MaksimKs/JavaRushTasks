package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] arrInt = new int[10];
            for (int i = 0; i < arrInt.length; i++) {
                try {
                    arrInt[i] = Integer.parseInt(reader.readLine());
                } catch (NumberFormatException e) {
                    System.out.println("not a number");
                }
            }
            for (int j = arrInt.length - 1; j >= 0; j--) {
                System.out.println(arrInt[j]);
            }
            reader.close();
        }
    }