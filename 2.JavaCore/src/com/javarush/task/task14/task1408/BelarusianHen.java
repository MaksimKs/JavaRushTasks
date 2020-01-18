package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {

    private String byCountry = Country.BELARUS;

    String getByCountry () {
        return this.byCountry;
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 40;
    }

    @Override
    String getDescription() {
        return super.getDescription()
                + " Моя страна - " + getByCountry()
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
