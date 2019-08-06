package com.javarush.task.task06.task0607;

/* 
Классовый счетчик
*/

public class Cat {
    static int catCount;

    public Cat () {
        catCount++;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Cat();
        }
        System.out.println(Cat.catCount);
    }
}
