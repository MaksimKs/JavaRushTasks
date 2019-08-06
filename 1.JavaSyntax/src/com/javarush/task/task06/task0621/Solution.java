package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandOne = reader.readLine();
        Cat catGrandOne = new Cat(grandOne);

        String grandTwo = reader.readLine();
        Cat catGrandTwo = new Cat(grandTwo);

        String parentOne = reader.readLine();
        Cat catParentOne = new Cat(parentOne, catGrandOne, null);

        String parentTwo = reader.readLine();
        Cat catParentTwo = new Cat(parentTwo, null, catGrandTwo);

        String son = reader.readLine();
        Cat catSon = new Cat(son, catParentOne, catParentTwo);

        String daughter = reader.readLine();
        Cat catDaughter = new Cat(daughter, catParentOne, catParentTwo);

        System.out.println(catGrandOne);
        System.out.println(catGrandTwo);
        System.out.println(catParentOne);
        System.out.println(catParentTwo);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public Solution() {
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parent2;

        Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat parent, Cat parent2) {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;
        }

        @Override
        public String toString() {
            if (parent == null && parent2 == null) {
                return "The cat's name is " + name + ", no mother, no father";
            } else if (parent2 == null) {
                return "The cat's name is " + name + ", no mother, father is " + parent.name;
            } else if (parent == null)
                return "The cat's name is " + name + ", mother is " + parent2.name +
            ", no father";
            else return "The cat's name is " + name + ", mother is " + parent2.name +
                        ", father is " + parent.name;
        }
    }
}
