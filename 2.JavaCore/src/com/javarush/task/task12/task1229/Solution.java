package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Owner {
        public void workHard() {
            System.out.println("Owner of business work so hard");
        }
    }

    public static class CTO extends Owner implements Businessman {

    }
}
