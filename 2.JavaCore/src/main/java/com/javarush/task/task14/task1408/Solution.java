package com.javarush.task.task14.task1408;

public class Solution {

    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory implements Country {

        static Hen getHen(String country) {
            switch (country) {
                case UKRAINE:
                    return new UkrainianHen();
                case RUSSIA:
                    return new RussianHen();
                case MOLDOVA:
                    return new MoldovanHen();
                case BELARUS:
                    return new BelarusianHen();
                default:
                    return null;
            }
        }
    }
}
