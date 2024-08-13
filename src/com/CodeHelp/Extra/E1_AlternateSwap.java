package com.CodeHelp.Extra;

public class E1_AlternateSwap {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printArray(arr);
        swapAlternative(arr);
    }

    public static void swapAlternative(int[] data){

        int start = 0;
        while (start< data.length-1){

            int temp = data[start];
            data[start] = data[start + 1];
            data[start + 1] = temp;
            start+=2;
        }
        printArray(data);

    }

    private static void printArray(int[] arr) {

        for (int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();

    }

}
