package com.javarush.task.task14.task1409;

public class WaterBridge  implements Bridge {

    private static final int CARS = 50;

    public int getCars() {
        return CARS;
    }

    @Override
    public int getCarsCount(){
        return getCars();
    }
}
