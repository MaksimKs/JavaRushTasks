package com.javarush.task.task17.task1712;

public class Dishes {
    private volatile byte tableNumber;

    public Dishes(byte tableNumber) {
        this.tableNumber = tableNumber;
    }

    public byte getTableNumber() {
        return tableNumber;
    }
}
