package com.javarush.task.task13.task1324;

import java.awt.*;

/* 
Один метод в классе
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color DEFAULT_COLOR = Color.ORANGE;
        Integer DEFAULT_AGE = 4;

        default Color getColor() {
            return DEFAULT_COLOR;
        }

        default Integer getAge() {
            return DEFAULT_AGE;
        }
    }

    public static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
