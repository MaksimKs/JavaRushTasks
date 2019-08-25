package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
*/

public class Solution {

    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static void main(String[] args) {
        printIdea(new Idea());
    }

    public static class Idea {
        String description = "try";

        public String getDescription() {
            return description;
        }
    }
}