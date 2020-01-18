package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {

    private String ukCountry = Country.UKRAINE;

    String getUkCountry () {
        return this.ukCountry;
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 30;
    }

    @Override
    String getDescription() {
        return super.getDescription()
                + " Моя страна - " + getUkCountry()
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
