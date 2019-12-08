package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayListWithArrays = new ArrayList<>();
        int [] fiveArray = {1,2,3,4,5};
        int [] twoArray = {0,1};
        int [] fourArray = {2,4,6,8};
        int [] sevenArray = {0,1,2,3,4,5,6};
        int [] zeroArray = {};
        arrayListWithArrays.add(fiveArray);
        arrayListWithArrays.add(twoArray);
        arrayListWithArrays.add(fourArray);
        arrayListWithArrays.add(sevenArray);
        arrayListWithArrays.add(zeroArray);
        return  arrayListWithArrays;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
