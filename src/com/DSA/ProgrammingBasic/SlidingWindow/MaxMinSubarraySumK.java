package com.DSA.ProgrammingBasic.SlidingWindow;

import java.util.ArrayList;

public class MaxMinSubarraySumK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        find(arr,3);
      //  approach2(arr,3);
    }

    public static void find(int arr[], int k){
        int sum=0;
        int max;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<k;i++){
            sum+=arr[i];
        }
        list.add(sum);
        max=sum;
        int first=0;
        int second=k-1;
        for (int i=0, j=k;j<arr.length;i++,j++){
            sum=sum+arr[j]-arr[i];
            list.add(sum);
            if(sum>max){
                max=sum;
                first=i+1;
                second=j;
            }
        }
        for(int x: list){
            System.out.print(x + " ");
        }
        System.out.println("Max " + max + " Start " + first + " Second " + second);
    }
    public static void approach2(int[] arr, int k){
        int i=0,j=0,max=0,sum=0;
        while (j<arr.length){
            sum +=arr[j];

            if((j-i+1)==k){
                if (sum>max)max=sum;
                sum = sum -arr[i];
                j++;
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println("Max " + max);
    }
}
