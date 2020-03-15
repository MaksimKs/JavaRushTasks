package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        t1.start();
        t1.join();
        t2.start();
        t2.join();

        t1.printResult();
        t2.printResult();

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class Read3Strings extends Thread {
        private List<String> list = new ArrayList<String>();
        AtomicInteger atomicInteger = new AtomicInteger(0);

        @Override
        public void run() {
            try {
                while (atomicInteger.get() != 3) {
                    synchronized (this) {
                            list.add(reader.readLine());
                            atomicInteger.incrementAndGet();
                    }
                }
            } catch(IOException e){
                e.printStackTrace();
            }
        }

        public void printResult () {
            list.forEach(element -> System.out.print(element + " "));
            System.out.println();
        }
    }
}
