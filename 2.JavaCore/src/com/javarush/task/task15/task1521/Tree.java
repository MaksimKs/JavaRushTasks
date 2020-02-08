package com.javarush.task.task15.task1521;

public class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.println(String.format(
                "Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName()));
    }

    public void info(Number a) {
        System.out.println(String.format(
                "Дерево № %d , метод Number, параметр %s", number, a.getClass().getSimpleName()));
    }

    public void info(String s) {
        System.out.println(String.format(
                "Дерево № %s , метод String, параметр %s", number, s.getClass().getSimpleName()));
    }
}