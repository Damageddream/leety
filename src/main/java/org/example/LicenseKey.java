package org.example;

public class LicenseKey {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4));
        System.out.println(licenseKeyFormatting("2-5g-3-J", 2));
        System.out.println(licenseKeyFormatting("a-a-a-a-",1));


    }

    public static String licenseKeyFormatting(String s, int k) {
        String formatedS = s.replace("-", "").toUpperCase();
        if (formatedS.length() == 1 || formatedS.isEmpty()) {
            return formatedS;
        }

        StringBuilder builder = new StringBuilder(formatedS);
        if(k == 1){
            for (int i = 1; i < formatedS.length(); i += k+1) {
                builder.insert(i,"-");
            }
            return builder.toString();
        }
        int firstGroupLength = formatedS.length() % k == 0 ? 0 : formatedS.length() % k;
        if (firstGroupLength != 0) {
            builder.insert(firstGroupLength, "-");
            for (int i = k + firstGroupLength + 1; i < formatedS.length(); i += k) {
                builder.insert(i, "-");
            }
        } else {
            for (int i = k; i < formatedS.length(); i += k) {
                builder.insert(i, "-");
            }
        }
        return builder.toString();
    }
}
