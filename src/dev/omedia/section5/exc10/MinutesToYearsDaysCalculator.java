package dev.omedia.section5.exc10;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long days = minutes / (60 * 24);
        long years = days / 365;
        long daysLeft = days % 365;

        System.out.println(String.format(
                "%s min = %s y and %s d",
                minutes, years, daysLeft
        ));
    }
}