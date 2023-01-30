package com.DSA.BinarySearch;

public class PivotElement {
    public static void main(String[] args) {
    int[] arr= {1,7,3,6,5,6};
    find(arr);
    }
    public static void find(int nums[]){
        int[] sumLeft = new int[nums.length];
        sumLeft[0]=0;

        for(int i=1;i<nums.length;i++){
            sumLeft[i] = nums[i-1]+sumLeft[i-1];
     //       System.out.print(sumLeft[i]+" ");
        }
  //      System.out.println();

        int[] sumRight = new int[nums.length];
        sumRight[nums.length-1]=0;

        for(int i=nums.length-2;i>=0;i--){
            sumRight[i]=sumRight[i+1] + nums[i+1];
        }
     //   for (int x: sumRight) System.out.print(x+" ");
        for (int i=0;i<nums.length;i++){
            if (sumLeft[i]==sumRight[i]) {
                System.out.println(i);
                break;
            }
        }
    }
}
