package dev.omedia.section5.exc8;

public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num) {
        return num <= 19 && num >= 13;
    }
}
