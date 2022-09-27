package com.al_amin.palindrome;
class Solution {
    public boolean isPalindrome(int x) {
        String msg = String.valueOf(x);
        int right = 0;
        int left = msg.length() - 1;

        while (right <= left){
            if (msg.charAt(right) != msg.charAt(left)){
                return false;
            }
            right++;
            left--;
        }
        return true;
    }
}
public class Root {
    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(121));
//        String msg = "12321";
//        int right = 0;
//        int left = msg.length() - 1;
//        boolean b = false;
//        while (right <= left){
//            if (msg.charAt(right) != msg.charAt(left)){
//                b = true;
//                break;
//            }
//            right++;
//            left--;
//        }
//        System.out.println(b);
    }
}
