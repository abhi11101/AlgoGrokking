package com.CodeHelp.Extra;

public class E6_KadaneAlgo {

    public static void main(String[] args) {

        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int[] arr2 = {5,4,1,7,8};
        System.out.println(maximumSubArraySum(arr));

    }


    public static int maximumSubArraySum(int[] arr){

        int max_so_far =0;
        int max_ending_here =0;
        int start =0;
        int end = 0;
        int nextToNegative = 0;


        for (int i =0;i<arr.length;i++){

            max_ending_here += arr[i];

            if (max_so_far < max_ending_here){

                max_so_far = max_ending_here;
                start = nextToNegative;
                end = i;

            }
            if (max_ending_here<0){
                max_ending_here=0;
                nextToNegative=i+1;
            }

        }
        printArray(arr,start,end);
        return max_so_far;
    }

    public static void printArray(int[] arr, int start, int end){

        for (int i = start; i <= end; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
