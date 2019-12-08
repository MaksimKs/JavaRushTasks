package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove,CanEat {
        public void move() {
            System.out.println("I'am a dog, so I can move.");
        }
        public void eat() {
            System.out.println("I like to eat, like all animals.");
        }
    }

    public class Duck implements CanFly, CanMove, CanEat {
        public void fly(){
            System.out.println("I believe, I can fly");
        }
        public void move(){
        }
        public void eat(){
        }
    }

    public class Car implements CanMove {
        public void move() {
        }
    }

    public class Airplane implements CanMove,CanFly {
        public void move(){
        }
        public void fly(){
        }
    }
}
