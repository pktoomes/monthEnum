package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Type a month");
        for(Month month: Month.values()){
            System.out.println(month.getEnglishNames());
        }

        String monthPicked = scanner.nextLine();
        Month monthUser = Month.valueOf(monthPicked.toUpperCase());
        List<String> months = new ArrayList<>();
        ordinalMethod(monthUser, months);
        System.out.println(months);




    }
    public static void ordinalMethod(Month start, List<String> months ) {
        for (Month month : Month.values()) {
            if (month.ordinal() >= start.ordinal()) {
                months.add(month.getEnglishNames());
            }
        }
    }}

