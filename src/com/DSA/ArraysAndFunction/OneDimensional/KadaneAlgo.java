package com.DSA.ArraysAndFunction.OneDimensional;

public class KadaneAlgo {
    public static void main(String[] args) {
        int arr[] = {-2,1,3,-4,-9,-1,4,-2,21,-3};
        System.out.println(longestSum(arr));
    }

    public static int longestSum(int arr[]){
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here =0;
        int s =0;
        int start =0, end=0;
        for (int i=0 ; i< arr.length; i++){
            max_ending_here +=arr[i];
            if (max_so_far<max_ending_here){
                max_so_far = max_ending_here;
                end=i;
                start =s;
            }

            if (max_ending_here<0){
                max_ending_here=0;
                s= i+1;
            }
        }
        System.out.println("Start " + start);
        System.out.println("End " + end);
        return max_so_far;
    }
}
