package com.javarush.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Клининговый центр
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        for (Apartment eachOfApartment : apartments) {
            if (eachOfApartment instanceof OneRoomApt) {
                ((OneRoomApt) eachOfApartment).clean1Room();
            } else if (eachOfApartment instanceof TwoRoomApt) {
                ((TwoRoomApt) eachOfApartment).clean2Rooms();
            } else if (eachOfApartment instanceof ThreeRoomApt) {
                ((ThreeRoomApt) eachOfApartment).clean3Rooms();
            } else throw new NullPointerException();
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
