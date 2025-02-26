package org.example;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    private static final List<Employee> employees = List.of(
            new Employee("John Doe", "IT", 90000),
            new Employee("Jane Smith", "HR", 85000),
            new Employee("Alice Johnson", "IT", 78000),
            new Employee("Bob Brown", "Marketing", 67000),
            new Employee("Mike Davis", "IT", 93000),
            new Employee("Julia Miller", "HR", 74000));
    public static void main(String[] args) {
        averageSalary();
        findByDepartment("IT");
        highestSalary();
        topPaid(3);
        numOfEmployeesByDep();
        //averegeSalary
        //findByDepartment(department)
        //EmployeewithHighetsSalary
        // topPaid(int num)
        // number of employees by department

    }

    private static void averageSalary(){
        Double average = employees.stream().map(Employee::salary).reduce((double) 0, Double::sum)/employees.size();
        double asDouble = employees.stream().mapToDouble(Employee::salary).average().getAsDouble();
        Path path = Paths.get() Paths
        System.out.println(asDouble);
    }

    private static void findByDepartment(String deparment){
        List<Employee> list = employees.stream().filter(employee -> employee.department().equals(deparment)).toList();
        list.forEach(System.out::println);
    }

    private static void highestSalary(){
        Employee employee = employees.stream().max(Comparator.comparingDouble(Employee::salary)).get();
        System.out.println(employee);
    }
    private static void topPaid(int num){
        List<Employee> list = employees.stream().sorted((emp1,emp2)-> -Double.compare(emp1.salary(),emp2.salary())).limit(num).toList();
        list.forEach(System.out::println);
    }

    private static void numOfEmployeesByDep(){
        Map<String, Integer> employeesByDep = new HashMap<>();

        employees.stream().forEach(employee -> {
            employeesByDep.put(employee.department(), employeesByDep.getOrDefault(employee.department(), 0)+1);
        });

        employeesByDep.keySet().forEach(key->{
            System.out.println(key+" "+employeesByDep.get(key));
        });
    }
}
