package com.CodeHelp.C6_DivideAndConquerBacktracking;

public class C4_PermutationOfString {

    public static void main(String[] args) {

        permutation("abc");


    }

    public static void permutation(String str) {

        helperPermutation(str.toCharArray(),0);

    }

    public static void helperPermutation(char[] strArray, int index) {

        if (index==strArray.length){
            System.out.print(new String(strArray) + " ");
            return;
        }

        for (int i = index; i < strArray.length; i++) {

            swap(strArray,i,index);
            helperPermutation(strArray,index+1);
            swap(strArray,i,index);
        }


    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
