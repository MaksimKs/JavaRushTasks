package com.javarush.task.task11.task1111;

/* 
«Из ребра его»
*/

public class Solution {
    public static void main(String[] args) {
    }

    //Адам
    public class Adam {
        String name;
        int age;

        public Adam (String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    //Ева
    public class Eve extends Adam{
        public Eve (String name, int age) {
            super(name, age);
        }
    }
}
