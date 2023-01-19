package com.Unacademy.ArraysAndFunction.OneDimensional;

public class CyclicallyRotateArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        rotate(arr);
        for (int x : arr){
            System.out.print(x + " ");
        }
    }

    public static void rotate(int arr[]){
        int current =0;
        int previous = arr[0];
        int last = arr.length-1;
        for (int i =1;i<=last;i++){
            if (i==last){
                    arr[0]=current;
                }
                else {
                current = arr[i];
                arr[i] = previous;
                previous = current;
            }
        }
    }
}
