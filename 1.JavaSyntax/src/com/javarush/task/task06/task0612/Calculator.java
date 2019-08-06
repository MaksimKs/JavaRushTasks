package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return (double) a / (double) b;
    }

    public static double percent(int a, int b) {
        return ((double)b / 100 * a);
    }

    public static void main(String[] args) {
        System.out.println(Calculator.plus(2,2));
        System.out.println(Calculator.minus(5,2));
        System.out.println(Calculator.multiply(3,3));
        System.out.println(Calculator.division(100,9));
        System.out.println(Calculator.percent(10,2));
    }
}