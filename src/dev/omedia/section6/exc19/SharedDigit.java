package dev.omedia.section6.exc19;

import java.util.ArrayList;

public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) return false;

        ArrayList<Integer> num1ArrList = new ArrayList<>();
        do {
            int lastDigit = num1 % 10;
            num1ArrList.add(lastDigit);
            num1 = num1 / 10;
        } while (num1 != 0);


        ArrayList<Integer> num2ArrList = new ArrayList<>();
        do {
            int lastDigit = num2 % 10;
            num2ArrList.add(lastDigit);
            num2 = num2 / 10;
        } while (num2 != 0);

        return num1ArrList.stream().anyMatch(num2ArrList::contains);

    }

}