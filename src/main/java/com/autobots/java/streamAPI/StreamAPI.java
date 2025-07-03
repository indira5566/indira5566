package com.autobots.java.streamAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {

        List<String> names = List.of("Anna", "Bob", "Alex", "Bella", "Andrew");

        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name.toUpperCase());
            }
        }
        System.out.println("---------");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
        System.out.println("____________________________________");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int r1 = 0;
        for (int num : numbers) {
            r1 += num;
        }
        System.out.println(r1);

        int total = numbers.stream()
                .mapToInt(num -> num)
                .sum();
        System.out.println(total);

        int totalElements = (int) numbers.stream()
                .count();
        System.out.println(totalElements);

        numbers.stream()
                .min(Integer::compare)
                .ifPresent(System.out::println);

        List<String> list = List.of("one", "owo", "three", "Hello", "four", "five", "six", "seven");
        list.stream()
                .filter(s -> s.length() > 3)
                .findFirst()
                .ifPresent(System.out::println);

        List<Employee> employees = List.of(
                new Employee(1, "Alice", 28, 3000, "IT"),
                new Employee(2, "Bob", 35, 4000, "HR"),
                new Employee(3, "Charlie", 40, 5000, "Finance"),
                new Employee(4, "David", 25, 3500, "IT"),
                new Employee(5, "Eva", 30, 4200, "Marketing"),
                new Employee(6, "Frank", 45, 6000, "Finance"),
                new Employee(7, "Grace", 32, 4100, "HR"),
                new Employee(8, "Henry", 29, 3900, "IT"),
                new Employee(9, "Isabel", 38, 4500, "Marketing"),
                new Employee(10, "Jack", 27, 3600, "IT")
        );
        List<Employee> itEmployees = employees.stream()
                .filter(s -> s.getDepartment().equals("IT"))
                .collect(Collectors.toList());
        System.out.println(itEmployees);


        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        employeesByDepartment.forEach((department, List) -> {
            System.out.println("Отдел " + department);
            List.forEach(System.out::println);
        });

    }
}

