package com.javarush.task.task11.task1110;

/* 
Не забываем инкапсулировать
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        private String name;
        private int age;
        private int weight;
        private int speed;

        public Cat(String name, int age, int weight, int speed) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.speed = speed;
        }

        public String getName() {
            return null;
        }

        public int getAge() {
            return 0;
        }

        public int getWeight() {
            return 0;
        }

        public int getSpeed() {
            return 0;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
