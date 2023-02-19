package com.DSA.Recursion;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 1 ,3 ,9 ,7};
        sort(arr,0,arr.length-1);
        show(arr);
    }

    private static void sort(int[] arr, int l, int r){
        if (l>=r)return;
        int mid = l +(r-l)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr,l,r);
    }

    private static void merge(int[] arr, int l ,int r){
        int mid = l +(r-l)/2;
        int len1 = mid-l+1;
        int len2=r-mid;
        int [] a = new int[len1];
        int[] b = new int[len2];
        int index =l;
        for (int i=0;i<len1;i++){
            a[i]=arr[index++];
        }
        index=mid+1;
        for (int i=0;i<len2;i++){
            b[i]=arr[index++];
        }

        int index1=0;
        int index2=0;
        index=l;
        while (index1<len1 && index2<len2){
            if (a[index1]<b[index2]){
                arr[index++]=a[index1++];
            }
            else {
                arr[index++]= b[index2++];
            }
        }
        while (index1<len1){
            arr[index++]=a[index1++];
        }
        while (index2<len2){
            arr[index++]=b[index2++];
        }
    }
    private static void show(int[] ans){
        for (int x: ans){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
