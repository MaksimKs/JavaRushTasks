package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> tenList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tenList.add(Integer.parseInt(reader.readLine()));
        }
        int counter = 1;
        int temp= 1;
        for (int j = 0; j < tenList.size() - 1; j++) {
            if(tenList.get(j).equals(tenList.get(j+1))) {
                temp++;
            } else {
                temp = 1;
            }
            if (temp > counter) {
                counter = temp;
            }
        }
        System.out.println(counter);
        reader.close();

    }
}