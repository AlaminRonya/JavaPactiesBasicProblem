package com.al_amin.insertion_sort;

public class Root {
    public static void insertionSort(int[] arr){
        int item;
        int j =0;
        int c = 0;
        for (int i = 1; i< arr.length; i++){
            item = arr[i];
            j = i -1;
            while ( j>=0 && arr[j]>item ){
                arr[j+1] = arr[j];
                j--;
                c++;
            }
            arr[j+1] = item;
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);
        for (Integer a: arr){
            System.out.print(a+",");
        }

        System.out.println();

    }
}
