package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<Integer> listDivThree = new ArrayList<>();
        ArrayList<Integer> listDivTwo = new ArrayList<>();
        ArrayList<Integer> listRemain = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            listInt.add(i, Integer.parseInt(reader.readLine()));
            if (listInt.get(i) % 3 == 0 && listInt.get(i) % 2 == 0) {
                listDivThree.add(listInt.get(i));
                listDivTwo.add(listInt.get(i));
            }
            else if (listInt.get(i) % 3 == 0) {
                listDivThree.add(listInt.get(i));
            }
            else if (listInt.get(i) % 2 == 0) {
                listDivTwo.add(listInt.get(i));
            }
            else listRemain.add(listInt.get(i));
        }
        //System.out.println("first list");
        printList(listDivThree);
        //System.out.println("second list");
        printList(listDivTwo);
        //System.out.println("third list");
        printList(listRemain);
        reader.close();
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer integerList: list) {
            System.out.println(integerList);
        }
    }
}
