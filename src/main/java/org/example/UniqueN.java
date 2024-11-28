package org.example;

import java.util.Arrays;

public class UniqueN {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumZero(5)));
        System.out.println(Arrays.toString(sumZero(3)));
        System.out.println(Arrays.toString(sumZero(1)));

    }

    public static int[] sumZero(int n) {
        boolean odd = n % 2 == 0;
        int[] output = new int[n - 1];
        if (odd) {
            int range = n / 2;
            for (int i = 0; i < range; i++) {
                output[i] = -(i + 1);
                output[range - i] = i + 1;
            }
        } else {
            if (n == 1) {
                return new int[]{0};
            }
            int range = (n - 1) / 2;
            output[range] = 0;
            for (int i = 0; i < range; i++) {
                output[i] = -(i + 1);
                output[range - i] = i + 1;
            }
        }
        return output;
    }
}
