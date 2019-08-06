package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int countPointsThisCat = 0;
        int countPointsAnotherCat = 0;
        if (this.age > anotherCat.age) {
            countPointsThisCat++;
        } else if (this.age < anotherCat.age) {
            countPointsAnotherCat++;
        }
        if (this.strength > anotherCat.strength) {
            countPointsThisCat++;
        } else if (this.strength < anotherCat.strength) {
            countPointsAnotherCat++;
        }
        if (this.weight > anotherCat.strength) {
            countPointsThisCat++;
        } else if (this.weight < anotherCat.weight) {
            countPointsAnotherCat++;
        }
        return countPointsThisCat > countPointsAnotherCat;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 4;
        cat1.weight = 3;
        cat1.strength = 4;

        Cat cat2 = new Cat();
        cat2.age = 3;
        cat2.weight = 3;
        cat2.strength = 4;

        System.out.println(cat1.fight(cat2));
    }
}
