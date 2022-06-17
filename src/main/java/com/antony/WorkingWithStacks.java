package com.antony;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {

        //Declaration
        Stack<Integer> stack = new Stack<>();

        //adding items
        stack.push(1);
        stack.push(2);

        //stack methods
        System.out.println(stack.peek()); //returns the last item added to the stack
    }
}
