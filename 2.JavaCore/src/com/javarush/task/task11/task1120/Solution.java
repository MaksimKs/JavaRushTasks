package com.javarush.task.task11.task1120;

/* 
Пятая правильная «цепочка наследования»
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class House extends Asset{
        public House(String owner) {
            super(owner);
        }
    }

    public class Cat extends Animal{
    }

    public class Car extends Asset{
        public Car (String owner) {
            super(owner);
        }
    }

    public class Dog extends Animal{
    }

    public class Animal {
    }

    public class Asset {
        String owner;
        public Asset (String owner) {
            this.owner = owner;
        }
    }
}
