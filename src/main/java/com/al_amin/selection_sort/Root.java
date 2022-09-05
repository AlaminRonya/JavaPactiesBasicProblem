package com.al_amin.selection_sort;

public class Root {
    public static void selectionSort(int[] arr){
        for (int i = 0; i< arr.length-1; i++){
            int indexMin = i;
            for (int j = i+1; j< arr.length; j++){
                if (arr[j] > arr[indexMin]){
                    indexMin = j;
                }
            }
            if (i != indexMin){
                int temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,2,1};
        selectionSort(arr);
        for (Integer a: arr){
            System.out.print(a+",");
        }
        System.out.println();
    }
}
