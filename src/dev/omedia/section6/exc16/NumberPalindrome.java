package dev.omedia.section6.exc16;

public class NumberPalindrome {
    public static boolean isPalindrome(int num) {
        int reverse = 0;
        int numCopy = num;

        do {
            int lastDigit = numCopy % 10;
            reverse = reverse * 10 + lastDigit;
            numCopy = numCopy / 10;
        } while (numCopy != 0);

        return reverse == num;
    }
}
