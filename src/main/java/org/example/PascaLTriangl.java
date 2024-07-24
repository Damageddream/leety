package org.example;

import java.util.ArrayList;
import java.util.List;

public class PascaLTriangl {
    public static void main(String[] args) {
        System.out.println(generate(5));

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            if(i == 0){
                output.add(List.of(1));
            } else if( i == 1){
                output.add(List.of(1,1));
            }else{
                List<Integer> tempList = new ArrayList<>();
                tempList.add(1);
                for (int j = 0; j < output.get(i - 1).size()-1; j++) {
                    int temp = output.get(i - 1).get(j) + output.get(i - 1).get(j + 1);
                    tempList.add(temp);
                }
                tempList.add(1);
                output.add(tempList);
            }

        }
        return output;
    }
}
