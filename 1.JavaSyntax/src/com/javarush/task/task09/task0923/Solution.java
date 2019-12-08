package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String stringFromConsole = bufferedReader.readLine().trim().replaceAll("\\s+","");

        ArrayList <Character> vowelList = new ArrayList<>();
        ArrayList <Character> consonantList = new ArrayList<>();

        for (int i = 0; i < stringFromConsole.length(); i++) {
            char letter = stringFromConsole.charAt(i);
            if (isVowel(letter)) {
                vowelList.add(letter);
            } else consonantList.add(letter);
        }

        for (Character vowelChar:vowelList) {
            System.out.print(vowelChar + " ");
        }
        System.out.println();

        for (Character consonantChar:consonantList) {
            System.out.print(consonantChar + " ");
        }
        bufferedReader.close();
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        for (char d : vowels) {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}