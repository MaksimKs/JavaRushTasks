package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

public class Solution {
    public static void main(String[] args) {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        int counter = 0;
        StackTraceElement [] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            counter++;
        }
        System.out.println(counter);
        return counter;
    }
}

