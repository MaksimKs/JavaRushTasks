package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First line");
        list.add("Second line");
        list.add("Third line");
        list.add("Forth line");
        list.add("Fifth line");

        System.out.println(list.size());

        for (String listString:
             list) {
            System.out.println(listString);
        }
    }
}
