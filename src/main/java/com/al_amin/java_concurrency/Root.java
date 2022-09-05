package com.al_amin.java_concurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Root {
    public static void main(String[] args) {
        executorInvoke();
        executorServiceInvoke();
    }
    private static void executorInvoke(){
        Executor invoke = new Caller();
        invoke.execute(()->System.out.println("Executor!"));
    }
    private static void executorServiceInvoke(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(()-> System.out.println("Executor Service"));
    }
}
