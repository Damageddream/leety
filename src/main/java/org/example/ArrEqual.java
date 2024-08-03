package org.example;

import java.util.Arrays;

public class ArrEqual {
    public static void main(String[] args) {

    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        if (Arrays.equals(target, arr)) {
            return true;
        }
        Arrays.sort(target);
        Arrays.sort(arr);
        if (Arrays.equals(target, arr)) {
            return true;
        }
        return false;
    }
}
