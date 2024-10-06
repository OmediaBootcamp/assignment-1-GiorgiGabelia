package dev.omedia.section6.exc23;

public class PerfectNumber {
    public static boolean isPerfectNumber(int num) {
        if(num < 0) return false;

        int sumOfDigits = 0;
        int index = 1;

        do {
            if(num % index == 0) {
                sumOfDigits += index;
            }
            index++;
        } while (index < num);

        return sumOfDigits == num;
    }
}
