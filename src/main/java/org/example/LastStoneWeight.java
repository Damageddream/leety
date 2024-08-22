package org.example;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] test = {2, 7, 4, 1, 8, 1};
        System.out.println(lastStoneWeight(test));


    }

    public static int lastStoneWeight(int[] stones) {
        Queue<Integer> prioQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            prioQ.add(stones[i]);
        }
        while (prioQ.size() > 1) {
            int first = prioQ.poll();
            int second = prioQ.poll();
            if (first == second) {
                continue;
            }
            prioQ.add(first - second);
        }
        return prioQ.isEmpty() ? 0 : prioQ.poll();

    }
}
