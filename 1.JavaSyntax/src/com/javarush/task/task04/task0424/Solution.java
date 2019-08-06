package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());

        int[] arrayN = {firstNumber, secondNumber, thirdNumber};
        indexNumber(arrayN);
        reader.close();
    }

    static void indexNumber(int [] array) {
        if (array[0] == array[1]) {
            System.out.println(3);
        } else if (array[0] == array[2]) {
            System.out.println(2);
        } else if (array[1] == array[2]) {
            System.out.println(1);
        }
    }
}

/*        if (firstNumber == secondNumber) {
            System.out.println(thirdNumber);
        } else if (secondNumber == thirdNumber) {
            System.out.println(firstNumber);
        } else if (firstNumber == thirdNumber) {
            System.out.println(secondNumber);
        } else {}

    }
}*/
