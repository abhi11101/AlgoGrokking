package com.CodeHelp.C1_Arrays;

public class C7_Sort_0_1 {

    public static void main(String[] args) {
        int[] data = {0,1,1,0,1,0,0,0,1,0,1,0,1,1,1};
        printArray(data);
        System.out.println();
//        bruteForce(data);

//        twoPointerMethod(data);

        anotherPointerMethod(data);
    }

    public static void twoPointerMethod(int[] data){

        int i=0;
        int j = data.length-1;
        int temp=0;

        while (i!=j){

            if (data[i]==0)i++;
            if (data[j]==1)j--;
            if (data[i]==1 && data[j]==0){

                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
                j--;

            }

        }
        printArray(data);

    }

    public static void anotherPointerMethod(int[] data){

        int start =0;
        int end = data.length-1;
        int i =0;
        int temp;
        while (start<end){

            if (data[i]==0){
                temp = data[i];
                data[i] = data[start];
                data[start] = temp;
                i++;
                start++;
            }
            if (data[i]==1){

                temp = data[i];
                data[i] = data[end];
                data[end] = temp;
                end--;

            }

        }
        printArray(data);

    }

    public static void bruteForce(int[] data){

        int num_one = 0;
        int num_zero=0;

        for (int num: data){
            if (num == 0){
                num_zero++;
            }
            else{
                num_one++;
            }
        }

        int[] res = new int[data.length];
        int index = 0;
        while(num_zero>0){
            res[index++] = 0;
            num_zero--;
        }
        while(num_one>0){
            res[index++] = 1;
            num_one--;
        }
        printArray(res);
    }

    private static void printArray(int[] data){
        for (int num: data){
            System.out.print(num + " ");
        }
    }
}
