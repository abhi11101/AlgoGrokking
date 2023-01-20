package com.Unacademy.ArraysAndFunction.OneDimensional;

public class MinimumSwap {
    public static void main(String[] args) {
        int arr[] = {2,1,5,6,3};
        find(arr,3);
    }

    public static void find(int arr[], int k){
        int count=0;
        int res=arr.length;
        int bad=0;
        for(int x : arr){
            if (x<=k){
                count++;
            }
        }
        for(int i=0;i<=arr.length-count;i++){
            bad=0;
            for (int j=i;j<i+count;j++){
               if(arr[j]>k)bad++;
               if (bad<res)res=bad;
                System.out.println("Bad " + bad + " Res " + res);
            }
        }
        System.out.println(res);
    }
}
