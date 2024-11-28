package org.example;

public class HighestAtt {
    public static void main(String[] args) {
        int[] test1 = {-5,1,5,0,-7};
        int[] test2 = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(test1));
        System.out.println(largestAltitude(test2));
    }

    public static int largestAltitude(int[] gain) {
        int currentAtt = 0;
        int highestPointAtt = 0;

        for (int num : gain) {
            currentAtt = currentAtt + num;
            highestPointAtt = Math.max(currentAtt, highestPointAtt);
        }
        
        return highestPointAtt;
    }
}
