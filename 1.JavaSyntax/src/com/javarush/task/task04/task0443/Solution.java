package com.javarush.task.task04.task0443;

/* 
Как назвали, так назвали
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String year = reader.readLine(); //Integer.parseInt(reader.readLine());
        String month = reader.readLine(); //Integer.parseInt(reader.readLine());
        String day = reader.readLine(); //Integer.parseInt(reader.readLine());

        System.out.println("Меня зовут " + name + ".");
        System.out.println("Я родился " + day + "." + month + "." + year);

        reader.close();
    }
}
