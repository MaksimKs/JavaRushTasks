package com.javarush.task.task05.task0510;

/*
Кошкоинициация
*/

public class Cat {
    private String name;
    private int age = 2;
    private int weight = 3;
    private String address;
    private String color = "grey";

    public void initialize(String name) {
        this.name = name;
    }
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void initialize(int weight, String color){
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

/*    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", address='" + address + '\'' +
                ", color='" + color + '\'' +
                '}';
    }*/

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.initialize(4, "black");
        System.out.println(cat);

    }
}
