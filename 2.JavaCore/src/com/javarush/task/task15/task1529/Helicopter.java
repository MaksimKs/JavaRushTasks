package com.javarush.task.task15.task1529;

public class Helicopter implements CanFly {

    public Helicopter() {
        fly();
    }

    @Override
    public void fly() {
        System.out.println("Helicopter can fly");
    }
}
