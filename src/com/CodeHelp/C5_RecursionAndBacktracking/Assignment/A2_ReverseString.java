package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

public class A2_ReverseString {

    public static void main(String[] args) {

        String ip = "abcd";
        System.out.println(reverseString(ip.toCharArray(),0,ip.length()-1));

    }

    public static String reverseString(char[] arr, int start ,int end) {

        if (start>=end){
            return new String(arr);
        }

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        return reverseString(arr,start+1,end-1);

    }

}
