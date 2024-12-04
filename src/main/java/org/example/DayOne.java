package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DayOne {
    public static void main(String[] args) {
        // Initialize two lists to hold the numbers from each column
        List<Integer> leftColumn = new ArrayList<>();
        List<Integer> rightColumn = new ArrayList<>();

        // Path to the input file
        InputStream inputStream = DayOne.class.getClassLoader().getResourceAsStream("input.txt");


        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into two parts
                String[] parts = line.trim().split("\\s+");
                if (parts.length == 2) {
                    // Parse numbers and add them to the respective lists
                    leftColumn.add(Integer.parseInt(parts[0]));
                    rightColumn.add(Integer.parseInt(parts[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the lists to verify
        leftColumn.sort(Integer::compare);
        rightColumn.sort(Integer::compare);
        System.out.println("Left Column: " + leftColumn);
        System.out.println("Right Column: " + rightColumn);
        int distance = 0;
        for (int i = 0; i < leftColumn.size(); i++) {
            int left = leftColumn.get(i);
            int right = rightColumn.get(i);
            int differcene = left - right;
            int absDiff = Math.abs(differcene);
            distance += absDiff;
        }
        System.out.println(distance);
        int newDist = 0;
        for (int i = 0; i < leftColumn.size(); i++) {
            int x = leftColumn.get(i);
            int times = 0;
            for (int j = 0; j < rightColumn.size(); j++) {
                if(rightColumn.get(j) == x){
                    times++;
                }
            }
            newDist += x * times;
        }

        System.out.println(newDist);


    }

}
