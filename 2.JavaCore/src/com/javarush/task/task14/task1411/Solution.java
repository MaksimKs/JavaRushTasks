package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> list = new ArrayList<>();

        //Person person = null;
        String key = null;
        boolean matchCond = true;
        while (matchCond) {
            key = reader.readLine();
            if (key.equalsIgnoreCase("user")) {
                list.add(new Person.User());
            } else if (key.equalsIgnoreCase("loser")) {
                list.add(new Person.Loser());
            } else if (key.equalsIgnoreCase("coder")) {
                list.add(new Person.Coder());
            } else if (key.equalsIgnoreCase("proger")) {
                list.add(new Person.Proger());
            } else matchCond = false;
        }
        for (Person personList : list) {
            doWork(personList);
        }
        reader.close();
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}