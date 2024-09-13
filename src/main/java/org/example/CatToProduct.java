package org.example;

import java.util.*;

public class CatToProduct {
    public static void main(String[] args) {
        String input = "Category1:Product2,Product3|Category2:Product1,Product4|Category3:Product1,Product4,Product5|Category6:";
        List<String> output = parseCategoryProducts(input);
        System.out.println(output);
    }

    public static List<String> parseCategoryProducts(String input) {
        Map<String, Set<String>> productWithCategories = new TreeMap<>();
        List<String> asd = new ArrayList<>();
        asd.add("");
        String[] splitByCategpry = input.split("\\|");
        for (int i = 0; i < splitByCategpry.length; i++) {
            String[] splittedByTwo = splitByCategpry[i].split(":");
            if(splittedByTwo.length != 1){
            String[] spllitedByP = splittedByTwo[1].split(",");
            for (int j = 0; j < spllitedByP.length; j++) {
                productWithCategories.put(spllitedByP[j], productWithCategories
                        .getOrDefault(spllitedByP[j], new TreeSet<>()));
                productWithCategories.get(spllitedByP[j]).add(splittedByTwo[0]);
            }}
        }
        StringBuilder sb = new StringBuilder();
        List<String> output = new ArrayList<>();
        productWithCategories.keySet().forEach(k -> {
            sb.append(k);
            sb.append(":");
            productWithCategories.get(k).forEach(v -> {
                sb.append(v);
                sb.append(",");
            });
            sb.deleteCharAt(sb.length() - 1);
            output.add(sb.toString());
            sb.setLength(0);
        });
        System.out.println(Arrays.toString(splitByCategpry));

        return output;
    }
}
