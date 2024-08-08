package org.example;

public class TeemoAttacking {
    public static void main(String[] args) {
        int[] testTime = {1, 4};
        int testDuration = 2;
        int[] testTime2 = {1,2,3,4,5};
        int testDuration2 = 5;
        int[] testTime3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int testDuration3 = 1;
        System.out.println(findPoisonedDuration(testTime3, testDuration3));
        System.out.println(findPoisonedDuration(testTime, testDuration));
        System.out.println(findPoisonedDuration(testTime2, testDuration2));

    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalTimePoisoned = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (timeSeries.length - 1 > i) {
                if (timeSeries[i] + duration > timeSeries[i + 1]) {
                    totalTimePoisoned += timeSeries[i+1] - timeSeries[i];
                } else {
                    totalTimePoisoned += duration;
                }
            } else {
                totalTimePoisoned += duration;
            }
        }
        return totalTimePoisoned;
    }
}
