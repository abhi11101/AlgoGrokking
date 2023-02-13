package com.DSA.Recursion;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {1,2,9,4,5,6};
        System.out.println(maxFind(arr,0,arr[0]));
        System.out.println(minFind(arr,0,arr[0]));
    }

    private static int maxFind(int[] arr, int i, int max){
        if (i==arr.length)return max;
        if (max<arr[i])max=arr[i];
        return maxFind(arr,i+1,max);
    }
    private static int minFind(int[] arr, int i, int min){
        if (i==arr.length)return min;
        if (min>arr[i])min=arr[i];
        return minFind(arr,i+1,min);
    }
}
