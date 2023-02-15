package com.DSA.Recursion;

public class CountEvenLengthBinarySequencesWithSameSumOfFirstAndSecondHalfBits {
    public static void main(String[] args) {
        int n = 2;
        char[] arr = new char[2*n];
        find(0,0,arr,0,2*n-1);

    }

    private static void find(int leftSum, int rightSum, char[] arr, int i, int j){
     if (i>j){
         if (leftSum==rightSum){
         show(arr);}
         return;
     }
      //00
      arr[i]='0';
      arr[j]='0';
     find(leftSum,rightSum,arr,i+1,j-1);

     // For 01
      arr[i]='0';
      arr[j]='1';
      find(leftSum,rightSum+1,arr,i+1,j-1);

      // For 10
      arr[i]='1';
      arr[j]='0';
      find(leftSum+1,rightSum,arr,i+1,j-1);

      //For 11
      arr[i] ='1';
      arr[j]='1';
      find(leftSum+1,rightSum+1,arr,i+1,j-1);
    }
    private static void show(char[] arr){
        for (char c : arr){
            System.out.print(c);
        }
        System.out.println();
    }
}
