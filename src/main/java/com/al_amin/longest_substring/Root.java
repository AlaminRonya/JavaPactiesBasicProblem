package com.al_amin.longest_substring;

import java.util.LinkedHashMap;
import java.util.Map;

public class Root {
    private static Map<Character, Integer> map = new LinkedHashMap<>();
    private static int m = Integer.MIN_VALUE;
    public static void longestSubstring(String s){
        char[] arr = s.toCharArray();
        String str ="";

        for (int i = 0; i< arr.length; i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i], i);
            }else {
                i = map.get(arr[i]);
                if (m < map.size()){
                    m = map.size();
                    str +=map.keySet();
                }
                map.clear();
            }

        }
        if (m < map.size()){
            m = map.size();
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        longestSubstring("abcabcbb");
        System.out.println(map.keySet());
        System.out.println(m);
    }
}
