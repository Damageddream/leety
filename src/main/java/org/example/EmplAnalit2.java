package org.example;

import java.util.*;
import java.util.stream.Stream;

public class EmplAnalit2 {
    private static final List<Employee> employees = List.of(
            new Employee("John Doe", "IT", 90000),
            new Employee("Jane Smith", "HR", 85000),
            new Employee("Alice Johnson", "IT", 78000),
            new Employee("Bob Brown", "Marketing", 67000),
            new Employee("Mike Davis", "IT", 93000),
            new Employee("Julia Miller", "HR", 74000)
    );

    public static double averageSalary() {
        return employees.stream().mapToInt(Employee::getSalary).average().orElse(0.0);
    }

    public static List<Employee> findByDepartment(String department) {

        return employees.stream().filter(e -> e.getDeparment().equals(department)).toList();
    }

    public static Employee findEmployeeWithHighestSalary() {
        return employees.stream().max(Comparator.comparingInt(Employee::getSalary)).orElse(null);
    }

    public static List<Employee> printTopPaid(int number) {
        return employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).limit(number).toList();
    }

    public static Map<String, Long> numberOfEmployeesByDepartment() {
        Map<String, Long> numberOfEmployeesByDep = new HashMap<>();
        employees.stream().forEach(e->{
            numberOfEmployeesByDep.put(e.getDeparment(), numberOfEmployeesByDep.getOrDefault(e.getDeparment(), 0L)+1);
        });
        return numberOfEmployeesByDep;
    }

    public static void main(String[] args) {
        System.out.println("Average salary: " + averageSalary());
        System.out.println("Department Employees: " + findByDepartment("IT"));
        System.out.println("Highest Paid Employee: " + findEmployeeWithHighestSalary());
        System.out.println("Top Paid Employees: " + printTopPaid(3));
        System.out.println("Employee Count by Department: " + numberOfEmployeesByDepartment());
    }
}
