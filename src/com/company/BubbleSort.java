package com.company;

public class BubbleSort {

    public void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1])          // zmiana > na < sprawia revert sort
                {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println(arr[j]);
                }
            }
    }
    }
    public void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
