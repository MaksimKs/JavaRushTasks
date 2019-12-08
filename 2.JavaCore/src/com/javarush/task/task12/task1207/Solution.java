package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/

public class Solution {
    public static void main(String[] args) {
        print(1);
        print((Integer)3);
    }

    public static void print (Integer in) {
        System.out.println("Integer " + in);
    }

    public static void print (int i){
        System.out.println("int " + i);
    }
}
