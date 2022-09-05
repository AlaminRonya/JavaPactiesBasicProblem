package com.al_amin.podits;

import java.util.Collections;
import java.util.PriorityQueue;

public class K_th_largest_and_smallest_number {
    public static int k_th_largest(int[] arr, int k){
        if (arr.length < k || k < 1){
            return -1;
        }


        //max heap
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++){
            queue.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++){

            //max heap
            if (queue.peek() > arr[i]){
                queue.poll();
                queue.add(arr[i]);
            }
        }
        return queue.peek();
    }
    public static int k_th_smallest(int[] arr, int k){
        if (arr.length < k || k < 1){
            return -1;
        }
        // min heap
        PriorityQueue<Integer> queue = new PriorityQueue<>();


        for (int i = 0; i < k; i++){
            queue.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++){

            // min heap
            if (queue.peek() < arr[i]){
                queue.poll();
                queue.add(arr[i]);
            }

        }
        return queue.peek();
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,4,5,6,8,9};
//        System.out.println(k_th_largest(arr,1));
//        System.out.println(k_th_largest(arr,2));
        System.out.println(k_th_largest(arr,4));
        System.out.println(k_th_smallest(arr,4));
    }
}
