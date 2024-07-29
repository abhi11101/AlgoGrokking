package com.CodeHelp.C1_Arrays;

public class C2_ExtremePrint {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10};

        int start = 0;
        int end = arr.length - 1;

        while (!(start>end)){
            if (start==end){
                System.out.print(arr[start]);
            }else{
            System.out.print(arr[start] + " " + arr[end] + " ");}
            start++;
            end--;
        }

    }
}
