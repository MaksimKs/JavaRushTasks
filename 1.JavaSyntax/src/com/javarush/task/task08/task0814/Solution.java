package com.javarush.task.task08.task0814;

import java.util.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> intSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            intSet.add(i);
        }
        return intSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        //Set<Integer> copySet = new HashSet<>(set);
        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext(); ) {
            if (iterator.next() > 10) {
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
        //Set<Integer> set1 = removeAllNumbersGreaterThan10(createSet());
        //set1.forEach(System.out::print);

    }
}
