package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man manOne= new Man("Bob", 18, "New road str");
        Man manTwo= new Man("Alex", 21, "Wall str");
        System.out.println(manOne);
        System.out.println(manTwo);

        Woman womanOne = new Woman("Sara", 30, "Yellow str");
        Woman womanTwo = new Woman("Emma", 19, "Pink str");
        System.out.println(womanOne);
        System.out.println(womanTwo);
    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

        public static class Woman {
            private String name;
            private int age;
            private String address;

        public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

            @Override
            public String toString() {
                return name + " " + age + " " + address;
            }
        }
}
