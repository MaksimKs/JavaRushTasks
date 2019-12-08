package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String> firstList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            firstList.add(String.valueOf(i));
        }
        ArrayList<String>[] strings = new ArrayList[4];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = firstList;
        }
        return  strings;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}