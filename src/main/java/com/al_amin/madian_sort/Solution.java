package com.al_amin.madian_sort;

import java.util.Arrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double sum = Arrays.stream(nums1).sum();
        sum += Arrays.stream(nums2).sum();
        System.out.println(sum+":"+(nums1.length+nums2.length));

        return sum/(nums1.length+nums2.length);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }
}
