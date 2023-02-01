package com.DSA.ProgrammingBasic.SlidingWindow;

import java.util.ArrayList;

public class FirstNegativeSizeK {
    public static void main(String[] args) {
        int[] arr ={1,-2,3,-4,5,-6,7,-8,9,10,11};
        find(arr,3);
    }
    public static void find(int arr[], int k){
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while (j<arr.length){
            if (arr[j]<0){
                list.add(arr[j]);
            }
            if (j-i+1<k){
                j++;
            }else if (j-i+1==k){
                if (list.size()==0) {
                    System.out.println("0");
                    j++;
                    i++;
                }
                else{
                    System.out.print(list.get(0) + " ");
                    if(arr[i]==list.get(0))
                    {list.remove(0);}
                    i++;
                    j++;
                }
            }
        }
    }
}
