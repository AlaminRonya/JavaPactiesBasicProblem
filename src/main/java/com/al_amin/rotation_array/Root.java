package com.al_amin.rotation_array;

public class Root {
    public static void rotationRightShift(int[] arr){
        int temp = arr[arr.length-1];
        for (int i = arr.length-2; i >=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
    public static void rotationLeftShift(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotationRightShift(arr);
        for (Integer item : arr){
            System.out.print(item+",");
        }
        System.out.println();
        int[] arr1 = {1,2,3,4,5};
        rotationLeftShift(arr1);
        for (Integer item : arr1){
            System.out.print(item+",");
        }

    }
}
