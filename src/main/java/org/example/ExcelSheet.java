package org.example;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheet {
    public static void main(String[] args) {
        String test1 = "A";
        String test2 = "AB";
        String test3 = "ZY";
        String test4 = "CA";
        String test5 = "BA";
        String test6 = "UA";
        String test7 = "AAA";
        String test8 = "ACA";
        String test9 = "AZ";
        //1472 BDP

        System.out.println(convertToTitle(1).equals(test1));
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(28).equals(test2));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701).equals(test3));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(79).equals(test4));
        System.out.println(convertToTitle(79));
        System.out.println(convertToTitle(53).equals(test5));
        System.out.println(convertToTitle(53));
        System.out.println(convertToTitle(547).equals(test6));
        System.out.println(convertToTitle(547));
        System.out.println(convertToTitle(703).equals(test7));
        System.out.println(convertToTitle(703));
        System.out.println(convertToTitle(755).equals(test8));
        System.out.println(convertToTitle(755));
        System.out.println(convertToTitle(52).equals(test9));
        System.out.println(convertToTitle(52));
        System.out.println(25%26);
        System.out.println((char)('A'+25));



    }
    public static String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            n--;
            int curr = n%26;
            n /= 26;
            sb.append((char)(curr+'A'));
        }
        return sb.reverse().toString();
    }
}
