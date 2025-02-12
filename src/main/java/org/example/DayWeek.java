package org.example;

public class DayWeek {
    public static void main(String[] args) {
        System.out.println(thousandSeparator(987));
        System.out.println(thousandSeparator(1234));
        System.out.println(thousandSeparator(12345678));
        System.out.println(thousandSeparator(123456789));
        System.out.println(thousandSeparator(1234567891));
    }

    public static String thousandSeparator(int n) {
        String nString = Integer.toString(n);
        StringBuilder builder = new StringBuilder();
        if (nString.length() > 3) {
            int counter = 1;
            for (int i = nString.length(); i > 0; i--) {
                if (counter % 3 == 0) {
                    if (counter == nString.length()) {
                        builder.append(nString.charAt(i - 1));
                    } else {
                        builder.append(nString.charAt(i - 1));
                        builder.append(".");
                    }

                } else {
                    builder.append(nString.charAt(i - 1));
                }
                counter++;
            }
        } else {
            return nString;
        }
        return builder.reverse().toString();
    }
}
