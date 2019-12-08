package com.javarush.task.task13.task1326;

class ExitException extends Exception {
    public ExitException (String message) {
        super(message);
        System.out.println(message);
    }
}
