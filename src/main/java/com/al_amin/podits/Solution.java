package com.al_amin.podits;

import java.util.Scanner;

public class Solution {
    public static double triangleOfArea(int a, int b, int c, double d){
        return 0.5*b*c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while (n > 0){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            double d = scanner.nextDouble();
            System.out.println(triangleOfArea(a,b,c,d));
            n--;
        }

//        System.out.println(triangleOfArea(1,1,1,0.5));
    }
}
