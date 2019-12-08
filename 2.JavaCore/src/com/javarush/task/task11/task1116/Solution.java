package com.javarush.task.task11.task1116;

/* 
Цепочка наследования
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Pet {
        String name;
        public Pet (String name) {
            this.name = name;
        }
    }

    public class Cat extends Pet {
        public Cat (String name) {
            super(name);
        }
    }

    public class Dog extends Pet {
        public Dog(String name) {
            super(name);
        }
    }
}
