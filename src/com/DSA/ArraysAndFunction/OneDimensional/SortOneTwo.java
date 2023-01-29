package com.DSA.ArraysAndFunction.OneDimensional;

public class SortOneTwo {
    public static void main(String[] args) {
        int arr[]  = {1,2,1,0,2,1,2,0,0,2};
        printArr(arr);
        sort(arr);
        printArr(arr);
    }

    public static int[] sort(int arr[]){
        int zero=0,one=0,two=0;
        int index =0;
        for (int x : arr) {
            if (x == 0) zero++;
            else if (x == 1) one++;
            else two++;
        }
        while (zero>0){
            arr[index]=0;
            zero--;
            index++;
        }
        while (one>0){
            arr[index]=1;
            one--;
            index++;
        }
        while (two>0){
            arr[index]=2;
            two--;
            index++;
        }
        return arr;
    }

    public static void printArr(int arr[]){
        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
