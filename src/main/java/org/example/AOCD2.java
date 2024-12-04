package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AOCD2 {
    public static void main(String[] args) {
        // Initialize two lists to hold the numbers from each column
        List<List<Integer>> lines = new ArrayList<>();


        // Path to the input file
        InputStream inputStream = AOCD2.class.getClassLoader().getResourceAsStream("day2test.txt");


        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into two parts
                String[] parts = line.trim().split("\\s+");
                List<Integer> numbers = new ArrayList<>();
                for (String part : parts) {
                    numbers.add(Integer.parseInt(part));
                }
                lines.add(numbers);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(lines);
        int safe = 0;
        for (List<Integer> line : lines) {
            if(checkIfLinesafe(line)){
                safe++;
            } else {
                if(removeOne(line)){
                    safe++;
                }
            }
        }
        System.out.println(safe);
        // Print the lists to verify

    }
    private static boolean checkIfLinesafe(List<Integer> line){
        int safe = 0;
            int prev = 0;
            boolean inc = true;
            int cot = 0;
            int lineSize = line.size();
            for (Integer num : line) {
                if (prev != 0) {
                    if (num == prev) {
                        break;

                    }
                    if (prev < num && inc == false) {
                        break;
                    } else if (prev > num && inc == true) {
                        break;
                    }

                    int diff = Math.abs(num - prev);
                    if (diff > 3) {
                        break;
                    }
                    cot++;

                    prev = num;
                }else{
                    inc = num < line.get(1);
                    prev = num;}

            }
            if (cot == lineSize - 1) {
                return true;
            }
            return false;

    }
    private static boolean removeOne(List<Integer> line){

        for (int i = 0; i < line.size(); i++) {
            List<Integer> copy = new ArrayList<>(line);
            copy.remove(i);
            if(checkIfLinesafe(copy)){
                return true;
            }
        }
        return false;
    }

}

