package org.example;

public class MaximumPopYear {
    public static void main(String[] args) {
        int[][] test1 = {{1993,1999},{2000,2010}};
        int[][] test2 = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(test1));
        System.out.println(maximumPopulation(test2));

    }

    public static int maximumPopulation(int[][] logs) {
        int range = 100;
        int maxPopulationYear = 1950;
        int currentPop = 0;
        int maxPop = 0;
        for (int i = 0; i < range; i++) {
            int currentYear = 1950+i;
            for (int j = 0; j < logs.length; j++) {
                if(currentYear >= logs[j][0] && currentYear < logs[j][1]){
                    currentPop++;
                }
            }
            if(currentPop > maxPop){
                maxPop = currentPop;
                maxPopulationYear = currentYear;
            }
            currentPop = 0;
        }
        return maxPopulationYear;
    }
}
