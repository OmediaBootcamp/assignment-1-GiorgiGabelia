package dev.omedia.section5.exc6;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return (long) (num1 * 1000) == (long) (num2 * 1000);

    }
}
