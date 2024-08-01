package org.example;

public class SeniorCitizens {
    public static void main(String[] args) {
        String name = "7868190130M7522";
        System.out.println(name.charAt(11));
        System.out.println(name.charAt(12));

        String substring = name.substring(11, 13);

    }
    public int countSeniors(String[] details) {
        int numOfPassangersOver60 = 0;
        for (String passanger : details) {
            int age = Integer.parseInt(passanger.substring(11,13));
            if(age > 60){
                numOfPassangersOver60 += 1;
            }
        }
        return numOfPassangersOver60;
    }
}
