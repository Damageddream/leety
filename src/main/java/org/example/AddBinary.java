package org.example;


import java.math.BigInteger;

public class AddBinary {
    public static void main(String[] args) {
        String test1 = "100";
        String test2 = "10101";
        System.out.println(addBinary("11","1").equals(test1));
        System.out.println(addBinary("1010","1011").equals(test2));

    }
    public static String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        BigInteger first = new BigInteger(a,2);
        BigInteger second = new BigInteger(b,2);
        return first.add(second).toString(2);

    }
}
