package com.javarush.task.task11.task1102;

/* 
Домашние животные
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Pet {
        String name;
        String species;
        int age;

        public Pet(String name, String species, int age) {
            this.name = name;
            this.species = species;
            this.age = age;
        }
    }

    public class Cat extends Pet{
        public Cat (String name, String species, int age) {
            super(name,species, age);
        }
    }

    public class Dog extends Pet{
        public Dog (String name, String species, int age) {
            super(name, species, age);
        }
    }
}
