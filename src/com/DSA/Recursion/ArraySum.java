package com.DSA.Recursion;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr ={1,2};
        System.out.println(sumFind(arr,arr.length,0));
    }

    public static int sumFind(int[] arr,int size, int i){
        if (i==size)return 0;
        int sum =  arr[i]+sumFind(arr,size,i+1);
        return sum;
    }
}
