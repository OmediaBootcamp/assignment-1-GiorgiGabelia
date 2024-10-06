package dev.omedia.section5.exc5;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999 || year % 4 != 0) return false;
        return year % 100 != 0 || year % 400 == 0;
    }
}