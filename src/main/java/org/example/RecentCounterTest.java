package org.example;

public class RecentCounterTest {
    public static void main(String[] args) {

        RecentCounter recentCounter = new RecentCounter();
        int[] testLoop = {825, 2295, 4131, 5455, 5884, 5975};
        for (int i : testLoop) {
            System.out.println(recentCounter.ping(i));
        }
    }
}
