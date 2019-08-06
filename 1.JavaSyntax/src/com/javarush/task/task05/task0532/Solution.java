package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int quantityNumbers = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());
        if (quantityNumbers > 0) {
            for (int i = 0; i < quantityNumbers - 1; i++) {
                int number = Integer.parseInt(reader.readLine());
                if (number > maximum) maximum = number;
            }
        }
        System.out.println(maximum);
    }
}
//код который ниже отрабывает верно,но не проходит валидацию
/*
        int numberFromConsole = Integer.parseInt(reader.readLine());
        int maximum = 0;

        int[] array = new int[numberFromConsole];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (array.length == 1) {
                System.out.println(array[i]);
                break;
            }
        }

        for (int j = 1; j < array.length; j++) {
            if (array[0] < array[j]) {
                int temp = array[j];
                maximum = temp;
            }
        }
        System.out.println(maximum);
    }
}
*/

