package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3 {
    public static void main(String[] args) {
        // Initialize two lists to hold the numbers from each column
        List<List<Integer>> lines = new ArrayList<>();


        // Path to the input file
        InputStream inputStream = AOCD2.class.getClassLoader().getResourceAsStream("day3test.txt");

        int sum = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into two parts
                String trimmedLine = line.trim();
                String regex = "mul\\(\\d+,\\d+\\)";
                String doStr = "do\\(\\)";
                String dontStr = "don't\\(\\)";
                Pattern doPat = Pattern.compile(doStr);
                Pattern dontPat = Pattern.compile(dontStr);

                Matcher doMatch = doPat.matcher(trimmedLine);
                Matcher dontMatch = dontPat.matcher(trimmedLine);

                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(trimmedLine);

                boolean work = true;
                if(doMatch.find()){
                    work = true;
                } else if (dontMatch.find()) {
                    work = false;
                }

                List<String> matches = new ArrayList<>();
                while(matcher.find()){
                    matches.add(matcher.group());
                }
                TreeMap<String,String> asd = new TreeMap<>();
                String extractNumbersRegex = "mul\\((\\d+),(\\d+)\\)";
                Pattern extracPattern = Pattern.compile(extractNumbersRegex);

                for (String match : matches) {
                    Matcher extracMatcher = extracPattern.matcher(match);
                    if(extracMatcher.find()){
                        Integer firstNum = Integer.parseInt(extracMatcher.group(1));
                        Integer secondNum = Integer.parseInt(extracMatcher.group(2));
                        sum += firstNum*secondNum;
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
        System.out.println(lines);


    }
}
