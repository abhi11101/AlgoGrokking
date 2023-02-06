package com.DSA.Sorting.BubbleSort;

public class BubbleSortCode {
    public static void main(String[] args) {
        int[] arr= {7,3,8,2,0,3,56,1,574,4};
        show(arr);
        sort(arr,arr.length);
        show(arr);
    }

    public static void sort(int[] arr,int n){
        boolean swap=false;
        for(int i=1;i<n;i++){
            for (int j=0;j<n-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if (swap==false)break;
        }
    }

    public static void show(int[] arr){
        for (int x : arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
