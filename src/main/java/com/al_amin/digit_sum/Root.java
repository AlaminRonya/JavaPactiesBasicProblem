package com.al_amin.digit_sum;

public class Root {
    public static int digitSum(int n){
        int sum = 0;
        while (n>0){
            int t = n%10;
            n = n/10;
            sum +=t;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(digitSum(123));
    }
}
