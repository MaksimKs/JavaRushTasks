package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
        String number = bufferedReader1.readLine();
        String name = bufferedReader1.readLine();
        System.out.println(name + " захватит мир через " + number
                + " лет. Му-ха-ха!");
        bufferedReader1.close();

    }
}
