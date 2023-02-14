package com.DSA.Recursion;

public class OptimalGameStrategy {
    public static void main(String[] args) {
        int[] arr = {8, 15, 3, 7};
        System.out.println(find(arr,0,arr.length-1));
    }

    public static int find(int[] arr, int i, int j){
        if (i>j)return 0;

        int choice1 = arr[i]+ Math.min(find(arr,i+2,j),find(arr,i+1,j-1));
        int choice2 = arr[j] + Math.min(find(arr,i+1,j-1),find(arr,i,j-2));
        return Math.max(choice1,choice2);
    }
}
