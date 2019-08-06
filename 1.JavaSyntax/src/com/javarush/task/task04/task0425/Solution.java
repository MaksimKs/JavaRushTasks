package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumberOY = Integer.parseInt(reader.readLine());
        int secondNumberOX = Integer.parseInt(reader.readLine());

        if (firstNumberOY > 0 && secondNumberOX > 0) {
            System.out.println(1);
        } else if (firstNumberOY < 0 && secondNumberOX > 0) {
            System.out.println(2);
        } else if (firstNumberOY < 0 && secondNumberOX < 0) {
            System.out.println(3);
        } else if (firstNumberOY > 0 && secondNumberOX < 0) {
            System.out.println(4);
        }
    }
}