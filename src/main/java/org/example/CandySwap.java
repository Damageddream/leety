package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class CandySwap {
    public static void main(String[] args) {
        int[] test1 = {1,2};
        int[] test12 = {2,3};
        System.out.println(Arrays.toString(fairCandySwap(test1,test12)));

    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = IntStream.of(aliceSizes).sum();
        int bobSum = IntStream.of(bobSizes).sum();
        int difference = (aliceSum - bobSum)/2;


        HashSet<Integer> hSet = new HashSet<>();
        for (int box : aliceSizes) {
            hSet.add(box);
        }
        for (int box : bobSizes) {
            if(hSet.contains(box+difference)){
                return new int[]{ box+difference,box};
            }
        }

        return new int[]{};
    }
}
