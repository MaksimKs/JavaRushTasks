package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String> cityAndFamily = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            cityAndFamily.put(city,family);
        }

        String cityCheck = reader.readLine();
        for (Iterator<Map.Entry<String,String>> iterator = cityAndFamily.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String,String> pair = iterator.next();
            if (cityCheck.equalsIgnoreCase(pair.getKey())) {
                System.out.println(pair.getValue());
            }
        }
        reader.close();
        //cityAndFamily.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
