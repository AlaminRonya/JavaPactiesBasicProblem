package com.al_amin.two_sum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> mapValue = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++){
            int value = target - arr[i];
            if (mapValue.containsKey(value)){
                result[0] = mapValue.get(value);
                result[1] = i;
                return result;
            }
            mapValue.put(arr[i], i);
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = twoSum(arr, 5);
        System.out.println("["+result[0] +","+result[1]+"]");

    }
}
