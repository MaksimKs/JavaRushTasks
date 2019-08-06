package com.javarush.task.task08.task0801;

/* 
Set из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Set<String> foodSet = new HashSet<String>();
        foodSet.add("арбуз");
        foodSet.add("банан");
        foodSet.add("вишня");
        foodSet.add("груша");
        foodSet.add("дыня");
        foodSet.add("ежевика");
        foodSet.add("женьшень");
        foodSet.add("земляника");
        foodSet.add("ирис");
        foodSet.add("картофель");

        for (String foodEl:foodSet) {
            System.out.println(foodEl);
        }
    }
}
