package com.abhi.Chapter2;

public class SelectionSort {
    public static void main(String[] args) {
    int ques[] ={2,7,1,76,34,89};
     selectionSort(ques);
        for (int x: ques){
            System.out.print(x + " ");
        }
    }

    public static int[] selectionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int index =i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[index])index=j;
            }
            int smallest = arr[index];
            arr[index]=arr[i];
            arr[i]=smallest;
        }
        return arr;
    }
}
