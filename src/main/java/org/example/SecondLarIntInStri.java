package org.example;

public class SecondLarIntInStri {
    public static void main(String[] args) {
        System.out.println(secondHighest("ck077"));
        System.out.println(secondHighest("abc1111"));
        System.out.println(secondHighest("dfa12321afd"));

    }
    public static int secondHighest(String s) {
        int largest = -1;
        int secondLargest = -1;
        for (int i = 0; i < s.length(); i++) {
            int current = Character.getNumericValue(s.charAt(i));
            if(Character.isDigit(s.charAt(i))){
                if(current >= largest){
                    if(largest != current){
                        secondLargest = largest;
                    }
                    largest = current;
                } else {
                    if(current > secondLargest){
                        secondLargest = current;
                    }
                }
            }
        }
        return secondLargest;
    }
}
