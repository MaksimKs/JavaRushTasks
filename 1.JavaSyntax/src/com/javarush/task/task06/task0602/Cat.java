package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        try {
        cat.finalize();

        Dog dog = new Dog();
            dog.finalize();

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}
