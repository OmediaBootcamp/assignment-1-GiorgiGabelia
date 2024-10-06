package dev.omedia.section6.exc28;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        long avg = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                sum += scanner.nextInt();
                count++;
            }
        } catch (Exception e) {
            scanner.close();
            if (count > 0) avg = Math.round((float) sum / count);
            System.out.printf("SUM = %s AVG = %s", sum, avg);
        }
    }
}
