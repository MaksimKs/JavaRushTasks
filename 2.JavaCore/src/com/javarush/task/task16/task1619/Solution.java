package com.javarush.task.task16.task1619;

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        TestThread.Cancel();
    }

    public static class TestThread implements Runnable {
        private static boolean isCancel = false;

        public static void Cancel () {
            isCancel = true;
        }
        public void run() {
            while (!isCancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
