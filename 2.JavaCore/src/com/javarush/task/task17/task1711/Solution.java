package com.javarush.task.task17.task1711;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Ivanov Ivan", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Petrov Petr", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException /*NoGenderException*/{
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i+=3) {
                            createPersons(args[i], args[i+1], args[i+2]);
                        System.out.println(allPeople.size()-1);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i+=4) {
                        updatePersons(Integer.parseInt(args[i]), args[i+1], args[i+2], args[i+3]);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++){
                        deletePersons(Integer.parseInt(args[i]));
                    }
                }
                break;
            case "-i":
                synchronized(allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        printPersons(Integer.parseInt(args[i]));
                    }
                }
                break;
        }
    }

    static void createPersons(String name, String sex, String date) throws ParseException {
        Date birthDate = Solution.dateFormat.parse(date);
        if (sex.equalsIgnoreCase("м")) {
            allPeople.add(Person.createMale(name, birthDate));
        } else if (sex.equalsIgnoreCase("ж")) {
            allPeople.add(Person.createFemale(name,birthDate));
        } //else throw new NoGenderException("Sorry, no such gender");
    }
    static void updatePersons(int id, String name, String sex, String date) throws ParseException {
        Date birthDateUpd = Solution.dateFormat.parse(date);
        if (sex.equalsIgnoreCase("м")) {
            allPeople.set(id,Person.createMale(name,birthDateUpd));
        } else if (sex.equalsIgnoreCase("ж")) {
            allPeople.set(id,Person.createFemale(name,birthDateUpd));
        } //else throw new NoGenderException("Sorry, no such gender");
    }
    static void deletePersons(int id) {
        allPeople.get(id).setName(null);
        allPeople.get(id).setSex(null);
        allPeople.get(id).setBirthDate(null);
    }
    static void printPersons(int id) {
        SimpleDateFormat formatForPrint = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
        String dateForPrint = formatForPrint.format(allPeople.get(id).getBirthDate());
        String name = allPeople.get(id).getName();
        String sex = allPeople.get(id).getSex().equals(Sex.MALE) ? " м " : " ж ";
        System.out.printf("%s%s%s%n", name,sex,dateForPrint);
    }
}
