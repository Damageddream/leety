package org.example;

public class SlowestKEy {
    public static void main(String[] args) {
        int[] testArr1 = {1, 2};
        int[] testArr2 = {12, 23, 36, 46, 62};
        System.out.println(slowestKey(testArr1, "ba"));
        System.out.println(slowestKey(testArr2, "spuda"));

    }

    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int longestIndex = 0;
        int longestDuration = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            if (releaseTimes[i] - releaseTimes[i - 1] >= longestDuration) {
                if (releaseTimes[i] - releaseTimes[i - 1] == longestDuration && keysPressed.charAt(longestIndex) != keysPressed.charAt(i)) {
                    longestIndex = keysPressed.charAt(longestIndex) > keysPressed.charAt(i) ? longestIndex : i;
                } else {
                    longestIndex = i;
                }
                longestDuration = releaseTimes[i] - releaseTimes[i - 1];
            }
        }
        return keysPressed.charAt(longestIndex);
    }
}
