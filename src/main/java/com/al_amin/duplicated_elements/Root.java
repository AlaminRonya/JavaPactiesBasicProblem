package com.al_amin.duplicated_elements;

import java.util.HashMap;
import java.util.Map;

public class Root {
    private static final Map<Integer, Integer> duplicatedValue = new HashMap<>();
    static void duplicated(int[] arr){
        for (int ar : arr) {
            if (duplicatedValue.containsKey(ar)) {
                duplicatedValue.replace(ar, duplicatedValue.get(ar) + 1);
            } else {
                duplicatedValue.put(ar, 1);
            }
        }
    }
    public static void main(String[] args) {
        Map.Entry<Integer, Integer> maxValue = null;
        int[] arr = {1,2,3,3,3,2,4,4,4,4,4,4,4,4};
        duplicated(arr);
        for(Map.Entry<Integer, Integer> value:duplicatedValue.entrySet())
        {
            if (maxValue == null || value.getValue().compareTo(maxValue.getValue()) > 0) {
                maxValue = value;
            }
        }
        for(Map.Entry<Integer, Integer> value:duplicatedValue.entrySet())
        {
            if (maxValue.getValue().equals(value.getValue()) ){
                System.out.println(value.getKey()+" : "+value.getValue());
            }
        }



        System.out.println(duplicatedValue);
        assert maxValue != null;
        System.out.println(maxValue.getKey()+" ==> "+maxValue.getValue());
    }
}
