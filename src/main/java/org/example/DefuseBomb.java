package org.example;

import java.util.Arrays;

public class DefuseBomb {
    public static void main(String[] args) {
        int[] test1out = {12,10,16,13};
        int[] test1inp = {5,7,1,4};
        int[] test2out = {0,0,0,0};
        int[] test2inp = {1,2,3,4};
        int[] test3out = {12,5,6,13};
        int[] test3inp = {2,4,9,3};

        System.out.println(Arrays.equals(decrypt(test1inp, 3),test1out));
        System.out.println(Arrays.equals(decrypt(test2inp, 0),test2out));
        System.out.println(Arrays.equals(decrypt(test3inp, -2),test3out));

    }
    public static int[] decrypt(int[] code, int k) {
        int[] out = new int[code.length];
        if(k == 0){
            return out;
        } else if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i+j)%code.length];
                }
                out[i] = sum;
            }
        }
        for (int i = 0; i < code.length; i++) {
            int sum = 0;
            for (int j = 1; j < -1 * k; j++) {
                sum += code[(i-j+code.length)% code.length];
            }
            out[i] = sum;
        }

        return out;
    }
}
