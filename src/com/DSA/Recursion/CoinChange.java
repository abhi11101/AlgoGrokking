package com.DSA.Recursion;

public class CoinChange {
    public static void main(String[] args) {
    int[] arr = {3,5,7,8,9,10,11};
        System.out.println(find(arr,500,0));
    }

    private static int find(int[] arr , int sum, int current){
        if (sum==0)return 1;
        if (sum<0)return 0;
        int count=0;
      for (int i=current;i< arr.length;i++){
           count = count+find(arr,sum-arr[i], i);
      }
        return count;
    }
}
