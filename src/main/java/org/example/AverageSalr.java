package org.example;

public class AverageSalr {
    public static void main(String[] args) {
        int[] test = {4000, 3000, 1000, 2000};
        int[] test2 = {1000, 2000, 3000};
        System.out.println(average(test));
        System.out.println(average(test2));

    }

    public static double average(int[] salary) {
        int minSalar = Math.min(salary[0], salary[1]);
        int maxSalar = Math.max(salary[0], salary[1]);
        int sumOfResTSalaries = 0;
        for (int i = 2; i < salary.length; i++) {
            if (salary[i] > maxSalar) {
                sumOfResTSalaries += maxSalar;
                maxSalar = salary[i];
            } else if (salary[i] < minSalar) {
                sumOfResTSalaries += minSalar;
                minSalar = salary[i];
            } else {
                sumOfResTSalaries += salary[i];
            }
        }
        return  (double) sumOfResTSalaries / (salary.length - 2);
    }
}
