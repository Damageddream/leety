package org.example;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));

    }

    public static int hammingDistance(int x, int y) {
        String xString = Integer.toString(x,2);
        String yString = Integer.toString(y,2);
        xString = String.format("%32s", xString).replaceAll(" ","0");
        yString = String.format("%32s", yString).replaceAll(" ","0");
        int diffNum = 0;
        for (int i = 0; i < xString.length(); i++) {
            if(xString.charAt(i) != (yString.charAt(i))){
                diffNum += 1;
            }
        }
        return diffNum;
    }
}
