package dev.omedia.section6.exc22;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int num1, int num2) {
        if(num1 < 10 || num2 < 10) return -1;

        int upperLimit = Math.max(num1, num2);
        int greatestCommonDivisor = 1;

        for(int i = 2; i <= upperLimit; i++) {
            if(num1 % i == 0 && num2 % i == 0) {
                greatestCommonDivisor = i;
            }
        }

        return greatestCommonDivisor;
    }
}
