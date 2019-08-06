package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {

        int counterCatObj = 0;
        while (counterCatObj < 10) {
            cats.add(new Cat());
            counterCatObj++;
        }
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
        /*for (Cat cat : cats) {
            System.out.println(cat);
        }*/
    }
}
