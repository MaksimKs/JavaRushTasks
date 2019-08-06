package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        if (string == null || string.trim().isEmpty()) {
            return;
        }

        StringBuilder stringBuilder = new StringBuilder();
        String[] str = string.trim().split("\\s+");

        for (String word : str) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            String upperWord = firstLetter + word.substring(1);

            stringBuilder.append(upperWord);
            stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString().trim());
    }
}
/*
* public static String capitalize(String str, char[] delimiters) {
276            int delimLen = (delimiters == null ? -1 : delimiters.length);
277            if (str == null || str.length() == 0 || delimLen == 0) {
278                return str;
279            }
280            int strLen = str.length();
281            StringBuffer buffer = new StringBuffer(strLen);
282            boolean capitalizeNext = true;
283            for (int i = 0; i < strLen; i++) {
284                char ch = str.charAt(i);
285
286                if (isDelimiter(ch, delimiters)) {
287                    buffer.append(ch);
288                    capitalizeNext = true;
289                } else if (capitalizeNext) {
290                    buffer.append(Character.toTitleCase(ch));
291                    capitalizeNext = false;
292                } else {
293                    buffer.append(ch);
294                }
295            }
296            return buffer.toString();
297        }*/