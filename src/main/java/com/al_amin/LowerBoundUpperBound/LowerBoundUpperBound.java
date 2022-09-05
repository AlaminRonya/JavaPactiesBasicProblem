package com.al_amin.LowerBoundUpperBound;

import java.util.Arrays;
import java.util.List;

class LowerBoundUpperBound{
    public static void main(String[] args) {
        int a[] = {7, 7};

        int key = 6;
        int pos = Arrays.binarySearch(a, key);
        System.out.println(pos);
        System.out.println(~pos);


        int lb = (pos < 0) ? ~pos - 1 : getlb(pos, a);
        int ub = (pos < 0) ? ~pos : getUb(pos, a);

        System.out.println("Lower Bound=" + lb);
        System.out.println("Upper Bound=" + ub);

        // You can also try on a[] = {1 ,2 ,3 ,4 ,5 ,6};
        // For key=5, lb=3 and ub=5


    }

    private static int getlb(int pos, int[] a) {
        while (pos - 1 >= 0 && a[pos] == a[pos - 1]) pos--;
        return pos - 1;
    }

    private static int getUb(int pos, int[] a) {
        while (pos + 1 < a.length && a[pos] == a[pos + 1]) pos++;
        return pos + 1;

    }
}