package org.example;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000000);
        }

        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));
        mergeSort(numbers);
        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));

    }

    private static void mergeSort(int[] inputArray) {
        int inputLenght = inputArray.length;
        if (inputLenght < 2) {
            return;
        }
        int midIndex = inputLenght / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLenght - midIndex];
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLenght; i++) {
            rightHalf[i-midIndex] = inputArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                inputArray[k] = leftHalf[i];
                i++;
            } else {
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i < leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
