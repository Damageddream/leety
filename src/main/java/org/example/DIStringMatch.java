package org.example;

import java.util.Arrays;

public class DIStringMatch {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
        System.out.println(Arrays.toString(diStringMatch("III")));
        System.out.println(Arrays.toString(diStringMatch("DDI")));

    }

    public static int[] diStringMatch(String s) {
        int[] output = new int[s.length() + 1];
        int trackI = 0;
        int trackD = s.length();

        for (int i = 0; i < s.length() + 1; i++) {
            if (i == s.length()) {
                if (s.charAt(s.length() - 1) == 'I') {
                    output[s.length()] = trackI;
                } else {
                    output[s.length()] = trackD;
                }
            } else {
                if (s.charAt(i) == 'I') {
                    output[i] = trackI;
                    trackI++;
                } else {
                    output[i] = trackD;
                    trackD--;
                }
            }
        }
        return output;
    }
}
