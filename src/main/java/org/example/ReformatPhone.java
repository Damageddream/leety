package org.example;

public class ReformatPhone {
    public static void main(String[] args) {
        System.out.println(reformatNumber("1-23-45 6"));
        System.out.println(reformatNumber("123 4-567"));
        System.out.println(reformatNumber("123 4-5678"));
    }

    public static String reformatNumber(String number) {
        if(number.length() < 3){
            return number;
        }
        String cleanedNum = number.replaceAll("[ -]", "");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cleanedNum.length(); i++) {
            int afMod = cleanedNum.length()%3;
            if(cleanedNum.length()-(i) <= 4){
                if(afMod==0){
                    sb.append(cleanedNum.charAt(i));
                    sb.append("-");
                    sb.append(cleanedNum.charAt(i+1));
                    sb.append(cleanedNum.charAt(i+2));
                    sb.append(cleanedNum.charAt(i+3));
                } else if (afMod == 1) {
                    sb.append(cleanedNum.charAt(i));
                    sb.append(cleanedNum.charAt(i+1));
                    sb.append("-");
                    sb.append(cleanedNum.charAt(i+2));
                    sb.append(cleanedNum.charAt(i+3));
                } else {
                    sb.append(cleanedNum.charAt(i));
                    sb.append(cleanedNum.charAt(i+1));
                    sb.append("-");
                    sb.append(cleanedNum.charAt(i+2));
                    sb.append(cleanedNum.charAt(i+3));
                }
                return sb.toString();
            }
            if ((i + 1) % 3 == 0 && i != cleanedNum.length() - 1) {
                sb.append(cleanedNum.charAt(i));
                sb.append("-");
            } else {
                sb.append(cleanedNum.charAt(i));
            }
        }
        return sb.toString();
    }
}
