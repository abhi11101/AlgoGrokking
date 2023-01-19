package com.Unacademy.ArraysAndFunction.OneDimensional;

import java.util.Arrays;

public class MinimumPlatform {
    public static void main(String[] args) {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};//{900 ,1100 ,1235};//
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};//{1000 ,1200 ,1240};//
        find(arr,dep,arr.length);
    }

    public static void find(int arr[], int dep[], int n){
        int platform=1;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1,j=0;
        int max=0;
        while (j<n && i<n){
            if (arr[i]<=dep[j]) {
                platform++;
                i++;
            }
            else {
                platform--;
                j++;
            }
            if (platform>max)max=platform;
        }
        System.out.println(max);
    }
}
