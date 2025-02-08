package org.example;

public class DistancEArrays {
    public static void main(String[] args) {
        int[] testA1 = {4,5,8};
        int[] testA2 = {10,9,1,8};

        int[] testB1 = {1,4,2,3};
        int[] testB2 = {-4,-3,6,10,20,30};

        int[] testC1 = {2,1,100,3};
        int[] testC2 = {-5,-2,10,-3,7};

        System.out.println(findTheDistanceValue(testA1, testA2, 2));
        System.out.println(findTheDistanceValue(testB1, testB2, 3));
        System.out.println(findTheDistanceValue(testC1, testC2, 6));
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int distance = 0;
        for (int i : arr1) {
            int checked = 0;
            for (int j : arr2) {
                if(Math.abs(i-j) <= d){
                    break;
                }
                checked++;
            }
            if(checked == arr2.length){
                distance++;
            }
        }
        return distance;
    }
}
