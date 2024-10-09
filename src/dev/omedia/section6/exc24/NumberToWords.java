package dev.omedia.section6.exc24;

public class NumberToWords {
    public static void numberToWords(int num) {
        if (num < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNum = reverse(num);
        int removedZerosCount = getDigitCount(num) - getDigitCount(reversedNum);
        do {
            int lastDigit = reversedNum % 10;
            reversedNum = reversedNum / 10;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Invalid number");
                    break;
            }
        } while (reversedNum > 0);

        if (removedZerosCount != 0) {
            for (int i = 0; i < removedZerosCount; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int num) {
        boolean isNegative = num < 0;
        if (isNegative) num = -num;
        int reversedNum = 0;
        do {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10;
        } while (num > 0);

        if (isNegative) reversedNum = -reversedNum;
        return reversedNum;
    }

    public static int getDigitCount(int num) {
        if (num < 0) return -1;

        int digitCount = 0;
        do {
            num = num / 10;
            digitCount++;
        } while (num > 0);

        return digitCount;
    }
}
