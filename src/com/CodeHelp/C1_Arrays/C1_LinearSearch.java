package com.CodeHelp.C1_Arrays;

import java.util.Scanner;

public class C1_LinearSearch {

    public static void main(String[] args) {

        int[] arr = {1,5,2,9,24,8,92,69,55,732,42,87};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to be searched: ");
        int n = scanner.nextInt();

        for (int num : arr){
            if (num==n){
                System.out.println("Found");
            }
        }

    }
}
