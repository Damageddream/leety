package org.example;

import java.util.Arrays;

public class GetNoZeroInt {
    public static void main(String[] args) {
      int[] test = getNoZeroIntegers(2);
      int[] test1 = getNoZeroIntegers(11);
       int[] test2 = getNoZeroIntegers(1010);
       System.out.println(Arrays.toString(test));
        System.out.println(Arrays.toString(test1));
        System.out.println(Arrays.toString(test2));
    }

    public static int[] getNoZeroIntegers(int n) {
        int len = n-1;
        for (int i = 1; i < n + 1; i++) {
            int first = i;
            int last = len;
            boolean firstHasZero = false;
            boolean lastHasZero = false;
            while(first>0){
                if(first%10==0){
                    firstHasZero = true;
                    break;
                }
                first /= 10;
            }
            while (last>0){
                if(last%10==0){
                    lastHasZero = true;
                    break;
                }
                last /= 10;
            }
            if (firstHasZero || lastHasZero){
                len--;
                continue;
            }
            return new int[]{i,len};
        }
        return new int[]{};
    }
}
