package dev.omedia.section5.exc1;

public class PositiveNegativeZero {
    public static void checkNumber(int number) {
        System.out.println(number > 0 ? "positive" : number < 0 ? "negative" : "zero");
    }
}
