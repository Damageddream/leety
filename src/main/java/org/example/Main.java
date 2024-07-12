package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String input = "D4:|D1:E1,E3|D2:E2,E1,E4|D3:E5,E1,E4";
        List<String> expectedOutput = List.of("E1:D1,D2,D3", "E2:D2", "E3:D1", "E4:D2,D3", "E5:D3");
        List<String> actualOutput = parseDepartmentAndEmployees(input);

//        System.out.println("Expected output: " + expectedOutput);
        System.out.println("Actual output: " + actualOutput);
        System.out.println("Result: " + expectedOutput.equals(actualOutput));
    }

    /**
     * Hidden constructor.
     */
    private Main() {}

    /**
     * Parses the department and employees input string and returns a list of
     * employees and the departments they work in.
     *
     * input: "D1:E1,E3|D2:E1,E2,E4|D3:E1,E4,E5"
     * output: ["E1:D1,D2,D3", "E2:D2", "E3:D1", "E4:D2,D3", "E5:D3"]
     *
     * @param input the department and employees
     * @return the employees and the departments they work in.
     */
    public static List<String> parseDepartmentAndEmployees(String input) {
        Map<String, Set<String>> employeeToDepartments = new HashMap<>();
        String[] departments = input.split("\\|");

        for (String department : departments) {
            if (!department.isEmpty()) {
                String[] parts = department.split("[:,]");
                String depId = parts[0];
                for (int i = 1; i < parts.length; i++) {
                    employeeToDepartments.computeIfAbsent(parts[i], k -> new TreeSet<>()).add(depId);
                }
            }
        }

        List<String> output = new ArrayList<>();
        for (Map.Entry<String, Set<String>> entry : employeeToDepartments.entrySet()) {
            String employee = entry.getKey();
            String departmentsList = String.join(",", entry.getValue());
            output.add(employee + ":" + departmentsList);
        }

        Collections.sort(output);
        return output;
    }
}