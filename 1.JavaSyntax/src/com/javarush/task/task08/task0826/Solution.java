package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);;
        }
    }


      public static void sort (int [] array) {
          for (int i = array.length - 1; i > 0; i--) {
              for (int j = 0; j < i; j++) {
                  if (array[j] < array[j + 1]) {
                      int temp = array[j];
                      array[j] = array[j + 1];
                      array[j + 1] = temp;
                  }
              }
          }
      }
/*    public static void sort (int [] array) {
        for (int i = 0; i < array.length; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }*/
}
