package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("лера");
        //strings.add("мера");
        strings.add("лоза");
        strings.add("лира");
        //strings.add("вода");
        //strings.add("упор");
        strings.add("года");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        ArrayList<String> newStrings = new ArrayList<>(strings);

        for (int i = 0; i < newStrings.size(); i++) {
            if (newStrings.get(i).contains("л") && newStrings.get(i).contains("р")) {continue;}
            else  if (newStrings.get(i).contains("л")) {
                newStrings.add(0,newStrings.get(i));
                i++;
            } else if (newStrings.get(i).contains("р")) {
                newStrings.remove(i);
                i--;
            }
        }
        return newStrings;
    }
}