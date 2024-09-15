package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/reverse-string/description/
 */
public class E69_ReverseString_LEETCODE {

    public static void main(String[] args) {

        char[] str1 = {'h','e','l','l','o'};
        printArray(str1);
        reverseString(str1);
        printArray(str1);

    }

    public static void reverseString(char[] s) {
        int start =0;
        int end = s.length-1;

        while(start<end){
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }

    public static void printArray(char[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
