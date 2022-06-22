package com.antony;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {

        Queue<People> supermarket = new LinkedList<>();
        supermarket.add(new People("jane", 21));
        supermarket.add(new People("tony", 21));
        supermarket.add(new People("grace", 34));
        supermarket.add(new People("grace", 34));

        System.out.println(supermarket.peek());
        System.out.println();
        System.out.println(supermarket.poll());
        System.out.println();
        System.out.println(supermarket.size());

    }

    //used to declare a special class type that acts as a “data carrier” i.e. model class or POJO class
     record People(String name, int age){}

   
}


