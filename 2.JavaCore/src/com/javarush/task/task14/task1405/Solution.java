package com.javarush.task.task14.task1405;

/* 
Food
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();
        Food newFood = (Food) selectable;

        foodMethods(food);
        selectableMethods(selectable);
        foodMethods(newFood);
    }

    public static void foodMethods(Food food) {
        food.onSelect();
        food.onEat();
        food.veganFood();
    }

    public static void selectableMethods(Selectable selectable) {
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onSelect() {
            System.out.println("The food was selected");
        }
        public void onEat() {
            System.out.println("The food was eaten");
        }
        public void veganFood() {
            System.out.println("I would like vegan food, please");
        }
    }
}
