package com.al_amin.dynamic_array_insert;

public class Root {

    public static int[] insert(int[] arr , int value){
        int[] newArray = new int[arr.length+1];
//        System.arraycopy(arr, 0, newArray, 0, arr.length);
        for (int i = 0; i < arr.length; i++){
            newArray[i] = arr[i];
        }
        newArray[arr.length] = value;

        return newArray;
    }
    public static void main(String[] args) {
        int[] ar = new int[0];
        ar = insert(ar, 1);
        ar = insert(ar, 2);
        ar = insert(ar, 2);
        ar = insert(ar, 1);
        for (int a: ar){
            System.out.println(a);
        }
    }
}
