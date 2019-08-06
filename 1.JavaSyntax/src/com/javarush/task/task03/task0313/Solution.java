package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        String firstWord = "Мама";
        String secondWord = "Мыла";
        String thirdWord = "Раму";
        System.out.println(firstWord+secondWord+thirdWord);
        System.out.println(firstWord+thirdWord+secondWord);
        System.out.println(secondWord+firstWord+thirdWord);
        System.out.println(secondWord+thirdWord+firstWord);
        System.out.println(thirdWord+firstWord+secondWord);
        System.out.println(thirdWord+secondWord+firstWord);

    }
}
