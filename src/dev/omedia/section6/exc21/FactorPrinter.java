package dev.omedia.section6.exc21;

public class FactorPrinter {
    public static void printFactors(int number) {
        if(number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        int index = 1;

        do {
            if(number % index == 0) {
                System.out.println(index);
            }
            index++;
        } while(index <= number);
    }
}
