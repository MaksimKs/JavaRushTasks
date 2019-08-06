package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat dotCat = new Cat("Dot", "black", 2);
        Dog runnerDog = new Dog ("Runner", "retriever", 3);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        String color;
        int age;

        public Cat (String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }
    }

    public static class Dog {
        String name;
        String species;
        int age;

        public Dog (String name, String species, int age) {
            this.name = name;
            this.species = species;
            this.age = age;
        }
    }
}
