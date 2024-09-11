package org.example;

public class CountOddNumsInInterv {
    public static void main(String[] args) {
        System.out.println(countOdds(3, 7));
        System.out.println(countOdds(8, 10));
        System.out.println(countOdds(1, 101));
        System.out.println(countOdds(0, 100));
        System.out.println(countOdds(14, 17));
    }

    public static int countOdds(int low, int high) {
        int difference = (high - low) + 1;
        if(difference%2 == 0){
            return Math.abs(difference/2);
         } else {
            if(low%2!=0 || high%2!=0){
                return Math.abs(difference/2)+1;
            }
        }
        return Math.abs(difference/2);
    }
}
