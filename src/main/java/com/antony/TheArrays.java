package com.antony;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));


        //traditional for loop
       for(int i =0; i< colors.length; i++){
           System.out.println(colors[i]);
       }
        System.out.println("\n Enhanced for loop");

       //enhanced for loop
        for(String color : colors){
            System.out.println(color);
        }

        //using streams
        Arrays.stream(colors).forEach(System.out::println);


    }
}
