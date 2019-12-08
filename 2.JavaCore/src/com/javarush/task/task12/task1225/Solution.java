package com.javarush.task.task12.task1225;

/* 
Посетители
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
            return ((Animal)o).getSpecies();
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
        @Override
        public String getSpecies(){
            return "Кот";
        }
    }

    public static class Tiger extends Cat {
        @Override
        public String getSpecies() {
            return "Тигр";
        }
    }

    public static class Lion extends Cat {
        @Override
        public String getSpecies() {
            return "Лев";
        }
    }

    public static class Bull extends Animal {
        @Override
        public String getSpecies() {
            return "Бык";
        }
    }

    public static class Cow extends Animal {
        @Override
        public String getSpecies() {
            return "Корова";
        }
    }

    public static class Animal {

        public String getSpecies(){
            return "Животное";
        }
    }
}
