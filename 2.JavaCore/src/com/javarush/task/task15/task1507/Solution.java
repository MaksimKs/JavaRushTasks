package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
        printMatrix("2", "3", "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix (String m, String n, String value) {
        System.out.println(m + n + value);
    }

    public static void printMatrix (int m, int n, int value) {
        int counter = 0;
        if (m < n) {
            counter++;
        }
        System.out.println(value = counter);
    }

    public static void printMatrix (Integer m, Integer n, String value) {
    }

    public static void printMatrix (String m, String n, Object value) {
        if (m.equals(n)) {
            value = m;
            System.out.println(value + " is equals m arg");
        }
    }

    public static void printMatrix (float m, float n, Double value){}

    public static void pirntMatrix (Object m, Object n, Object value) {}

    public static void printMatrix (int m, long n, float value) {}

    public static void printMatrix (double m, float n, String checker) {}

    public static void printMatrix (double m, float n, Object value) {}
}
