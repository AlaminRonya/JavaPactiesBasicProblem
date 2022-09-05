package com.al_amin.two_array_sum;

public class Solution {
    public static int[] addTwoNumbers(int[] ar1, int[] ar2){
        int l = Math.max(ar1.length, ar2.length);
        int[] newArray = new int[l+1];

        int tem = 0;
        for (int i = 0; i<l; i++){
            int a1 = 0;
            int a2 = 0;
            if (i < ar1.length){
                a1 = ar1[i];
            }
            if (i < ar2.length){
                a2 = ar2[i];
            }
            a1 = a1+a2+tem;
            tem = (a1>9) ? 1:0;

            newArray[i] = a1 %10;

        }
        newArray[l] = tem;
        return newArray;
    }

    public static void main(String[] args) {
        int[]l1 = new int[]{9,9,9,9,9,9,9};
        int[] l2 = new int[]{9,9,9,9};
        int[] result = addTwoNumbers(l1, l2);
        for (Integer a: result){
            System.out.print(a+" ");
        }
    }
}
