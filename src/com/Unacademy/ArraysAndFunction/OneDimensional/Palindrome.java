package com.Unacademy.ArraysAndFunction.OneDimensional;

public class Palindrome {
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,1};
        System.out.println(palindrome(arr,arr.length));
    }

    public static boolean palindrome(int arr[],int size){
        for (int i =0;i<size/2;i++){
            if (arr[i] != arr[size-1-i])return false;
        }
        return true;
    }
}
