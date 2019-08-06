package com.javarush.task.task03.task0322;

/* 
Большая и чистая
*/

import java.io.*;
import java.util.*;

public class Solution {
        static String name1;
        static String name2;
        static String name3;

        public static void main (String[]args) throws Exception {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            name1 = bufferedReader.readLine();
            name2 = bufferedReader.readLine();
            name3 = bufferedReader.readLine();

            System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
        }
    }