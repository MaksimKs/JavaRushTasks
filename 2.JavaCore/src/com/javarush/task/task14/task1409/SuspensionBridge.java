package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge {

    private static final int CARS = 25;

    public int getCARS() {
        return CARS;
    }

    @Override
    public int getCarsCount() {
        return getCARS();
    }
}
