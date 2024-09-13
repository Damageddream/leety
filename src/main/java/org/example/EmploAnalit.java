package org.example;

import java.util.*;

public class EmploAnalit {
    private static final List<Employee> employees = List.of(
            new Employee("John Doe", "IT", 90000),
            new Employee("Jane Smith", "HR", 85000),
            new Employee("Alice Johnson", "IT", 78000),
            new Employee("Bob Brown", "Marketing", 67000),
            new Employee("Mike Davis", "IT", 93000),
            new Employee("Julia Miller", "HR", 74000)
    );

    public static double averageSalary() {
        Integer reduce = employees.stream().map(Employee::getSalary)
                .reduce(0, Integer::sum);

        return Math.round((double) reduce / employees.size());
    }

    public static List<Employee> findByDepartment(String department) {
        return employees.stream().filter(emp -> emp.getDeparment().equals(department)).toList();
    }

    public static Employee findEmployeeWithHighestSalary() {
        Optional<Employee> max = employees.stream().max(Comparator.comparingInt(Employee::getSalary));
        return max.orElse(null);
    }

    public static List<Employee> printTopPaid(int number) {
        return employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(number).toList();
    }

    public static Map<String, Long> numberOfEmployeesByDepartment() {
        Map <String, Long> numOfEmployeesByDepartment =  new HashMap<>();
        employees.forEach(e -> {
            numOfEmployeesByDepartment.put(e.getDeparment(), numOfEmployeesByDepartment.getOrDefault(e.getDeparment(), 0L)+1);
        });
        return numOfEmployeesByDepartment;
    }

    public static void main(String[] args) {
        System.out.println("Average salary: " + averageSalary());
        System.out.println("Department Employees: " + findByDepartment("IT"));
        System.out.println("Highest Paid Employee: " + findEmployeeWithHighestSalary());
        System.out.println("Top Paid Employees: " + printTopPaid(2));
        System.out.println("Employee Count by Department: " + numberOfEmployeesByDepartment());
    }
}
