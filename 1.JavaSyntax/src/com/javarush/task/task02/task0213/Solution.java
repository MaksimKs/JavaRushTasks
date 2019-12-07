package com.javarush.task.task02.task0213;

/*
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        Cat Tom = new Cat();
        Dog Flash = new Dog();
        Fish Silver = new Fish();
        Woman Sara = new Woman();
        Tom.owner = Sara;
        Flash.owner = Sara;
        Silver.owner = Sara;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
