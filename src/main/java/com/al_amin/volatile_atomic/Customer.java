package com.al_amin.volatile_atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Customer {
//    private static volatile int idCounter = 0;
    private static AtomicInteger idCounter = new AtomicInteger(0);
    private final int id;
    private final int v;
    public Customer(){
//        id = idCounter++;
//        id = getAndIncrementId();
        v = idCounter.get();
        id = idCounter.incrementAndGet();
    }
//    private synchronized int getAndIncrementId(){
//        return idCounter++;
//    }

    public static void main(String[] args) {
        System.out.println(new Customer().v+"\t"+new Customer().id+"\t"+idCounter);
        System.out.println(new Customer().v+"\t"+new Customer().id+"\t"+idCounter);
        System.out.println(new Customer().v+"\t"+new Customer().id+"\t"+idCounter);
    }
}
