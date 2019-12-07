package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> catResult = new HashSet<Cat>();
        for (int counterCat = 0; counterCat < 4; counterCat++) {
            catResult.add(new Cat());
        }
        return catResult;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> dogResult = new HashSet<Dog>();
        for (int counterDog = 0; counterDog < 3; counterDog++) {
            dogResult.add(new Dog());
        }
        return dogResult;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        Set<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        for (Iterator<Object> iterator = pets.iterator(); iterator.hasNext();) {
            Object cat = iterator.next();
            for (Iterator<Cat> catIterator = cats.iterator(); catIterator.hasNext();) {
                Cat catObj = catIterator.next();
                if (cat.equals(catObj)) {
                    iterator.remove();
                }
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        for(Object pet : pets) {
            System.out.println(pet.toString());
        }
    }

    static class Cat{
    }
    static class Dog{
    }
}
