package com.javarush.task.task04.task0411;

/*
Времена года на Терре
*/
public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if (month >= 1 && month <= 2 || month == 12) {
            System.out.println("зима");
        } else if
        (month >= 3 && month <= 5) {
            System.out.println("весна");
        } else if
        (month >= 6 && month <= 8) {
            System.out.println("лето");
        } else if
        (month >= 9 && month <= 11) {
            System.out.println("осень");
        } else
            System.out.println("Введите корректный месяц");
    }
}

/*        switch (month) {
            case 12: case 1: case 2:
                System.out.println("winter");
                break;
            case 3: case 4: case 5:
                System.out.println("spring");
                break;
            case 6: case 7: case 8:
                System.out.println("summer");
                break;
            case 9: case 10: case 11:
                System.out.println("autumn");
                break;
            default:
                System.out.println("Enter correct number please.");
        }
    }
}*/

