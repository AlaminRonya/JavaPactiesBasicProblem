package com.al_amin.frequency;

import java.util.*;

public class Solution {

    public static boolean isAnagram(String s, String t) {
        if(s==null || t==null)
            return false;

        if(s.length()!=t.length())
            return false;

        int[] arr = new int[26];
        String s1 = s.toLowerCase();
        String s2 = t.toLowerCase();

        for(int i=0; i<s.length(); i++){
            arr[s1.charAt(i)-'a']++;
            arr[s2.charAt(i)-'a']--;
        }

        for(int i: arr){
            if(i!=0)
                return false;
        }

        return true;
    }

    public static Map<Character, Integer> stringFrequency(String s){
        Map<Character, Integer> frq = new TreeMap<>();
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (frq.containsKey(c)){
                frq.replace(c, frq.get(c)+1);
            }else {
                frq.put(c, 1);
            }
        }
        return frq;
    }

    public static boolean anagram(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        Map<Character, Integer> characterIntegerMap = stringFrequency(s1);
        Map<Character, Integer> characterIntegerMap1 = stringFrequency(s2);
        for (Character c: characterIntegerMap.keySet()){
            if (characterIntegerMap1.containsKey(c)){
                if (!Objects.equals(characterIntegerMap.get(c), characterIntegerMap1.get(c))){
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println(isAnagram("aabb", "Abba"));
    }
}
