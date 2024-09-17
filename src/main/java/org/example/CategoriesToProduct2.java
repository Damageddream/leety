package org.example;

import java.util.*;

public class CategoriesToProduct2 {
    /*
     * input: "Category1:Product2,Product3|Category2:Product1,Product4|Category3:Product1,Product4,Product5"
     * output: ["Product1:Category2,Category3", "Product2:Category1", "Product3:Category1", "Product4:Category2,Category3", "Product5:Category3"]
     * */
    public static List<String> parseCategoryProducts(String input) {
        String[] splitedByCat = input.split("\\|");
        Map<String, TreeSet<String>> mapOfProd = new TreeMap<>();
        for (int i = 0; i < splitedByCat.length; i++) {
            String category = splitedByCat[i].split(":")[0];
            String[] products = splitedByCat[i].split(":")[1].split(",");
            for (int j = 0; j < products.length; j++) {
                mapOfProd.computeIfAbsent(products[j], k -> new TreeSet<>()).add(category);
            }
        }
        List<String> output = new ArrayList<>();

        mapOfProd.keySet().forEach(key -> {
            String producTemp = key+":";
            String catTemp = String.join(",",mapOfProd.get(key));
            output.add(producTemp+catTemp);
        });
        return output;
    }

    public static void main(String[] args) {
        String input = "Category1:Product2,Product3|Category2:Product1,Product4|Category3:Product1,Product4,Product5";
        List<String> output = parseCategoryProducts(input);
        System.out.println(output);
    }
}
