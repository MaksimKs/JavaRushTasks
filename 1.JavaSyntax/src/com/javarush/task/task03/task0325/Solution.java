package com.javarush.task.task03.task0325;

import java.io.*;
import java.util.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println("Я буду зарабатывать $" + number + " в час");
        scanner.close();
    }
}
