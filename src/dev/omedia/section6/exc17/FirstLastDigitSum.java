package dev.omedia.section6.exc17;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;

        int lastDigit = number % 10;
        int firstDigit = 0;
        int index = 0;
        do {
            number = number / 10;
            if (number == 0 && index == 0) {
                firstDigit = lastDigit;
            } else if (number != 0) {
                firstDigit = number;
            }
            index++;
        } while (number != 0);

        return lastDigit + firstDigit;
    }
}
