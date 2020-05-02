package com.javarush.task.task17.task1721;

import java.io.IOException;

public class CorruptedDataException extends IOException {
    private int errorCode;

    /*CorruptedDataException(String message) {
        this(0, message);
    }*/

    CorruptedDataException(int errCode, String message) {
        super(message);
        this.errorCode = errCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
