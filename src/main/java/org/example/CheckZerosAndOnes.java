package org.example;

public class CheckZerosAndOnes {
    public static void main(String[] args) {
        System.out.println(checkZeroOnes("1101"));
        System.out.println(checkZeroOnes("111000"));
        System.out.println(checkZeroOnes("110100010"));

    }
    public static boolean checkZeroOnes(String s) {
        int longestZeros = 0;
        int longestOnes = 0;
        int currentZeros = 0;
        int currentOnes = 0;
        boolean countZeros = s.charAt(0) == '0';
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if(countZeros && current == '0'){
                currentZeros++;
            } else if (countZeros && current != '0') {
                countZeros = false;
                longestZeros = Math.max(longestZeros, currentZeros);
                currentOnes++;
                currentZeros = 0;
            } else if (!countZeros && current == '1') {
                currentOnes++;
            } else {
                countZeros = true;
                longestOnes = Math.max(longestOnes, currentOnes);
                currentZeros++;
                currentOnes = 0;
            }
        }
        longestOnes = Math.max(currentOnes, longestOnes);
        longestZeros = Math.max(currentZeros, longestZeros);
        return longestOnes > longestZeros;
    }
}
