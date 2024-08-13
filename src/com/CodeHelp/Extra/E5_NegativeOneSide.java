package com.CodeHelp.Extra;

public class E5_NegativeOneSide {

    public static void main(String[] args) {

        int[] data = { 1,-4,6,98,-3,-21,12,11,-86};
        printArray(data);
//        negativeOneSide(data);
        anotherWay(data);
    }

    public static void negativeOneSide(int[] data) {

        int start =0;
        int end = data.length-1;
        int index =0;

        while(index < end) {

            if (data[index]<0){

                int temp = data[index];
                data[index] = data[start];
                data[start] = temp;
                index++;
                start++;
            }else {
                int temp = data[index];
                data[index] = data[end];
                data[end] = temp;
                end--;

            }
        }
        printArray(data);

    }

    public static void anotherWay(int[] data) {

        int j =0;
        for(int i=0;i<data.length;i++){

            if (data[i]<0){

                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                j++;

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
