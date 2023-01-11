package com.Unacademy.ArraysAndFunction;

public class Negative_One_Side {
    public static void main(String[] args) {
        int arr[] = {-1,2,-3,67,-1,5};
        printArr(sort(arr,arr.length));
        approach2(arr);
        printArr(arr);
    }

    public static int[] sort(int arr[], int size){
        int index=0;
        int j =size-1;
        int res[] = new int[size];
        for (int x : arr){
            if (x>=0){
                res[j]=x;
                j--;
            }
            else {
                res[index]=x;
                index++;
            }
        }
        return res;
    }
   public static void approach2(int arr[]){
        int j=0;
        int temp=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<0){
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
   }
    public static void printArr(int arr[]){
        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
