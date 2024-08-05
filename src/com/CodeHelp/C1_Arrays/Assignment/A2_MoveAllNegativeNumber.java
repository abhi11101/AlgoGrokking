package com.CodeHelp.C1_Arrays.Assignment;

public class A2_MoveAllNegativeNumber {

    public static void main(String[] args) {

        int[] data = {1,6,9,-1,-6,-2,8,-6,4,3,-9};
        printArray(data);
//        move(data);
        orderPreserve(data);
    }

    public static void move(int[] data){

        int left = 0;
        int right = 0;

        while (right<data.length){

            if (data[right]<0){
                int temp = data[right];
                data[right] = data[left];
                data[left] = temp;
                left++;
                right++;
            }else {
                right++;
            }
        }
        printArray(data);


    }

    public static void orderPreserve(int[] data){

        for (int i = 1; i < data.length; i++) {

            int key = data[i];

            if (key<0){
                int j = i-1;
                while (j>=0 && data[j]>=0){

                    data[j+1] = data[j];
                    j--;
                }
                data[j+1] =key; // because while condition is failed so either j is -ve or data[j] is -ve, that's why j+1
            }
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
