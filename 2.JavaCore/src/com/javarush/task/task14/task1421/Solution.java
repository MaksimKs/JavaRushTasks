package com.javarush.task.task14.task1421;

/* 
Singleton
*/
public class Solution {
    public static void main(String[] args) {

        Singleton sin = Singleton.getInstance();
        Singleton sin2 = Singleton.getInstance();

        System.out.println(sin);
        System.out.println(sin2);

    }
}
