package org.example;

public class substructProd {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));

    }

    public static int subtractProductAndSum(int n) {
        String nAsString = String.valueOf(n);
        int product = 0;
        int sum = 0;
        for (int i = 0; i < nAsString.length(); i++) {
            if (i == 0) {
                product = Character.getNumericValue(nAsString.charAt(i));
            } else {
                product *= Character.getNumericValue(nAsString.charAt(i));
            }
            sum += Character.getNumericValue(nAsString.charAt(i));
        }
        return product - sum;
    }
}
