package com.Unacademy.ArraysAndFunction;

public class ArrayWithZeroSum {
    public static void main(String[] args) {
        int arr[] = {-2,2,-3,4,-6,2,7};
        find(arr);
    }

    public static void find(int arr[]){
        int start =0;
        int end =0;
        for (int i =1;i<arr.length;i++){
            arr[i] += arr[i-1];
        }
        for (int i =0;i<arr.length;i++){
            if (arr[i]==0){
                end=i;
                break;
            }
        }
        System.out.println("Start " + start + "\n" + "End " + end);
    }
}
