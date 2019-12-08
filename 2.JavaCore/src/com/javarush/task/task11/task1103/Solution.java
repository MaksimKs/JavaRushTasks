package com.javarush.task.task11.task1103;

/* 
Межпланетная ферма
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Animal {
        int age;
        Animal (int age) {
            this.age = age;
        }
    }

    public class Cow extends Animal{
        Cow (int age) {
            super(age);
        }
    }

    public class Pig extends Animal{
        Pig (int age) {
            super(age);
        }
    }

    public class Sheep extends Animal{
        Sheep (int age) {
            super(age);
        }
    }

    public class Bull extends Animal{
        Bull (int age) {
            super(age);
        }
    }

    public class Goat extends Animal{
        Goat (int age) {
            super(age);
        }
    }
}