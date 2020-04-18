package com.javarush.task.task17.task1710;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {

    public static List<Person> allPeople = new ArrayList<Person>();
    static DateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    static DateFormat forPrintDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));//сегодня родился id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));//сегодня родился id=1
    }

    public static void main(String[] args) {

        try {
            if (args[0].equalsIgnoreCase("-c")) {
                createPerson(args[1], args[2], args[3]);
            }
            if (args[0].equalsIgnoreCase("-u")) {
                updatePerson(Integer.parseInt(args[1]), args[2], args[3], args[4]);
            }
        } catch (ParseException e) {
            System.out.println("Can't parse date");
        }
        if (args[0].equalsIgnoreCase("-d")) {
            removePerson(Integer.parseInt(args[1]));
        }
        if (args[0].equalsIgnoreCase("-i")) {
            printPerson(Integer.parseInt(args[1]));
        }
    }

    public static void createPerson(String name, String sex, String birthDay) throws ParseException {
        Date date = simpleDateFormat.parse(birthDay);
        if (sex.equals("м")) {
            allPeople.add(Person.createMale(name, date));
        }
        if (sex.equals("ж")) {
            allPeople.add(Person.createFemale(name, date));
        }
        System.out.println(allPeople.size() - 1);
    }

    public static void updatePerson(int id, String name, String sex, String birthDay) throws ParseException {
        Date date = simpleDateFormat.parse(birthDay);
        if (sex.equals("м")) {
            allPeople.set(id, Person.createMale(name, date));
        }
        if (sex.equals("ж")) {
            allPeople.set(id, Person.createFemale(name, date));
        }
    }


    public static void removePerson(int id) {
        allPeople.get(id).setName(null);
        allPeople.get(id).setSex(null);
        allPeople.get(id).setBirthDate(null);
    }

    public static void printPerson(int id) {
        Date date = allPeople.get(id).getBirthDate();
        String dateString = forPrintDateFormat.format(date);
        if (allPeople.get(id).getSex().equals(Sex.MALE)) {
            System.out.println(allPeople.get(id).getName() + " м " + dateString);
        } else
            System.out.println(allPeople.get(id).getName() + " ж " + dateString);
    }
}