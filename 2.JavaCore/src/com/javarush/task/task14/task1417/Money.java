package com.javarush.task.task14.task1417;

import java.text.DecimalFormat;

public abstract class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        return Double.valueOf(decimalFormat.format(amount));
    }

    public abstract String getCurrencyName();
}

