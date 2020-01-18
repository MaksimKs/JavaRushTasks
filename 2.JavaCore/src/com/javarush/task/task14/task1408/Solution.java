package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if ("Belarus".equalsIgnoreCase(country)) {
                hen = new BelarusianHen();
            } else if ("Russia".equalsIgnoreCase(country)) {
                hen = new RussianHen();
            } else if ("Ukraine".equalsIgnoreCase(country)) {
                hen = new UkrainianHen();
            } else if ("Moldova".equalsIgnoreCase(country)) {
                hen = new MoldovanHen();
            }
            return hen;
        }
    }


}
