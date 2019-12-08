package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private String firstName;
        private String secondName;
        private String nationality;
        private boolean gender;
        private boolean marriageStatus;

        public Human (int age, String firstName, String secondName,
                      String nationality, boolean gender, boolean marriageStatus) {
            this.age = age;
            this.firstName = firstName;
            this.secondName = secondName;
            this.nationality = nationality;
            this.gender = gender;
            this.marriageStatus = marriageStatus;
        }

        public Human (int age, String firstName, String secondName, boolean gender, boolean marriageStatus) {
            this.age = age;
            this.firstName = firstName;
            this.secondName = secondName;
            this.gender = gender;
            this.marriageStatus = marriageStatus;
        }

        public Human (int age, String firstName, String secondName, boolean gender){
            this.age = age;
            this.firstName = firstName;
            this.secondName = secondName;
            this.gender = gender;
        }

        public Human(int age, String firstName, String secondName, String nationality, boolean gender) {
            this.age = age;
            this.firstName = firstName;
            this.secondName = secondName;
            this.nationality = nationality;
            this.gender = gender;
        }

        public Human(boolean marriageStatus, int age, String firstName, String secondName) {
            this.marriageStatus = marriageStatus;
            this.age = age;
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public Human(int age, String firstName, String secondName) {
            this.age = age;
            this.firstName = firstName;
            this.secondName = secondName;
        }

        public Human (String firstName, String secondName, String nationality) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.nationality = nationality;
        }

        public Human(String firstName, String secondName, boolean gender, boolean marriageStatus) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.gender = gender;
            this.marriageStatus = marriageStatus;
        }

        public Human(String firstName, String secondName, boolean marriageStatus) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.marriageStatus = marriageStatus;
        }

        public Human(String firstName, String secondName) {
            this.firstName = firstName;
            this.secondName = secondName;
        }
    }
}
