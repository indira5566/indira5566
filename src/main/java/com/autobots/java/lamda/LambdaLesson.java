package com.autobots.java.lamda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLesson {
    public static void main(String[] args) {

        MathOperations addition = (a, b) -> a + b;
        MathOperations multi = (a, b) -> a * b;

        System.out.println("5 + 3 = " + addition.operation(5, 3));
        System.out.println("5 * 3 = " + multi.operation(5, 3));

        // он принимает любой объект и возвращает boolean значение
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println(isNotEmpty.test(""));  // false
        System.out.println(isNotEmpty.test("Java")); // true

        // принимает int и возвращает String
        Function<Integer, String> toStringFun = i -> "Число: " + i;
        System.out.println(toStringFun.apply(10));

        Consumer<String> print = s -> System.out.println("Writing: " + s);
        print.accept("Hello World");

    }
}


