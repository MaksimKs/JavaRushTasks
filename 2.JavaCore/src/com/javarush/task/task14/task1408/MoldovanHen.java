package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {

    private String mlCoutry = Country.MOLDOVA;

    String getMlCoutry () {
        return mlCoutry;
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 20;
    }

    @Override
    String getDescription() {
        return super.getDescription()
                + " Моя страна - " + getMlCoutry()
                + ". Я несу " + getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
