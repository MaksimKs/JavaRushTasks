package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> listString = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            listString.add(reader.readLine());
        }

        listString.remove(2);
        for (int j = listString.size() - 1; j >= 0; j--) {
            System.out.println(listString.get(j));
        }
    }
}
