package com.javarush.task.task06.task0603;

/* 
По 50 000 объектов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        int counterCat = 0;
        int counterDog = 0;

        while (counterCat < 500_000 && counterDog < 500_000) {
                Cat cat = new Cat();
                //cat.finalize();

                Dog dog = new Dog();
                //dog.finalize();

            counterCat++;
            counterDog++;

        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
