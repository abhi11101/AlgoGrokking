package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/valid-mountain-array/description/
 */
public class E49_ValidMountainArray_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {0,3,2,1};
        System.out.println(validMountainArray(arr));
        System.out.println(faster(arr));

        int[] arr2 = {2,0,2};
        System.out.println(validMountainArray(arr2));
        System.out.println(faster(arr2));
    }

    public static boolean faster(int[] arr){

        int inc =0;
        int dec = 0;
        int index = 1;

        while (index < arr.length && arr[index] > arr[index-1]){
            inc++;
            index++;
        }
        while (index < arr.length && arr[index] < arr[index-1]){

            dec++;
            index++;

        }

        return inc>0 && dec >0 && (inc+dec==arr.length-1);

    }
    public static boolean validMountainArray(int[] arr) {

        if(arr.length<3)return false;

        boolean increasing = false;
        boolean decreasing = false;

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i]<arr[i+1]){
                if (!decreasing)increasing = true;
                else return false;
            }
            else if (arr[i]>arr[i+1]){
                if (increasing)decreasing = true;
                else return false;
            }
            else {
                System.out.println("else");
                return false;
            }

        }
        return increasing && decreasing;

    }

}
