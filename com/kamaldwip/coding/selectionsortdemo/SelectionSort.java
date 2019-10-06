package com.kamaldwip.coding.selectionsortdemo;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = {25, -45, 55, -2, 13, -25, 8, 32};
        System.out.println("Input Array is : "+ Arrays.toString(arr));
        doSelectionSort(arr);

    }

    private static void doSelectionSort(int[] arr) {

        for(int lastUnSortedIndex = arr.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex --){
            int largest = 0;
            for(int i = 1; i <= lastUnSortedIndex; i++){
                if(arr[i] > arr[largest]){
                    largest = i;
                }
            }
            if(largest == lastUnSortedIndex){
                System.out.println("Ignore.");
            } else {
                arr = swap(arr, largest, lastUnSortedIndex);
            }
            System.out.println("After an iteration : "+Arrays.toString(arr));
        }
        System.out.println("Sorted Array is : "+Arrays.toString(arr));
    }

    private static int[] swap(int[] arr, int posA, int posB) {
        System.out.println("Input numbers are : "+arr[posA]+" and "+arr[posB]);
            arr[posA] = arr[posA] + arr[posB];
            arr[posB] = arr[posA] - arr[posB];
            arr[posA] = arr[posA] - arr[posB];
        System.out.println("After swapping the numbers are : "+arr[posA]+" and "+arr[posB]);
        return arr;
    }
}
