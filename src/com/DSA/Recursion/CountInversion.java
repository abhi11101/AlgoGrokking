package com.DSA.Recursion;

public class CountInversion {
    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        System.out.println(sort(arr,0,arr.length-1));
    }

    private static int sort(int[] arr, int start, int end){
        int count=0;
        if (start<end){
        int mid = start+(end-start)/2;
        count+=sort(arr,start,mid);
        count+=sort(arr,mid+1,end);
        count+=merge(arr,start,end);}
        return count;
    }

    private static int merge(int[] arr, int start, int end){
        int mid = start+(end-start)/2;
        int len1= mid-start+1;
        int len2 = end-mid;
        int count=0;
        int[] a = new int[len1];
        int[] b= new int[len2];
        int index =start;
        for (int i=0;i<len1;i++){
            a[i]=arr[index++];
        }
        for (int i=0;i<len2;i++){
            b[i]=arr[index++];
        }
        index=start;
        int index1=0,index2=0;
        while (index1<len1 && index2<len2){
            if (a[index1]<b[index2]){
                arr[index++]=a[index1++];
            }else{
                arr[index++]=b[index2++];
                count+=len1-index1;
            }

        }
        while (index1<len1){
            arr[index++]=a[index1++];
        }
        while (index2<len2){
            arr[index++]=b[index2++];
        }
        return count;
    }
}
