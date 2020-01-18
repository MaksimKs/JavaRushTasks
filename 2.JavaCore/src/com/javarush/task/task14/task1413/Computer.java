package com.javarush.task.task14.task1413;

public class Computer {
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    Monitor getMonitor() {
        return this.monitor;
    }

    Keyboard getKeyboard() {
        return this.keyboard;
    }

    Mouse getMouse() {
        return this.mouse;
    }


}
