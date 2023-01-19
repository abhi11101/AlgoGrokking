package com.Unacademy.ArraysAndFunction.OneDimensional;

public class AlternateSwap {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printArr(arr);
        swap(arr,arr.length);
        printArr(arr);
    }

    public static int[] swap(int arr[],int size){
        int count =0;
        int temp;
       while (count<size-1){
          //  System.out.println("Count " + count);
            temp =arr[count];
            arr[count] = arr[count+1];
            arr[count+1]= temp;
            count+=2;
        }
        // 2nd Approach
        /* for (int i=0;i<size-1;i++){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i++;
        }*/
        return arr;
    }

    public static void printArr(int arr[]){
        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
