package com.Unacademy.ArraysAndFunction.OneDimensional;

import java.util.Arrays;

public class MinimizeHeightTwo {

    //https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
    public static void main(String[] args) {
        int arr[] = { 1,5,8,10 };
        height(arr,2,arr.length);
    }

    public static void height(int arr[],int k,int n){
        Arrays.sort(arr);
        int min =arr[0];
        int max=arr[n-1];
        int ans = max-min;
        for (int i=1;i<n;i++){
            System.out.println("I " + i);
            if (arr[i]-k<0){
                System.out.println("continue");
                continue;
            }

          if ((arr[0]+k)>(arr[i]-k)){
               min = arr[i]-k;
              System.out.println("Min " + min);
           }else {
              min=arr[0]+k;
          }

           if ((arr[n-1]-k)<(arr[i-1]+k)){
               max= arr[i-1]+k;
               System.out.println("Max " + max);
           }else {
               max=arr[n-1]-k;
           }
     /*       min = Math.min(arr[0]+k,arr[i]-k);
            System.out.println("Min " + min);
            max= Math.max(arr[n-1]-k,arr[i-1]+k);
            System.out.println("Max " + max);*/
           if (ans>(max-min)){
               ans = max-min;
               System.out.println("Ans " + ans);
           }
        }
        System.out.println(ans);
    }
}
