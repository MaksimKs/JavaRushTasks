package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int compareAbleNumber = 10;

        int compareA = Math.abs(compareAbleNumber - a);
        int compareB = Math.abs(compareAbleNumber - b);


        if (compareA > compareB) {
            abs(b);
            System.out.println(b/* + " closest to " + compareAbleNumber*/);
        } else if (compareA < compareB) {
            abs(a);
            System.out.println(a/* + " closest to " + compareAbleNumber*/);
        } else
            System.out.println(abs(a)/* + ", both numbers are closest to " + compareAbleNumber*/);
    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}