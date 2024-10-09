package dev.omedia.section6.exc18;

public class EvenDigitSum {
    public static int getEvenDigitSum(int num) {
        if(num < 0) return -1;

        int evenDigitSum = 0;


        do {
            int lastDigit = num % 10;
            if(lastDigit % 2 == 0) {
                evenDigitSum += lastDigit;
            }
            num = num / 10;
        } while (num != 0);


        return evenDigitSum;

    }
}
