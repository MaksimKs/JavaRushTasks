package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {
    }

    private Solution(String name) {}

    protected Solution (int number) {}

    Solution(String name, int number) {}

    public Solution(int number, String name){}

}

