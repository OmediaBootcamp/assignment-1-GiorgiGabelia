package dev.omedia.section6.exc26;

public class LargestPrime {
    public static int getLargestPrime(int num) {
        if (num <= 1) return -1;
        int largestPrimFactor = 0;

        for(int i = 2; i < num; i++) {
            boolean isDivisible = num % i == 0;
            if(!isDivisible) continue;

            boolean isPrime = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) largestPrimFactor = i;
        }

        return largestPrimFactor == 0 ? num : largestPrimFactor;
    }
}
