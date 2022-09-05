package com.al_amin.podits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BinarySearch {
    public static int findByElement(int[] arr, int low, int high, int k){
        if (high >= low){
            int mid = low + (high - low) / 2;
            if (arr[mid] == k)
                return mid;
            if (arr[mid] > k)
                return findByElement(arr, low, mid - 1, k);
            return findByElement(arr, mid + 1, high, k);
        }
        return -1;

//        if (low > high){
//            return -1;
//        }
//        int mid = (low  + high ) / 2;
//        if (arr[mid]==k){
//            return mid;
//        }else if (arr[mid] < k){
//            findByElement (arr, mid+1, high, k);
//        }else {
//            findByElement (arr, low, mid-1, k);
//        }
//        return -1;
    }
    public static Map<Integer, Integer> searchElement(int[] arr, int[] key){
//        int index = -1;
        Map<Integer, Integer> container = new HashMap<>();
        for (Integer k: key){
            container.put(k, -1);
        }
        for (int i = 0; i < arr.length; i++){
            if (container.containsKey(arr[i]) && container.get(arr[i]) == -1){
                container.replace(arr[i], i);
            }
        }
        return container;

//        while (low <= high) {
//            int mid = low  + ((high - low) / 2);
//            if (arr[mid] < key) {
//                low = mid + 1;
//            } else if (arr[mid] > key) {
//                high = mid - 1;
//            } else if (arr[mid] == key) {
//                index = mid;
//                break;
//            }
//        }
//        return index;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] s1 = s.split(" ");
        int n = Integer.parseInt(s1[0]);
        int testCase = Integer.parseInt(s1[1]);

//        int n = br.read();
//        int testCase = br.read();
        String a = br.readLine();
        String[] s2 = a.split(" ");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(s2[i]);
        }

        while (testCase-- > 0) {
            int k = Integer.parseInt(br.readLine());
            System.out.println(findByElement(arr, 0, arr.length-1, k));
        }


//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int t = scanner.nextInt();
//        int[] arr = new int[n];
//
//        for (int i = 0; i < n; i++){
//            arr[i] = scanner.nextInt();
//        }
//        int[] key = new int[t];
//        for (int i = 0; i<t; i++){
//            key[i] = scanner.nextInt();
//        }
//        Map<Integer, Integer> map = searchElement(arr, key);
//        for (int i = 0; i < t; i++){
//            System.out.println(map.get(key[i]));
//        }


//        System.out.println(map);
//        while (t > 0){
//
//            int k = scanner.nextInt();
//            long startTime = System.nanoTime();
//            System.out.println(searchElement(arr, k));
//            System.out.println("Time: "+(System.nanoTime() - startTime));
//            t--;
//        }

    }
}
