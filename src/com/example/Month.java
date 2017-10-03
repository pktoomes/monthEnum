package com.example;

public enum Month {
    JANUARY("January"), FEBUARY("Febuary"), MARCH("March"), APRIL("April"), MAY("May"), JUNE("June"), JULY("July"), AUGUST("August"), SEPTEMBER("September"), OCTOBER("October"), NOVEMBER("November"), DECEMBER("December");

    private  String englishNames;

    public  String getEnglishNames() {
        return englishNames;
    }

    Month(String englishNames) {
        this.englishNames = englishNames;
    }
}


