package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {

    private String ruCountry = Country.RUSSIA;

    String getRuCountry () {
        return this.ruCountry;
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }

    @Override
    String getDescription() {
        return super.getDescription()
                + " Моя страна - " + getRuCountry()
                + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
