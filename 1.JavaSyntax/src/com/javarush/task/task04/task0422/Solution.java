package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        ageVerification(name, age);

        scanner.close();
    }

    static void ageVerification(String name, int age) {
        if (age < 18) {
            String verificationAnswer = "Подрасти еще"; /*"Grow up a little more";*/
            System.out.println(verificationAnswer);
        }
    }
}
