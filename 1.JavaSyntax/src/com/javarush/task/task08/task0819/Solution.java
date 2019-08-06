package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Iterator<Cat> iterCat = cats.iterator();
        if (!cats.isEmpty())
            cats.remove(iterCat.next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cat = new HashSet<Cat>();
        int counter = 0;
        while (counter < 3) {
            cat.add(new Cat());
            counter++;
        }
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat:cats) {
            System.out.println(cat);
        }
    }

    public static class Cat{
        //String name;
        public Cat() {
        }
        /*@Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }*/
    }
}
