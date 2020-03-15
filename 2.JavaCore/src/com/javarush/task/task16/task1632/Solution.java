package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Infinite());
        threads.add(new InterruptCl());
        threads.add(new SleepingCl());
        threads.add(new MsgImpl());
        threads.add(new NumbersAndN());
    }

    public static void main(String[] args) {

    }

    public static class Infinite extends Thread {
        public void run () {
            while (true) {

                }
            }
        }

    public static class InterruptCl extends Thread {
        public void run() {
            try {
                Thread.currentThread().interrupt();
                sleep(100000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class SleepingCl extends Thread {
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    sleep(500);
                } catch (InterruptedException eS) {
                    eS.printStackTrace();
                }
            }
        }
    }

    public static class MsgImpl extends Thread implements Message {

        private volatile boolean isCancel = false;
        @Override
        public void showWarning() {
            this.isCancel = true;
        }

        public void run() {
            while (!isCancel) {

            }
        }

        /*@Override
        public void showWarning() {
            interrupt();
        }

        public void run() {
            while (!isInterrupted()) {
            }
        }*/
    }

    public static class NumbersAndN extends Thread {
        static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        private AtomicInteger sumOfNumbersFromConsole = new AtomicInteger(0);

        boolean isCancel = false;
        public void run() {
            while (!isCancel) {
                synchronized (this) {
                    try {
                        if (reader.ready()) {
                            int numberFromConsole;
                            String inputFromConsole = reader.readLine();
                            if (inputFromConsole.equals("N")) {
                                System.out.println(sumOfNumbersFromConsole);
                                return;
                            } else
                                try {
                                    numberFromConsole = Integer.parseInt(inputFromConsole);
                                    sumOfNumbersFromConsole.addAndGet(numberFromConsole);
                                } catch (NumberFormatException e) {
                                    System.out.println("Not a number from console");
                                }
                        }
                    } catch (IOException io) {
                        io.printStackTrace();
                    }
                }
            }
        }
    }
}