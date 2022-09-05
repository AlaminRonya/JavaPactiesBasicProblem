package com.al_amin.stack;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Root {

    public static void main(String[] args) {
        Stack<Integer> value = new Stack<>();
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i =1; i<10; i++){
            value.push(i);
            queue.add(i);
        }
        System.out.println(value.pop());
        System.out.println(value.peek());
        value.add(10);
        System.out.println(value);
        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
