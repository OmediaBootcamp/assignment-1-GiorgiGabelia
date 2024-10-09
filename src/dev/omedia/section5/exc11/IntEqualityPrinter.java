package dev.omedia.section5.exc11;

public class IntEqualityPrinter {
    public static void printEqual(int num1, int num2, int num3) {
        int[] numArr = {num1, num2, num3};

        boolean noNegativeNums = true;
        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] < 0) {
                noNegativeNums = false;
                break;
            };
        }
        if (!noNegativeNums) {
            System.out.println("Invalid Value");
            return;
        }

        boolean allAreEqual = true;
        for(int i = 0; i < numArr.length; i++) {
            for(int j = 0; j < numArr.length; j++) {
                if(numArr[i] != numArr[j]) {
                    allAreEqual = false;
                    break;
                }
                if(!allAreEqual) break;
            }
        }
        if (allAreEqual) {
            System.out.println("All numbers are equal");
            return;
        }

        boolean allAreDifferent = true;
        for(int i = 0; i < numArr.length; i++) {
            for(int j = 0; j < numArr.length; j++) {
                if(numArr[i] == numArr[j] && i != j) {
                    allAreDifferent = false;
                    break;
                }
            }

            if(!allAreDifferent) break;
        }
        if(allAreDifferent) {
            System.out.println("All numbers are different");
            return;
        }

        System.out.println("Neither all are equal or different");
    }
}
