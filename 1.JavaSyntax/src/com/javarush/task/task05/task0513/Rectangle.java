package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize (int top, int left) {
        this.top = top;
        this.left = left;
    }

    public void initialize (int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        height = width;
    }

    public void initialize (Rectangle rectangle) {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "top=" + top +
                ", left=" + left +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle();
        Rectangle rec = new Rectangle();
        rec.top = 1; rec.left = 4; rec.height = 4; rec.width = 2;
        rectangleOne.initialize(rec);
        System.out.println(rectangleOne);
    }
}
