package com.CodeHelp.C1_Arrays;

public class C6_PairSum {

    public static void main(String[] args) {

        int[] data = {1,2,3,4,5,6,7,8,9};
        int sum = 8;


        for (int i = 0; i < data.length; i++) {
            for (int j=i+1; j<data.length; j++) {

                if (data[i] + data[j] == sum) {
                    System.out.println("Pair is: " + data[i] + "," + data[j]);
                    break;
                }

            }
        }

    }

}
