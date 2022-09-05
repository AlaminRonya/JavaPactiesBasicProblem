package com.al_amin.length_of_longest_substring;

import java.util.HashSet;
import java.util.Set;

public class Solution {
//    private static Set<Character> characterSet = new HashSet<>();
    public int lengthOfLongestSubstring(String s) {
        Set<Character> characterSet = new HashSet<>();
        int i = 0, rm = 0, max = 0;
        StringBuilder str = new StringBuilder();
        for (i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            while (characterSet.contains(c)){
//                if (max <= characterSet.size()){
//                    System.out.println("===========>"+i);
//                    str = characterSet.toString();
//                }
                characterSet.remove(s.charAt(rm++));
            }
            characterSet.add(c);
            int a = Math.max(max, i - rm + 1);
            if (max < a){
                str.append(c);
                max = a;
            }

        }
        System.out.println(str);
        return max;
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println(new Solution().lengthOfLongestSubstring("abbacbb"));
    }
}
