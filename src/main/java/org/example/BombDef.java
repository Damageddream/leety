package org.example;

import java.util.Arrays;

public class BombDef {
    public static void main(String[] args) {
        int[] test1 = {5,7,1,4};
        int[] test2 = {1,2,3,4};
        int[] test3 = {2,4,9,3};

        System.out.println(Arrays.toString(decrypt(test1,3)));
        System.out.println(Arrays.toString(decrypt(test2, 0)));
        System.out.println(Arrays.toString(decrypt(test3, -2)));
    }
    public static int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        for (int i = 0; i < code.length; i++) {
            if(k == 0){
                return result;
            } else if(k>0){
                int tempRes = 0;
                int tempInd = i+1;
                for (int j = 0; j < k; j++) {
                    if(tempInd>code.length-1){
                        int temp = Math.abs(tempInd%code.length);
                        tempRes += code[temp];
                    } else {
                        tempRes += code[tempInd];
                    }
                    tempInd++;
                }
                result[i] = tempRes;
            } else {
                int tempRes = 0;
                int tempInd = i-1;
                for (int j = 0; j < Math.abs(k); j++) {
                    if(tempInd<0){
                        int temp = code.length+tempInd;
                        tempRes += code[temp];
                    } else {
                        tempRes += code[tempInd];
                    }
                    tempInd--;
                }
                result[i] = tempRes;
            }
        }
        return result;
    }
}
