package com.javarush.task.task15.task1529;

public class Plane implements CanFly {

    private int amountOfPassengers;

    public Plane(int amount) {
        this.amountOfPassengers = amount;
        fly();
    }

    @Override
    public void fly() {
        System.out.println("Plane can fly");
    }
}
