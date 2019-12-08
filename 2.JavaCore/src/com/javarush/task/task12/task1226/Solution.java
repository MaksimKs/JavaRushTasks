package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {
    public interface CanFly {
        void fly();
    }
    public interface CanClimb {
        void climb();
    }
    public interface CanRun {
        void run();
    }

    public static void main(String[] args) {

    }

    public class Cat implements CanClimb,CanRun {
        public void climb() {
            System.out.println("I'm cat, so I can climb on the trees");
        }
        public void run() {
            System.out.println("Also I can run");
        }
    }

    public class Dog implements CanRun {
        public void run() {
            System.out.println("I'm dog, so I can run fast");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanFly, CanRun {
        public void fly() {
        }
        public void run() {
        }
    }
}
