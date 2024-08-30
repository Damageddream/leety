package org.example;

public class AppearMoreThen25 {
    public static void main(String[] args) {
        int[] test1= {1,2,2,6,6,6,6,7,10};
        int[] test2= {1,2,3,3};
        int[] test3= {15,15,21,21,32,32,33,33,33,34,35};
        System.out.println(findSpecialInteger(test1));
      System.out.println(findSpecialInteger(test2));
      System.out.println(findSpecialInteger(test3));

    }
    public static int findSpecialInteger(int[] arr) {
        double quarter = arr.length*0.25;
        int counter = 0;
        int current = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != current){
                current = arr[i];
                counter = 1;
            } else {
                counter++;
            }
            if(counter > quarter){
                return arr[i];
            }

        }
        return arr[arr.length-1];
    }
}
