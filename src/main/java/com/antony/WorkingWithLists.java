package com.antony;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        //list declaration
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        colors.add("grey");

        //printing on the console
        colors.forEach(System.out::println);

        //immutable list: they cannot be modified
        List<String> animals = List.of(
                "dog",
                "cat"
        );

        animals.forEach(System.out::println);
    }
}
