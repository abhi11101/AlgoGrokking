package com.Unacademy.ArraysAndFunction.OneDimensional;

public class MinimumSwap {
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,3};
        find(arr,3);
    }

    public static void find(int[] arr, int k){
        int res;
        int bad=0;
        int ws=0;
        for (int x : arr){
            if (x<=k)ws++;
        }
        for (int i=0;i<ws;i++){
            if (arr[i]>k)bad++;
        }
        res=bad;
        for(int i=0, j=ws;j<arr.length;j++,i++){
            if (arr[i]>k)bad--;
            System.out.println("Bad i" + bad + " arr[" +i+"] " + arr[i]);
            if (arr[j]>k)bad++;
            System.out.println("bad j " + bad + "arr["+j+"] "+ arr[j]);
            if (res>bad)res=bad;
        }

        System.out.println(res);

    }
}
