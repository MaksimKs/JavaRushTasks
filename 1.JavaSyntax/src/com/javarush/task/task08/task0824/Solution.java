package com.javarush.task.task08.task0824;

import java.util.*;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children = new ArrayList<>();
        children.add(new Human("Antony", true, 5,new ArrayList<Human>()));
        children.add(new Human("Jecy", false, 3, new ArrayList<Human>()));
        children.add(new Human("Andy", true, 3, new ArrayList<Human>()));

        ArrayList<Human> parentD = new ArrayList<>();
        Human father = new Human("Den", true, 35,children);
        parentD.add(father);

        ArrayList<Human> parentM = new ArrayList<>();
        Human mother = new Human("Olga",false,34,children);
        parentM.add(mother);

        Human grandFatherOne = new Human("Bob",true,70, parentD);
        Human grandMotherOne = new Human("Kate",false,69, parentD);
        Human grandFatherTwo = new Human("Peter", true, 72, parentM);
        Human grandMotherTwo = new Human("Jen", false, 72, parentM);

        for (int i = 0; i < children.size(); i++) {
            System.out.println(children.get(i));
        }

        System.out.println(father);
        System.out.println(mother);

        System.out.println(grandFatherOne);
        System.out.println(grandMotherOne);
        System.out.println(grandFatherTwo);
        System.out.println(grandFatherTwo);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human() {
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
