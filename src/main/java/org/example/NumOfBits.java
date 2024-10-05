package org.example;

public class NumOfBits {
    public static void main(String[] args) {
        System.out.println(  hammingWeight(11));

    }

    public static int hammingWeight(int n) {
        String binaryString = Integer.toBinaryString(n);
        int hammWeight = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if(Character.getNumericValue(binaryString.charAt(i)) == 1){
                hammWeight++;
            }
        }

        return hammWeight;
    }

}
