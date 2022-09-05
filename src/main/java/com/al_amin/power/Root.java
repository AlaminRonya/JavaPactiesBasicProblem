package com.al_amin.power;

public class Root {
    public static int power(int a, int b){
        return (b == 0) ? 1 :  a * power(a, b-1);
    }
    public static int mod(int a, int b){
        return (b<0) ? -1 : a-((a/b)*b);
    }
    public static int div(int a, int b){
//        int count = 0;
//        int sum = b;
//        while (sum<=a){
//            count++;
//            sum += b;
//        }
//        return count;

        return (a<b) ? 0 : div(a, b+b)+1;
    }

    public static int sqrt(int i , int n){
        int a = i*i;
        if (a > n){
            return -1;
        }
        return (a == n) ? i : sqrt(++i, n);
    }

    public static int[] appendArray(int[] arr, int value){
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i< arr.length; i++){
            newArray[i] = arr[i];
        }
        newArray[newArray.length-1] = value;
        return newArray;
    }


    public static void main(String[] args) {
        int a = 2;
        int b = -1;
        int power = power(a, Math.abs(b));
        if (b<0){
            System.out.println(1/(double)power);
        }else {
            System.out.println(power);
        }

        System.out.println(mod(a,b));
        System.out.println(div(4,2));

        System.out.println(sqrt(1, 145));

        System.out.println("Array Append!");
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {2,3};
        for (int v: arr1){
            arr2 = appendArray(arr2, v);

        }
        System.out.print('[');
        for (int i = 0; i < arr2.length ; i++){
            System.out.print(arr2[i]);
            if ( i != arr2.length -1){
                System.out.print(", ");
            }

        }
        System.out.print("]\n");
    }
}
