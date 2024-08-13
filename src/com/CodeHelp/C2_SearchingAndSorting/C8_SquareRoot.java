package com.CodeHelp.C2_SearchingAndSorting;

public class C8_SquareRoot {

    public static void main(String[] args) {

        System.out.println(rootSquare(10));

    }

    public static double rootSquare(int num){

        int start = 0;
        int end = num;
        int mid;
        int ans=-1;
        while (start<=end){

            mid = start + (end-start)/2;

            if (mid*mid==num){
                return mid;
            }

            else if (mid*mid>num){

                end =mid-1;

            }else{
                ans= mid;
                start = mid+1;
            }
        }

        double step =0.1;
        double res = ans;

        for (int i = 0;i<2;i++){
            while (res * res <= num) {
                res += step;
            }
            res -= step; // Step back to the last valid point
            step /= 10;
        }
        return res;
    }

}
